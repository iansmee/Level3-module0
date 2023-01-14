package _00_Intro_To_Arrays;

import java.util.Iterator;
import java.util.Random;

public class _01_IntroToArrays {
    public static void main(String[] args) {
        // 1. declare and Initialize an array 5 Strings
String[] things= new String[5];
things[0] = "0";
things[1] = "1";
things[2] = "2";
things[3] = "3";
things[4] = "4";
        // 2. print the third element in the array

        // 3. set the third element to a different value

        // 4. print the third element again

        // 5. use a for loop to set all the elements in the array to a string
        //    of your choice
for (int i = 0; i < things.length; i++) {
	things[i] = "e";
}
        // 6. use a for loop to print all the values in the array
        //    BE SURE TO USE THE ARRAY'S length VARIABLE
for (int i = 0; i < things.length; i++) {
//	System.out.println(things[i]);
}
        // 7. make an array of 50 integers
int[] numbers = new int[50];
        // 8. use a for loop to make every value of the integer array a random
        //    number
Random ran = new Random();


for (int i = 0; i < numbers.length; i++) {
	numbers[i] = ran.nextInt(50);
}
        // 9. without printing the entire array, print only the smallest number
        //    on the array
int small = numbers[0];
for (int i = 0; i < numbers.length; i++) {
	
	if(numbers[i]<small) {
		small = numbers[i];
	}
	
}


        // 10 print the entire array to see if step 8 was correct

        // 11. print the largest number in the array.
int large = numbers[0];
for (int i = 0; i < numbers.length; i++) {
	if(numbers[i]>large) {
		large = numbers[i];
	}
}
System.out.println(large);
        // 12. print only the last element in the array
int high = 0;
for (int i = 0; i < numbers.length; i++) {
	
	if(i>high) {
		high = i;
	}
}
System.out.println(high);








    }
}
