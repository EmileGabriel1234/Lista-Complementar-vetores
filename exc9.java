import java.util.Scanner;
public class exc9 {
	public static void main (String args[]) {
	Scanner in = new Scanner (System.in); 
		int[] a = new int [3], b = new int [3];
		
		for (int i = 0; i<a.length;i++) {
			System.out.println("Digite um valor A");
			a[i] = in.nextInt();
			System.out.println("Digite um valor B");
			b[i] = in.nextInt();
		}
		for (int j = 0; j<a.length; j++) {
			int [] c = new int [3];
			if(a[j] == b[j]) {
				c[j] = a[j];
				System.out.println("Interseção de A em B: "+c[j]);
			}
			
			if(a[j] == b[j]) {
				c[j] = b[j];
				System.out.println("Interseção de B em A: "+c[j]);
		}
		}
	}
}
