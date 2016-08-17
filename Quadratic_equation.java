import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadratic_equation {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(r.readLine());
		double b = Double.parseDouble(r.readLine());
		double c = Double.parseDouble(r.readLine());
			if ((b * b) - (4 * a * c) >=0) {
		System.out.println("x1 : "+(-b + (Math.sqrt ((b*b) - (4 * a *c)))) / (2*a));
		System.out.println("x2 : "+(-b - (Math.sqrt ((b*b) - (4 * a *c)))) / (2*a)); }
			else {
				System.out.println("Корней нет");
			}
	}

}
