import java.io.File;
import java.util.Scanner;

public class Main{

    static int countDigit(int n){
        int count=0;
        int a=0;
        while(n!=0){
            a=n%10;
            n/=10;
            count++;
        }
        int c=5-count;
        return c;
    }
    public static void main(String[] args) {
        try{
            
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int count=0;
            int k=n;
            int a=2;
            int b=0;
            int c=0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (j >= k) {
                        b = a *(2* a - 1);
                        c = countDigit(b);
                        if (c == 4) {
                            System.out.print("0000" + b + " ");
                            for (int x = 0; x <3; x++)
                                System.out.print(" ");
                        }
                        else if (c == 3) {
                            System.out.print("000" + b + "  ");
                            for (int x = 0; x <3; x++)
                                System.out.print(" ");
                        }
                        else if (c == 2) {
                            System.out.print("00" + b + " ");
                            for (int x = 0; x <4; x++)
                                System.out.print(" ");
                        }
                        else if (c == 1) {
                            System.out.print("0" + b + " ");
                            for (int x = 0; x <4; x++)
                                System.out.print(" ");
                        }
                        else {
                            System.out.print(b + " ");
                            for (int x = 0; x < 4; x++)
                                System.out.print(" ");
                        }
                        a += 2;
                    } else {
                        for (int x = 0; x <5; x++)
                     System.out.print(" ");
                }
                }
                k--;
                System.out.println();
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}