package chap01;
import java.util.Scanner;

public class TriangleLB {
	
	static void npira(int n)
	{
		System.out.println("\n n단의 숫자 피라미드를 출력합니다.");
		
		int length = 2*n-1;
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}				
			for(int j = n-i+1;j<=length - (n-i);j++) {
				System.out.print(i);
			}				
			for(int j = length - (n-i)+1;j<=length;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}		
	}
	

	static void spira(int n)
	{
		System.out.println("\n n단의 피라미드를 출력합니다.");
		
		int length = 2*n-1;
		for(int i =1;i<=n;i++) {
			for(int j = 1;j<=n-i;j++) {
				System.out.print(" ");
			}				
			for(int j = n-i+1;j<=length - (n-i);j++) {
				System.out.print("*");
			}				
			for(int j = length - (n-i)+1;j<=length;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}		
	}
	
	static void triangleRU(int n)
	{
		System.out.println("\n오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =1;i<=n;i++)		// i : 1~n
		{
			for(int j = 1;j<=i;j++) // j : 1~i
			{
				System.out.print(" ");
			}
			for(int j = i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleRB(int n)
	{
		System.out.println("\n오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =1;i<=n;i++)		// i : 1~n
		{
			for(int j = 1;j<=n-i;j++) // j : 1~i
			{
				System.out.print(" ");
			}
			for(int j = n-i+1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLU(int n)
	{
		System.out.println("\n왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =0;i<n;i++)		// i : 1~n
		{
			for(int j = 0;j<n-i;j++) // j : 1~i
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void triangleLB(int n)
	{
		System.out.println("\n왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		for(int i =0;i<n;i++)		// i : 1~n
		{
			for(int j = 0;j<=i;j++) // j : 1~i
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner stdIn = new Scanner(System.in);
		int n=4;
		
		do {
			System.out.println("등변의 길이 : ");
			n = stdIn.nextInt();
		}while(n<=0);
	
		triangleLB(n);
		triangleLU(n);
		triangleRB(n);
		triangleRU(n);
		spira(n);
		npira(n);
	}

}
