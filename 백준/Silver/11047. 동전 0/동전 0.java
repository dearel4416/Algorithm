import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] coin = new int[n];
		int count = 0;
		
		for(int i = 0; i < n; i++)
			coin[i] = scan.nextInt();
 
		for(int i = n - 1; i >= 0; i--) {
			if(coin[i] <= k) {
				count += (k / coin[i]);
				k = k % coin[i];
			}
		}
		System.out.println(count);
	}
}