package assignment2;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int a[]= {1,3,5,6,7,48};
		int flag=0;
		int loc=0;
		Scanner scan= new Scanner(System.in);
		System.out.println("enter findnumber");
		int findnumber= scan.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==findnumber)
			{
				flag=1;
				loc=i+1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("located at="+loc);
		}
		else
		{
			System.out.println(1);
		}
	}

}
