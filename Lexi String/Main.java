import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            // File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
           Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            if(t<1 || t>100 ){
                System.out.println("Invalid input");
            }
            while (t-->0)
            {
                String newLex = sc.next();
                String order = sc.next();
                int i = 0;
                int[] arr = new int[order.length()];
                char[] c1 = order.toCharArray();
                for (char c : c1) {
                    arr[i++] = newLex.indexOf(c);
                }
//            System.out.println(Arrays.toString(arr));
                Arrays.sort(arr);
                StringBuilder sb = new StringBuilder();
//            System.out.println(Arrays.toString(arr));
                for (int j : arr) {
                    sb.append(newLex.charAt(j));
                }
                System.out.println(sb);
            }
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
