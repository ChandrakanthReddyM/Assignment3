package Assignment3;
public class InsertionSorting {
	public static int[] insertionSorting(int []a)
	{
		for(int i=1;i<a.length;i++)
		{
			int t=a[i];
			int j=i-1;//index j
			while((j>-1)&&(a[j]>t))
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=t;
		}
		return a;
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int []a={5,1,3,8,9,7};
			insertionSorting(a);
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+" ");
			}
		}
}
