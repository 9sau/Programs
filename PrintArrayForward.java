
public class PrintArrayForward {

	static int a[]={10,20,30,40,50,60};
	public static void printArray(int n)
	{
	//	System.out.println("Inside function for n = "+n);
		if(n==a.length-1)
		{
			
			System.out.println(a[n]);
		}
		else
		{
			
			System.out.print(a[n]+ " ");
			printArray(n+1);
		}
	//	System.out.println("Returning for n = "+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printArray(0);
	}

}
