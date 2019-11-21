import java.util.Scanner;
public class exc13 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);	
		
		int[]a = new int [5], b = new int [5];
		
		for (int i = 0; i<a.length; i++) {
			System.out.println("Digite um valor");
			a[i] = in.nextInt();
			}
		for (int j = 0; j<a.length; j++) {
			if(a[j]%2 == 0) {
			b[j] = b[j]+1;
			System.out.println(b[j]);
			}
			else {
				System.out.println((b[j])=0);
			}
	   }
    }
 }