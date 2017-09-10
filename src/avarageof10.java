/**
 * @author Frezer
 * 09/09/1017
 * fkg260@email.vccs.edu
 * Scanner class with Delimiter
 */
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class avarageof10 {
	
	public static void main(String[] args) throws FileNotFoundException {
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum; // I used this to get the sum of value from the whole number of sum.
		int answer;  // I named answer to indicated to get the final answer.
		Scanner input = new Scanner(new File("new.txt")); // I created the scanner to input the file from where I created which is file name " new" 
		input.useDelimiter(Pattern.compile(",")); // this delimited can read the file separately for me 
		num1 = input.nextInt(); // this input reads the first integer what I write from "new" document 
		num2 = input.nextInt(); // this input reads the second integer what I write from "new" document 
		num3 = input.nextInt(); // this input reads the third integer what I write from "new" document 
		num4 = input.nextInt(); // this input reads the forth integer what I write from "new" document 
		num5 = input.nextInt(); // this input reads the fifth integer what I write from "new" document 
		num6 = input.nextInt(); // this input reads the sixth integer what I write from "new" document 
		num7 = input.nextInt(); // this input reads the seventh integer what I write from "new" document 
		num8 = input.nextInt(); // this input reads the eighth integer what I write from "new" document 
		num9 = input.nextInt(); // this input reads the ninth integer what I write from "new" document 
		num10 = input.nextInt(); // this input reads the tenth integer what I write from "new" document 
		sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10; // this how I add the whole number together 
		answer = sum / 10; // I divided the sum of numbers in ten times because I am looking for the average of 10 numbers. 
		// this the bottom of application used it to print out the all numbers in order to the front screen. 
		System.out.println("The avarage of \""+ num1 +"\",\""+ num2 +"\",\""+ num3 +"\",\""+ num4 +"\",\""+ num5 +"\","
				+ "\""+ num6 +"\",\""+ num7 +"\",\""+ num8 +"\",\""+ num9 +"\",\""+ num10 +"\" is " + answer);	
		// this one also used it to print out the final answer to the screen 
		
		// the last one is used it to close the application 
		input.close();	
	}

}