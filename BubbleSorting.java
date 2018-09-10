package Assignment3;

import java.util.Scanner;

public class BubbleSorting {
	public static int[] bubbleSorting(int []a)
	{
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		return a;
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a={2,7,8,9,3,5,1};
			int []b=bubbleSorting(a);
			for(int i=0;i<b.length;i++)
			{
			System.out.println(b[i]);
			}
		}
}
