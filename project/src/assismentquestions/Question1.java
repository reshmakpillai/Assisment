package assismentquestions;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the array size");
		int limit=s.nextInt();
		int a[]=new int[limit+1];
		int i;
		System.out.println("Enter the elements");
		for(i=0;i<limit;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the positipon where you want to insert element");
		int pos=s.nextInt();
		System.out.println("Enter the element to be inserted");
		int x=s.nextInt();
		for(i=(limit-1);i>=(pos-1);i--) {
			a[i+1]=a[i];
		}
		a[pos-1]=x;
		System.out.println("After insertion");
		for(i=0;i<limit+1;i++) {
			System.out.println(a[i]);
		}
	}
}
