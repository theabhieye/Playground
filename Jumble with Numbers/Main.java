import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        try {
          
            Scanner sc = new Scanner(System.in);
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            int m=sc.nextInt();
            if(t1<0 || t2<0 || m<0){
                System.out.println("Invalid Input");
                return;
            }
            int r=0;
            int n=1;
           int count=0;
           while(true) {
               r = n*(2*n - 1);
               if (r>=t1 && r<=t2) {
                   count++;
               }
               if (r > t2) {
                   if (count !=m) {
                       System.out.println("No number is present at this index");
                       break;
                   }
               }
               if(m==count)
               {
                   System.out.println(r);
                   break;
               }

               n++;
           }



        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}