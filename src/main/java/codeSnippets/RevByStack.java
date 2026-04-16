package codeSnippets;

import java.util.Stack;

public class RevByStack {
	public static void main(String[] args) {
		
		String str = "madhu";
		Stack<Character> stack = new Stack<>();
		
		for(char c : str.toCharArray()) {
			stack.push(c);
		}
		
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()); 
		}
		
	}
	
	
	

}
