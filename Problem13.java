/*
 * Note: This question could have been done much more easily with the use of the BigInteger class
*/
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.*;
import java.util.ArrayList;
import java.util.List;

class Problem13{
	public static void main(String[] args){
		ArrayList<String> lon = new ArrayList<String>(); // lon: list of numbers
		String totalSum = "";
		String answer = "";
		int sum = 0;
		int carry = 0; // Holds the carry over when adding
		
		// Open the file
		try(BufferedReader br = new BufferedReader(new FileReader("D:\\Programming\\ProjectEuler\\src\\file.txt"))) {
			String line = br.readLine();

			// copy numbers from file into arraylist
			while (line != null) {
				lon.add(line);
				line = br.readLine();
			}
		}catch(IOException e){
			System.err.println("There is an IO exception: " + e);
			System.exit(1);
		}
		
		// This loop applies the addition to each column of numbers at a time
		for(int i = 50; i != 0; i--){
			//System.out.println(lon.get(i));
			for(int j = 0; j < 100; j++){
				//System.out.println("THE SUBSTRING IS: " + lon.get(j).substring(i-1, i) + " WHICH PARSES INTO: " + Integer.parseInt(lon.get(j).substring(i-1, i)));
				sum += Integer.parseInt(lon.get(j).substring(i-1, i));
			}
			sum += carry;
			//System.out.println("THE SUM FOR DIGIT " + (51 - i) + " IS: " + sum);
			totalSum += Integer.toString(sum % 10);
			carry = sum / 10;
			//System.out.println("THE CARRY IS: " + carry);
			sum = 0;
		}
		//System.out.println("TOTAL SUM IS :" + totalSum);
		
		// Source for reversing a string: http://stackoverflow.com/questions/7569335/reverse-a-string-in-java
		answer = new StringBuilder(totalSum).reverse().toString();
		
		// Print out the answer
		System.out.print("The sum of the 100 50-digit numbers is: ");
		
		if(carry != 0){
			System.out.print(carry);
		}
		System.out.println(answer);
	}
}
