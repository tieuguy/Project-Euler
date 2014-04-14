/*
	The number of paths can be found using the central binomial coefficients
	2n choose n  OR (2n)! / n!^2
*/

import java.math.BigInteger;

class Problem15{
	public static void main(String[] args){
		int dimension = 20;
		BigInteger answer = new BigInteger("0");
		BigInteger numerator = new BigInteger("0");
		BigInteger denominator = new BigInteger("0");
		
		numerator = new BigInteger(factorial(2 * dimension));
		denominator = new BigInteger(factorial(dimension)).pow(2);
		
		answer = new BigInteger(numerator.divide(denominator).toString());
		
		System.out.println("For a " + dimension + " x " + dimension + " grid, there are " + answer + " paths");
	}
	
	public static String factorial(int n){
		BigInteger fact = new BigInteger(Integer.toString(n));
		for(int i = n; i > 1; i--){
			fact = fact.multiply(new BigInteger(Integer.toString(i - 1)));
		}
		return fact.toString();
	}
	
}
