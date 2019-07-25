package interview_Preparation_Kit;

public class RepeatedString {

	public static void main(String[] args) {
		String s="a";
		long n=1000000000000L;
		Long num=new Long(n);
		int count=0,diff=num.intValue()-s.length();
		for(int i=0;i<diff;i++) {
			s+=s.charAt(i);
		}
		String subString=s.substring(0, num.intValue());
		for(int i=0;i<subString.length();i++) {
			if(s.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
	}

}
