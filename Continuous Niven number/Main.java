import java.io.File;
import java.util.Scanner;

public class Main {
    public static int getSum(int n){
        int sum = 0;
        int t = n;
        while (t!=0){
            sum+=t%10;
            t/=10;
        }
        return sum;
    }
    public static int convertBase(int n,int fromBase, int toBase)
    {
        String s = n+"";
        return Integer.parseInt(Integer.toString(Integer.parseInt(s, fromBase), toBase));
    }
    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
             //File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int base = sc.nextInt();
            int t = sc.nextInt();
            if(!(t>1 && t<7) ){
                System.out.println("Invalid Input");
                return;
            }
            if(!(base>=2 && base<=10)){
                System.out.println("Invalid Input");
                return;
            }
            
            int count = 0;
            int b=base;
            while (true) {
//                 int r = MathUtility.convertBase(base, 10, b);
//                System.out.println("base "+base);
//                System.out.println("convert to base 5 "+r);
                int sum = getSum(convertBase(base, 10, b));
//                System.out.println("sum "+sum);
                if (base % sum == 0) {
//                    System.out.println("count "+count);
                    count++;
                }
                else {
                    count = 0;
                }
                if (count == t) {
                    int temp = base + 1;
                    sum = getSum(convertBase(temp, 10, b));
                    if (temp % sum != 0) {
                        System.out.println(convertBase((base-(count-1)), 10, b));
                        return;
                    } else {
                        count = 0;
                    }
                }
                base++;
//                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
