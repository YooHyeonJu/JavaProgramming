package chap02;
import java.util.Scanner;

public class ReverseArray {
	
	static void copy(int[] a, int[] b) {
		for(int i = 0;i <a.length;i++) {
			b[i] = a[i];
		}
	}
	
	static void rcopy(int[] a, int[] b) {
		for(int i = 0;i<a.length;i++) {
			b[i] = a[a.length-i-1];
		}
	}
	
	static int sumOf(int[] a)
	{
		int sum = 0;
		for(int i = 0;i<a.length;i++) {
			sum += a[i];
		}
		return sum;
	}

	static void printArray(int[] a) {
		for(int i =0 ;i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	static void swap(int[] a, int idx1, int idx2)
	{
		System.out.println("a[" + idx1 + "]과 a[" + idx2 + "]를 교환합니다");
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}
	
	static void reverse(int[] a)
	{
		for(int i = 0;i<a.length/2;i++) {
			swap(a,i,a.length-i-1);
			printArray(a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int num = stdIn.nextInt();
		int[] x= new int[num];
		int[] y = new int[num];
		
		for(int i = 0;i<num;i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		printArray(x);
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");

		System.out.println("요소의 총합 : " + sumOf(x));
		
		System.out.println("a배열을 b에 복사 : ");
		copy(x,y); printArray(y);
		
		System.out.println("\na배열을 b에 역순으로 복사 : ");
		rcopy(x,y); printArray(y);
		
	}

}
