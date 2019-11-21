import java.util.Scanner;
public class exc3 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		
		int[]a = new int [5];
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int j = 0; j<a.length; j++) {
			int contador = 0;
			for (int k = 1; k<=a[j];k++) {
				int numero = a[j];
				if (numero%k == 0) {
					contador++;
					}
				}
			if (contador == 2) {
				System.out.println ("o numero "+a[j]+" eh primo");
			}
			else {
				System.out.println ("o numero "+a[j]+" nao eh primo");
			}
		}
	}

}
