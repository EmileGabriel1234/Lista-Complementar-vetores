import java.util.Scanner;
public class exc5 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		
		int[]a = new int [10];
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int j = 0; j<a.length; j++) {
			for (int k = 1; k<=a[j];k++) {
				int numero = a[j];
				if (numero%k == 0) {
					System.out.println ("O divisor de  "+numero+"  é  "+k);
					}
				
			}
		}
	}

}
