import java.util.Scanner;
public class exc2 {
	public static void main (String args []) {
		
		Scanner in = new Scanner (System.in);
		int[] a;
		a = new int [5];
		
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		
		for (int j = 0; j<a.length; j++) {
			System.out.println("Tabuada do "+a[j]);
			for(int k = 1; k<=10; k++) {
				System.out.println(a[j]+"x"+k+" = "+(a[j]*k));
			}
		}
	}
}
