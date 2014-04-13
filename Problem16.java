import java.math.BigInteger;

class Problem16{
	public static void main(String[] args){
		int sum = 0;
		BigInteger bi = new BigInteger("2");
		
		bi = new BigInteger(bi.pow(1000).toString());
		for(int i = 0; i < bi.toString().length(); i++){
			sum += Integer.parseInt(bi.toString().substring(i, i + 1));
		}
		System.out.println("The sum of the digits of 2^1000 is " + sum);
	}
}
