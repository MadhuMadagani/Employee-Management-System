package javapractice;

import java.util.Arrays;
public class Arr {
    public static void main(String[]args) {
    	int[] nums = {1,1,0,1,1,1,1,8};
    	
    	int sum = Arrays.stream(nums).sum();
    	System.out.println(sum);
    }
	
	
}
