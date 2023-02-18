/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
        int UpCowRow = 0;
        int UpCowCol = 0;
        int DownCowRow = 0;
        int DownCowCol = 0;
        int LeftCowRow = 0;
        int LeftCowCol = 0;
        int RightCowRow = 0;
        int RightCowCol = 0;
        int up = 0;
        int down = 0;
        int left = 0;
        int right = 0;
    	
    	for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[i].length; j++) {
				if(field[i][j] == 'c' && j+1< field[i].length && field[i][j+1] == 'o') {
					up ++;
					UpCowRow = i;
					UpCowCol = j;
				}
				if(field[i][j] == 'c' && j-1>=0 && field[i][j-1] == 'o') {
					down ++;
					DownCowRow = i;
					DownCowCol = j;
				}
				if(field[i][j] == 'c' && i+1<field.length && field[i+1][j] == 'o') {
					left ++;
					LeftCowRow = i;
					LeftCowCol = j;
				}
				if(field[i][j] == 'c' && i-1>=0 && field[i-1][j] == 'o') {
					right ++;
					RightCowRow = i;
					RightCowCol = j;
				}
			}
		}
    	
    	if(up == 1) {
    		return new int[] {UpCowCol,UpCowRow};
    	}
    	if(down == 1) {
    		return new int[] {DownCowCol,DownCowRow};
    	}
    	if(left == 1) {
    		return new int[] {LeftCowCol,LeftCowRow};
    	}
    	if(right == 1) {
    		return new int[] {RightCowCol,RightCowRow};
    	}
    	
    	
    	
    	
        return null;
    }
}
