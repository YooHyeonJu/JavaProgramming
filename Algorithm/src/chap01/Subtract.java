package chap01;
import java.util.Scanner;

public class Subtract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("b-a 를 구합니다.(단, a<b)");
		int a;
		int b;
		
		System.out.println("a의 값 : ");
		a = stdIn.nextInt();
		do
		{
			System.out.println("b의 값 : ");
			b = stdIn.nextInt();
			System.out.println("a보다 큰 값을 입력하세요.");
		}while(a>=b);
		
		int subtract_value = b-a;
		System.out.println("b-a의 값은 " + subtract_value + "입니다.");
	}

}
