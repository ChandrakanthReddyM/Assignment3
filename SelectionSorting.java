package Assignment3;

public class SelectionSorting {
	public static int[] selectionSorting(int []a)
	{
		int min;
		int t;
		int minInd;
		for(int i=0;i<a.length;i++)
		{
			min=a[i];
			minInd=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
				{
					min=a[j];
					minInd=j;
				}
			}
			t=a[i];
			a[i]=a[minInd];
			a[minInd]=t;
		}
		return a;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a={8,3,5,1,7,9};
			int []c=selectionSorting(a);
			for(int i=0;i<c.length;i++)
			{
				System.out.println(c[i]);	
			}
		}
}
