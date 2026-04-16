package codeSnippets;

public class ReverseBySB {
	public static void main(String[] args) {
		
//By Using StringBuilder		
		String str = "madhu";
		
	StringBuilder sb = new StringBuilder(str); //StringBuilder is Mutable faster than loop
	 sb.reverse();  //built in method
		
		System.out.println(sb);
	}

}
