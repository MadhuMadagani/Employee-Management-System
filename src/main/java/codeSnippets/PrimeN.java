package codeSnippets;

public class PrimeN {
	
	public static void main(String[] args) {
		
		int num = 29;
		boolean isPrime = true;
		
		if(num <=1) { 
			isPrime = false;
		}
		
		for(int i=2;i<= Math.sqrt(num); i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(isPrime);
		
	 int num1 = 22;
	 boolean isPrime1 = true;
	 
	 if(num1 <= 1) {
		 isPrime1 = false;
	 }
	  for(int i=2; i<= Math.sqrt(num1); i++) {
		  if(num % i == 0) {
			  isPrime1 = false;
			  break;
		  }
	  }
		System.out.println(isPrime1);
	}	
}
