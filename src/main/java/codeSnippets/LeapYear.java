package codeSnippets;

public class LeapYear {
	public static void main(String[] args) {
		
		int year = 2025;
		
		if(year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) {
			System.out.print("Leap year");
		} else {
			System.out.print("No leap year");
		}
	}
	
	

}
