package _01_Simple_Array_Algorithms;

import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.

public static void main(String[] args) {
	
	
	
	
		
	
	
}

    //2. Write a method that takes an array of Strings and prints all the Strings in the array.

void Printer(String[] strings) {
	String print = "";
	for (int i = 0; i < strings.length; i++) {
		print = print + ", " + strings[i];
	}
	System.out.println(print);
}

    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
void BackwardsPrinter(String[] BackwardStrings) {
	String print = "";
	for (int i = 0; i < BackwardStrings.length; i++) {
		print = print + ", " + BackwardStrings[50 - i];
	}
	System.out.println(print);
}


    //4. Write a method that takes an array of Strings and prints every other String in the array.
void Otherprinter(String[] Otherstrings) {
	String print = "";
	for (int i = 0; i < Otherstrings.length; i++) {
		if(i % 2 == 0) {
			print = print + ", " + Otherstrings[i];
		}
	}
	System.out.println(print);
}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.


}
