
public class Kthbucket { //without sorting we save time.
	static long startTime = System.currentTimeMillis();
	public static void main(String args[])
	{
		int A[] = new int[]{6,5,2,7,3,8,32,1,43,87,45};
		int n=3;//This is the supposed nth largest number
		int res = 0;
		for(int i=0;i<A.length;i++)
		{
		int k = 0;
		for(int j=0;j<A.length;j++)
		{
		if(A[i]<A[j])
		 ++k;
		if((k==(n-1))&&(j==A.length-1))
		{
		res = A[i];
		break;
		}
		}
		}
		System.out.println("Required number is" +res);
	long endTime   = System.currentTimeMillis();
	long totalTime = endTime - startTime; // checks running time in ms
	System.out.println(totalTime);
	}
}
