import java.io.*;
public class Even_or_Odd {
 
  public static void main(String[] args) throws IOException { 
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(r.readLine());
    if (n % 2 == 0) {
      System.out.println("Число четное");
    }
      else System.out.println("Число нечетное");
  }
  

  
}