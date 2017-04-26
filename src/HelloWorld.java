import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by daciocan on 4/3/2017.
 */
public class HelloWorld {
    int a,b,s;
    public int sum () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a:");
        a = Integer.parseInt(br.readLine());
        System.out.print("Enter b:");
        b = Integer.parseInt(br.readLine());
        s=a+b;
       return s;
    }
    public static void main (String[] args) throws IOException {
        HelloWorld obj=new HelloWorld();
        System.out.println("a+b="+ obj.sum());

    }


}
