package codeSnippets;

public class StarPattern {
	
	public static void main(String[] args) {
		
	/*	for(int i=1; i<=4;i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} */
	//Pyramid
		for(int m=1; m<=4; m++) {
			
			for(int n=4; n>m; n--) {
				System.out.print("");
			}
			for(int k=1; k<=m; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
