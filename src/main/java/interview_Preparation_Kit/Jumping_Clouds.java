package interview_Preparation_Kit;

public class Jumping_Clouds {
	public static void main(String[] args) {
		int steps=0;
		int[] c= {0 ,0 ,0 ,1 ,0 ,0};
		//int[] c= {0 ,0 ,1 ,0 ,0 ,1 ,0};	
		//int [] c= {0,0};
		int startingpoint=0;
		for(int i=0;i<c.length-2;) {
			
			if(c[i+2]==0) {
				steps++;
				startingpoint=i+2;
			}
			else if(c[i+2]==1) {
				if(c[i+1]==0) {
					steps++;
					startingpoint=i+1;
				}
			}
			i=startingpoint;	
			if(i==c.length-2) {
				if(c[i]==0) {
					steps++;
				}
			}
			//System.out.println(startingpoint);
		}
		if(c.length==2 && c[1]==0) {
			steps++;
		}
		System.out.println(steps);
	}
}
