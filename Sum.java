import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Sum {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(r.readLine());
		int n = 0;
		int sum = 0;
		while (x!=0) {
			n = x % 10;
			sum = sum + n;
			x = x / 10;
		}
		
		System.out.println(sum);
		}
	
	
}
