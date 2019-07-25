package Test;

public class EncryptionExmaple {
public static void main(String[] args) {
	String s="have a nice day".replaceAll(" ", "");
	double n=s.length();
	int row=(int) (Math.round(Math.sqrt(n)));
	int column=0;
	if(row>=Math.sqrt(n)) {
		column=row;
	}
	else {
		column=row+1;
	}
	for(int i=0;i<column;i++) {
		for(int j=i;j<n;j+=column) {
			System.out.print(s.charAt(j));
		}
		System.out.print(" ");
	}
}
}
