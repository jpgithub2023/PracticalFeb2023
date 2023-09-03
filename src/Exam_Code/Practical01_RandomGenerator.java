package Exam_Code;

import java.util.Random;

public class Practical01_RandomGenerator {
	
//	Practical 1: Generate 500 random numbers and print the nth smallest number in a programming language of your choice. 
//	(Ask user for the Nth smallest number)

	public static void main(String[] args) {

		int counter;
		int[] myArray = new int[500];// defining size of array, and dynamically allocate them later in the for loop
		Random rnum = new Random();
		System.out.println("Random Numbers:");
		System.out.println("***************");

		for (counter = 0; counter < 500; counter++) {
			myArray[counter] = rnum.nextInt(1000);// maximum number range
			System.out.println(myArray[counter]);

		}
		System.out.println("---------------------------");
		System.out.println("Smallest Number is:  " + sortArrayAsc(myArray));

	}

	public static int sortArrayAsc(int newAaray[]) {

		int temp;
		for (int i = 0; i < newAaray.length; i++) {
			for (int j = i + 1; j < newAaray.length; j++) {
				if (newAaray[i] > newAaray[j]) {
					temp = newAaray[i];
					newAaray[i] = newAaray[j];
					newAaray[j] = temp;

				}
			}
			System.out.println(newAaray[i]);
		}

		return newAaray[0];
	}

}
