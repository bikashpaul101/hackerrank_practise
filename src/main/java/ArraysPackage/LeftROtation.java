package ArraysPackage;

import java.util.Arrays;

public class LeftROtation {
	public static int[] leftRotation(int[] arr) {
		
		int temp=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=temp;
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5};
		int n=5;
		while(n>0) {
			arr=leftRotation(arr);
			n--;
		}
		System.out.println("Final result:"+Arrays.toString(arr));
	}
}
