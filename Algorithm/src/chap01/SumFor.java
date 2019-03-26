package chap01;
import java.util.Scanner;

public class SumFor {
	
	static int sumof2(int a, int b)
	{
		int sum = (a-1)*a/2;
		System.out.println("sum1 의 값 : " + sum);
		int sum2 = b*(b+1)/2;
		System.out.println("sum2 의 값 : " + sum2);
		
		return sum2 - sum;
	}
	
	static int sumof(int a, int b)
	{
		int sum = 0;
		for(int i = a;i<=b;i++)
		{
			sum +=i;
		}
		return sum;
	}

	static int gauss_sum(int n)
	{
		return n*(n+1)/2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		for(int i = 1;i<=n;i++)
		{
			sum += i;
			if(i==n)
			{
				System.out.print(i + "=");
				break;
			}
			System.out.print(i + "+");
		}
		
		System.out.println(sum);
		
		System.out.println("가우스 합 : "+gauss_sum(n));
		
		System.out.println("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.println("b의 값 : ");
		int b = stdIn.nextInt();
		
		System.out.println("a부터 b까지의 합 : " + sumof(a,b));
		System.out.println("a부터 b까지의 합 : " + sumof2(a,b));
	}

}
