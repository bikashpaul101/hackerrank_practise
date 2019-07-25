package ArraysPackage;

public class HourGlass_TwoD_Array {
	public static void main(String[] args) {
		int [][]arr = {{1, 2, 3, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {2, 1, 4, 0, 0}, 
                {0, 0, 0, 0, 0}, 
                {1, 1, 0, 1, 0}}; 
		int max_sum=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=0;j<arr.length-2;j++) {
				// Considering mat[i][j] as top  
	            // left cell of hour glass. 
				int sum=(arr[i][j]+arr[i][j+1]+arr[i][j+2])
						+(arr[i+1][j])
						+(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
				max_sum=Math.max(max_sum, sum);
			}
			
		}
		System.out.println(max_sum);
	}
}
