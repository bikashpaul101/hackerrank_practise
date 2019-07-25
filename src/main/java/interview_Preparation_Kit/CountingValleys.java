package interview_Preparation_Kit;

public class CountingValleys {
	public static void main(String[] args) {
		int sealevel=0;int valleycount=0;
		String path="DUDDDUUDUU";
		for(int i=0;i<path.length()-1;i++) {
			if(path.charAt(i)=='U') {
				sealevel++;
			}
			else if(path.charAt(i)=='D'){
				if(sealevel==0) {
					valleycount++;//anything that is just below the sea level is counted as valley when sea level is zero
				}
				sealevel--;
			}
			
		}
		System.out.println(valleycount);
	}
}
