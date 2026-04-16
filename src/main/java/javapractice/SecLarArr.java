package javapractice;

public class SecLarArr {
	public static void main(String[] args) {
		
		int arr[] = {10,20,5,7,40,100,190};
		
		int first = Integer.MIN_VALUE;  //used smaller than any number in array
		int second = Integer.MIN_VALUE;
		
	for(int i=0; i<arr.length;i++) {
		if(arr[i] > first) {
			second = first;
			first = arr[i];
		}
		else if (arr[i] > second && arr[i] != first) {
			second = arr[i];
		}
	}
		System.out.println("Second Largest Number:" + second);
		
		
	}
	

}
