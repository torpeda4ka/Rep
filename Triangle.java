import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(r.readLine());
		double b = Double.parseDouble(r.readLine());
		double s=(a*b)/2;
		double p=a+b+(Math.sqrt((a*a) + (b*b)));
		System.out.println("Периметр : "+p);
		System.out.println("Площадь : "+s);
		
	}

}
