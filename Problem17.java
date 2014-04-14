class Problem17{
	public static void main(String[] args){
		int sum = 0;
		int totalSum = 0;
		int numberOfDigits = 0;
		for(int i = 1; i < 1001; i++){
			numberOfDigits = Integer.toString(i).length();
			if(numberOfDigits == 1){
				sum = oneDigitNumber(i);
			}else if(numberOfDigits == 2){
				sum = twoDigitNumber(i);
			}else if(numberOfDigits == 3){
				sum = threeDigitNumber(i);
			}else if(numberOfDigits == 4){
				sum = fourDigitNumber(i);
			}
			totalSum += sum;
			System.out.println("Number of letters for " + i + ": " + sum);
		}
		System.out.println("If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, there would be " + totalSum + " letters.");
	}
	
	static int fourDigitNumber(int i){
		int sum = 11;
		return sum;
	}
	
	static int threeDigitNumber(int i){
		int sum = 0;
		int first = i / 100;
		int secondAndThird = i % 100;
		
		// adding first digit to the sum
		sum += oneDigitNumber(first);
		
		// adding "hundred" to the sum
		sum += 7;
		
		// adding the "and" to the sum
		if(secondAndThird != 0){
			sum += 3;
		}
		
		// adding the second and third digit to the sum
		sum += twoDigitNumber(secondAndThird);
		
		return sum;
	}
	
	static int twoDigitNumber(int i){
		int sum = 0;
		int first = i / 10;
		int second = i % 10;
		if(first == 1){
			if(second == 0){
				sum = 3;
			}else if(second == 1 || second == 2){
				sum = 6;
			}else if(second == 5 || second == 6){
				sum = 7;
			}else if(second == 3 || second == 4 || second == 8 || second == 9){
				sum = 8;
			}else if(second == 7){
				sum = 9;
			}
		}else if(first == 4 || first == 5 || first == 6){
			sum = 5;
		}else if(first == 2 || first == 3 || first == 8 || first == 9){
			sum = 6;
		}else if(first == 7){
			sum = 7;
		}
		// Add on the second digit as long as the first digit isn't 1
		if(first != 1){
			sum += oneDigitNumber(second);
		}
		return sum;
	}
	
	static int oneDigitNumber(int i){
		int sum = 0;
		
		if(i == 1 || i == 2 || i == 6){
			sum = 3;
		}else if(i == 4 || i == 5 || i == 9){
			sum = 4;
		}else if(i == 3 || i == 7 || i == 8){
			sum = 5;
		}
		return sum;
	}
}
