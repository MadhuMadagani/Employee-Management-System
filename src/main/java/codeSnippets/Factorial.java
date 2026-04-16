package codeSnippets;

public class Factorial {
	
	public static void main(String[] args) {
		
		int num = 5;
		int fact = 1;
		//why 1 is multiplication starts from 1 with 0 its always 0
		for(int i = 1; i<=num;i++) {
			fact = fact * i;      // each number multiplies with another in a linewise 5*4*3*2*1=120
		}
		System.out.println(fact);
	}

}
