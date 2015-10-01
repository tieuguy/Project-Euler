import java.util.Scanner;
import java.io.*;

class Problem11
{
	public static void main (String[] args) throws IOException
	{ 
		File    file = new File("C:\\Users\\tieuph\\Documents\\Phil\\Project Euler\\Problem11.txt");   // create a File object
		Scanner scan = new Scanner( file );      // connect a Scanner to the file
		int[][] anArray;
		anArray = new int[20][20];
		int i = 0;
		int j = 0;
		int largest = 0;
		int mult;
		while(scan.hasNext() == true)
		{
			for(i = 0; i < 20; i++)
			{
				for(j = 0; j < 20; j++)
				{
					anArray[i][j] = scan.nextInt();
					//System.out.print(anArray[i][j]);
				}
				//System.out.println("");
			}
		}
		for(i = 0; i < 20; i+= 4)
		{
			for(j = 0; j < 20; j++)
			{
				mult = anArray[i][j] * anArray[i + 1][j] * anArray[i + 2][j] * anArray[i + 3][j];
				if(mult > largest){
					largest = mult;
					//System.out.println(largest);
				}
			}
		}
		for(i = 0; i < 20; i++)
		{
			for(j = 0; j < 16; j++)
			{
				mult = anArray[i][j] * anArray[i][j + 1] * anArray[i][j + 2] * anArray[i][j + 3];
				if(mult > largest){
					largest = mult;
					//System.out.println(largest);
				}
			}
		}
		for(i = 0; i < 16; i++)
		{
			for(j = 0; j < 16; j++)
			{
				mult = anArray[i][j] * anArray[i + 1][j + 1] * anArray[i + 2][j + 2] * anArray[i + 3][j + 3];
				if(mult > largest){
					largest = mult;
					//System.out.println(largest);
				}
			}
		}
		for(i = 0; i < 16; i++)
		{
			for(j = 3; j < 20; j++)
			{
				mult = anArray[i][j] * anArray[i + 1][j - 1] * anArray[i + 2][j - 2] * anArray[i + 3][j - 3];
				if(mult > largest){
					largest = mult;
					//System.out.println(largest);
				}
			}
		}
		System.out.println(largest);
	}
}
