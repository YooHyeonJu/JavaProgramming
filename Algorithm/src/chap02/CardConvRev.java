package chap02;
import java.util.Scanner;

public class CardConvRev {

	static int radixConv(int x, int r,char[] d)
	{
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf("%d | %5d \n",r,x);
		do
		{
			System.out.println("  + -------");
			if(x/r!=0) {
				System.out.printf("%d | %5d --%d\n",r,x/r,x%r);
			}
			else
			{
				System.out.printf("    %5d --%d\n",x/r,x%r);
			}
			d[digits++] = dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		return digits;
	}
	
	static int cardConvR(int x, int r,char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			// charAt(n) : 0부터 시작하여 문자열의 n번째에 있는 문자를 반환함.
			d[digits++] = dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		
		return digits;
	}
	
	static int cardConv(int x, int r,char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			// charAt(n) : 0부터 시작하여 문자열의 n번째에 있는 문자를 반환함.
			d[digits++] = dchar.charAt(x/r);
			x -= (x/r)*r;
			if(x/r==0) {
				d[digits++] = dchar.charAt(x%r);
			}
		}while(x!=0);
		
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int no;		// 변환할 정수
		int cd;		// n진수
		int dno;	// 변환 값 자릿수
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = stdIn.nextInt();
			}while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할까요?(2~36)");
				cd = stdIn.nextInt();
			}while(cd<2 || cd>36);
			
			//dno = cardConv(no,cd,cno);
			dno = radixConv(no,cd,cno);

			System.out.print(cd + "진수 변환 결과 : "); 
			for(int i = dno-1;i>=0;i--) {
				System.out.print(cno[i]); 
			}
			 	
			
			System.out.print("\n한 번 더 하시겠습니까? (1.예/0.아니오) : "); 
			retry = stdIn.nextInt();
		}while(retry == 1);		
	}
}
