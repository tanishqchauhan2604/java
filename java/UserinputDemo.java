/*
	WAP to use InputStreamReader and BufferedReader classes
*/
import java.io.*;
class UserinputDemo {
   public static void main(String[] args) throws IOException {
     InputStreamReader in = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(in);
     int a,b,sum=0;
     a = Integer.parseInt(br.readLine());
     b = Integer.parseInt(br.readLine());
     sum = a + b;
     System.out.println("The sum is "+sum);
   }

}
