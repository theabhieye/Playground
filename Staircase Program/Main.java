
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            StringBuilder sb = new StringBuilder();
            // File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            long a = 0 ;
            long b = 1;
            n+=2;
            while (n-->0){
                long fab = a+b;
                if(n==0)
                    System.out.print(a);
                a=b;
                b=fab;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}