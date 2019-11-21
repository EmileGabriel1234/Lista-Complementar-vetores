import java.util.Scanner;
public class exc4 {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		
		int[]a = new int [5];
		for (int i = 0; i<a.length; i++) {
			a[i] = in.nextInt();
		}
		for (int j = 0; j<a.length; j++) {
				if(a[j]%2 == 0) {
				System.out.println("Os pares são "+a[j]);
	
			}
				
		}
		
	}
}

