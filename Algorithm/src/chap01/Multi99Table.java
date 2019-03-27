package chap01;
import java.util.Scanner;

public class Multi99Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("---구구단---");
		
		for(int i = 1;i<=9;i++)
		{
			for(int j = 1;j<=9;j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println();
		}
		
		System.out.println("---곱셈표---");
		System.out.print("   |");
		for(int i = 1;i<=9;i++)
		{
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+----------------------------");
		for(int i =1;i<=9;i++)
		{
			System.out.printf("%3d|",i);
			for(int j = 1;j<=9;j++)
			{
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		
		System.out.println("\n---덧셈표---");
		System.out.print("   |");
		for(int i = 1;i<=9;i++)
		{
			System.out.printf("%3d",i);
		}
		System.out.println("\n---+----------------------------");
		for(int i =1;i<=9;i++)
		{
			System.out.printf("%3d|",i);
			for(int j = 1;j<=9;j++)
			{
				System.out.printf("%3d",i+j);
			}
			System.out.println();
		}
		
		System.out.println("\n---정사각형 출력---");
		Scanner stdIn = new Scanner(System.in);
		System.out.println("단 수 : ");
		int n = stdIn.nextInt();
		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
