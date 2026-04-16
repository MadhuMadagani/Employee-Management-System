package codeSnippets;


public class LargestNumber {
  //Q:input: {10,50,20,35,99}  output: 99 
	public static void main(String[] args) {
		int[] arr = {10, 50, 20,35,99};
		int max = arr[0];
		
		for(int i=1; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
		          		
			}	
		}
		System.out.println("Largest:" +max);
	}
	
	
	
}
