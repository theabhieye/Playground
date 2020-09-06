import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try
        {
            StringBuilder sb = new StringBuilder();
//            File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int amt = sc.nextInt();
            int tenure  = sc.nextInt();
            double[][] bankA = new double[sc.nextInt()][2];
            double totalIntA = 0;
            for (int i = 0; i < bankA.length; i++) {
                bankA[i][0] =sc.nextDouble();
                bankA[i][1] =sc.nextDouble();
                totalIntA +=bankA[i][1];
            }
            double[][] bankB = new double[sc.nextInt()][2];
            double totalIntB= 0;
            for (int i = 0; i < bankB.length; i++) {
                bankB[i][0] =sc.nextDouble();
                bankB[i][1] =sc.nextDouble();
                totalIntB +=bankB[i][1];
            }
            if(totalIntA>totalIntB){
                System.out.println("Bank B");
            }
            else {
                System.out.println("Bank A");
            }
//            System.out.println("bankA");
//            for (double[] i:bankA){
//                System.out.println(Arrays.toString(i));
//            }
//            System.out.println("bankB");
//            for (double[] i:bankB){
//                System.out.println(Arrays.toString(i));
//            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
