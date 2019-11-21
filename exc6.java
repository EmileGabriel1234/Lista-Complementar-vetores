import java.util.Scanner;
public class exc6 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int[]a = new int [5];
		int potencia;
		
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		
		for (int j = 0; j<a.length; j++) {
			System.out.println("2 elevado a º"+a[j]+ " potencia");
			for(int k = 0; k<=a[j]; k++) {
				potencia = (int)Math.pow(2, k);
				System.out.println("2"+" ^ "+a[j]+" = "+potencia);
			}
		}
	}
}

