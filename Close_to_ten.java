import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Close_to_ten {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
			double n = Double.parseDouble(r.readLine());
			double m = Double.parseDouble(r.readLine());
			if (Math.abs(n-10) < Math.abs(m-10)) {
				System.out.println(n);
			}
			else {
				System.out.println(m);
			}
	}

}
