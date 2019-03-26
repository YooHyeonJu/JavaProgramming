package chap01;
import java.util.Scanner;

public class Place_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		int n;
		int place= 0;
		
		do {
			System.out.println("n의 값 : ");
			n = stdIn.nextInt();
		}while(n<=0);
		
		while(n != 0)
		{
			place +=1;
			n = n/10;
		}
		
		System.out.println("그 수는 " + place + "자리입니다.");
	}

}
