import java.util.Scanner; 
interface Lambda
{
	int Fibonacci(int a,int b);
}
public class Lambdas
{
	public static void main(String arr[])
	{
		Lambda sum=(int a,int b)-> a+b;
		Scanner in = new Scanner(System.in); 
        int n = in.nextInt(); 
        int x=0;
        int y=1;
        System.out.print("0 1 ");
        for(int i=0;i<n-2;i++)
        {
			x=y;
			y=sum.Fibonacci(x,y);
			System.out.print(y+" ");
        }
	}
}
