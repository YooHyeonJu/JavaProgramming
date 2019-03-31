package chap02;
import java.util.Scanner;

public class DayOfYear {
	
	static int[][] mdays = {
			{31,28,31,30,31,30,31,31,30,31,30,31},
			{31,29,31,30,31,30,31,31,30,31,30,31}
	};
	

	static class YMD{
		int y;
		int m;
		int d;
		
		YMD(int year, int month, int day){
			this.y = year; this.m = month; this.d = day;
		}
		
		void YMD_after(int n)
		{
			int after = n;
			while(n!=0)
			{
				if(this.d + n <= mdays[isLeap(this.y)][this.m-1]) {
					this.d += n;
					System.out.println(after + "일 후는 : ");
					printYMD();
					return;
				}
				else
				{	
					n = n - (mdays[isLeap(this.y)][this.m-1] - this.d + 1);
					this.d = 1;
					this.m+=1;
					if(this.m > 12)
					{
						this.m = 1;
						this.y +=1;
					}
					if(n==0)
					{
						System.out.println(after + "일 후는 : ");
						printYMD();
						return;
					}
				}
			}
		}
		
		void YMD_before(int n)
		{
			int before = n;
			while(n!=0)
			{
				if(this.d - n > 0) {
					this.d -= n;
					System.out.println(before + "일 전은 : ");
					printYMD();
					return;
				}
				else
				{	
					//n = n - mdays[isLeap(this.y)][this.m-1];
					
					n -= this.d;
					this.m-=1;
					if(this.m < 1)
					{
						this.m = 12;
						this.y -=1;
					}
					
					this.d = mdays[isLeap(this.y)][this.m-1];
					
					if(n==0)
					{
						System.out.println(before + "일 전은 : ");
						printYMD();
						return;
					}
				}
			}
		}
		
		void printYMD()
		{
			System.out.println(this.y +"년" + this.m + "월 " + this.d + "일");
		}
	}
	
	static int isLeap(int year)
	{
		return (year%4 == 0 && year%100 != 0) || (year %400==0)? 1:0;
			
	}
	
	static int dayOfYear(int y, int m, int d)
	{
		int days = d;
		
		for(int i = 1;i<m;i++)
		{
			days += mdays[isLeap(y)][i-1];
		}
		
		return days;
	}
	
	static int leftDayOfYear(int y, int m, int d)
	{
		int days = dayOfYear(y,m,d);
		int leftDay;
		if(isLeap(y)==1)
		{
			leftDay = 366-days;
		}
		else
		{
			leftDay = 365-days;
		}
		return leftDay;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("그 해 경과 일수를 구합니다.");
		
		System.out.print("년 : "); int year = stdIn.nextInt();
		System.out.print("월 : "); int month = stdIn.nextInt();
		System.out.print("일 : "); int day = stdIn.nextInt();
		
		System.out.print("변경할 날 n 값 : "); int n = stdIn.nextInt();
		System.out.print("모드 설정(n일 전=0, n일 후=1) : "); int mode = stdIn.nextInt();
		
		//System.out.printf("그 해 %d일째입니다.\n", dayOfYear(year,month,day));
		//System.out.printf("그 해 남은 날은 %d입니다.", leftDayOfYear(year, month, day));
		
		YMD today = new YMD(year,month,day);
		if(mode == 0)
			today.YMD_before(n);
		else if(mode == 1)
			today.YMD_after(n);
		
	}

}
