
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

   public static ArrayList<Integer> getAllFactor(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1;i<=Math.sqrt((double)n);i++){
            if(n%i==0 && Math.pow(i,2)!=n){
                al.add(i);
                al.add(Math.abs(n/i));
            }
        }
        Collections.sort(al, Collections.reverseOrder());
        return al;
   }

    public static void main(String[] args) {
        try {
            //    File ip = new File("src/com/theabhieye/input.txt");
              //  Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
//            int t=sc.nextInt();
  //          while (t-->0) {
                int n = sc.nextInt();
                ArrayList<Integer> al = getAllFactor(n);
                int  k = sc.nextInt()-1;
                if(al.size()>k)
                    System.out.println(al.get(k));
                else
                    System.out.println(1);
    //        }
        }
        catch (Exception e ){
            System.out.println(e);
        }
    }
}
