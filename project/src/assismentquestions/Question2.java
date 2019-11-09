package assismentquestions;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the lower limit");
		int lower=s.nextInt();
		int i;
		System.out.println("Enter the upper limit");
	    int upper=s.nextInt();
		int p=0;
		for ( i=lower+1;i<upper;i++)
		{
			p=0;
			for( int j=2;j<=i/2;j++) 
				if(i%j==0) {
					p=1;
				}
			if(p==0) {
			System.out.println(i);
			}
		}
	}

}
