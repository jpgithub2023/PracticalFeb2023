package Exam_Code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Practical02_Part_A_and_B {

	public static void main(String[] args) {
		String Path = "data/Dictionary.txt";
		doesFileExist(Path);
		readTextFile(Path);
	}

	public static void doesFileExist(String path) {

		try {
			File f = new File(path);
			if (f.exists()) {
				System.out.println("File Exists");
				System.out.println();
				System.out.println("----------------------------------------");;
			} else {
				System.out.println("File does not Exists");
				
			}
			FileReader fr = new FileReader(f);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void readTextFile(String path) {

		try {
			File f = new File(path);
			FileReader fr = new FileReader(f);
			BufferedReader w = new BufferedReader(fr);

			// System.out.println(w.readLine());//This will print out only one line at a
			// time

			String line = null; // This will print out all the lines in the text//

			while ((line = w.readLine()) != null) {
				String[] words = line.split("[-,]+"); // will split the line wherever it finds a hyphen or comma and store
													// them in a String array

				for (int i = 0; i < words.length; i++) {
					System.out.println(words[i].trim());
					System.out.println();

				}

			}
			w.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
