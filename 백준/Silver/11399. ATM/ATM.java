import java.util.Scanner;
import java.util.Arrays;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		int prev = 0; // 이전 대기시간 누적 
		int sum = 0; // 대기시간 총합 
		
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		Arrays.sort(arr);
				
		for(int i = 0; i < n; i++) {	
			sum += prev + arr[i];
			prev += arr[i];
		}
		System.out.println(sum);
	}
}