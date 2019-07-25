package interview_Preparation_Kit;

import java.util.Arrays;

public class SockMerchant {
	public static void main(String[] args) {
		int count=0;
		int[] arr= {10 ,20, 20, 10 ,10 ,30 ,50 ,10, 20};
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("["+i+"]"+arr[i]+" - "+arr[j]+"["+j+"]");
					count++;
					i++;
				}
				break;
			}
		}
		
		System.out.println(count);
	}
}
