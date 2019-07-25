package Test;

public class BiggerIsGreater {
public static void main(String[] args) {
	String alphabets="";
	for(char ch='a';ch<='z';ch++) {
		alphabets+=ch;
	}
	System.out.println(alphabets.indexOf('c'));
}
}
