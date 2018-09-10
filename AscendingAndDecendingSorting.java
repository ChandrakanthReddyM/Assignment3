package Assignment3;

public class AscendingAndDecendingSorting {
public static int[] sorting(int []a)
{
	int t=0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<(a.length/2)-i-1;j++)
		{
			if(a[j]>a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
		for(int j=a.length/2;j<a.length-i-1;j++)
		{
			if(a[j]<a[j+1])
			{
				t=a[j];
				a[j]=a[j+1];
				a[j+1]=t;
			}
		}
	}
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={3,4,5,0,8,9,7};
		int []b=sorting(a);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
