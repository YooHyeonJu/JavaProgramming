package chap02;

public class IntArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		
		int[] b = {1,2,3,4,5};
		
		for(int i =0;i<b.length;i++)
		{
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
