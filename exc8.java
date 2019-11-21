import java.util.Scanner;
public class exc8 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		int[]a = new int [5], b = new int [5];
		
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}for (int i = 0; i<a.length;i++) {
			for (int j = 0; j<a.length;j++) {
				b[i] = a[j]+a[i];
				System.out.println("Somatório de: "+a[j]+" com "+a[i]+ " = "+b[i]);
			}
		}
	}
}
