 
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int MOD_N = 1000000007;
    public static long fact(int n){
        long fact = 1;
        for(long i=1;i<n+1;i++) {
            fact = (fact * i);
            if(fact>MOD_N){
                fact=fact%MOD_N;
            }
        }
        return(fact);
    }

//    2^5 = 1 * 2 * 2 * 2 * 2;
    public static long power(long number ,long power){
        if(power==0)
            return 1;
        long mul = number;
        for(int i=1;i<power;i++){
            mul*=number;
            if(mul>MOD_N){
                mul=mul%MOD_N;
            }
        }
        return mul;
    }

    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            // File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            long[] arr = new long[n+1];
            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                int r = sc.nextInt();
                arr[i]= fact(r)%MOD_N;

            }
//            System.out.println(Arrays.toString(arr));
            int t = sc.nextInt();
            while (t-->0){
                int l = sc.nextInt();
                int r = sc.nextInt();
                long multi = 1;
                for(int i = l;i<=r;i++){
                    multi*=arr[i];
                    if(multi>MOD_N){
                        multi=multi%MOD_N;
                    }
                }
                long power = power(multi,r-l);
//                System.out.println(power);
                sb.append(power).append("\n");
            }
            System.out.print(sb);

            } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e);
        }
    }
}
