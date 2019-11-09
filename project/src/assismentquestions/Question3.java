package assismentquestions;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the limit");
		int n=s.nextInt();
		int a[]=new int[n];
		int i;
		int j;
		int temp;
		System.out.println("enter the array");
		for(i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n-1;j++)
			{
			if(a[j]>a[j+1])
			{
				temp=a[j+1];
				a[j+1]=a[j];
				a[j]=temp;	

			}
			}
		}
		int c=1;
		for(i=0;i<n;i++) {
			if(a[i]!=c) {
				System.out.println(c+" "+"is missing");
				c=c+2;
			}
			else {
				c++;
			}
		}
	}
}
