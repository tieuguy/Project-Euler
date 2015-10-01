/*
	The number of paths can be found using the central binomial coefficients
	2n choose n  OR (2n)! / n!^2
*/

import java.math.BigInteger;

class Problem15{
	public static void main(String[] args){
		int dimension = 20;
		
		BigInteger numerator = factorial(2 * dimension);
		BigInteger denominator = factorial(dimension).pow(2);
		
		BigInteger answer = numerator.divide(denominator);
		
		System.out.println("For a " + dimension + " x " + dimension + " grid, there are " + answer + " paths");
	}
	
	public static BigInteger factorial(int n){
		BigInteger fact = BigInteger.valueOf(n);
		for(int i = n; i > 1; i--){
			fact = fact.multiply(BigInteger.valueOf(i - 1));
		}
		return fact;
	}
	
}
