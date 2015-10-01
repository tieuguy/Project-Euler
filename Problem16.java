import java.math.BigInteger;

class Problem16{
	public static void main(String[] args){
		int sum = 0;
		String s = new BigInteger("2").pow(1000).toString();
		for(int i = 0; i < s.length(); i++){
			sum += Integer.parseInt(s.substring(i, i + 1));
		}
		System.out.println("The sum of the digits of 2^1000 is " + sum);
	}
}
