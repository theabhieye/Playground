import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static String[] getAt1Pos(int[] main,String[] monkey){
        String[] temp = new String[main.length];
        for (int m = 0; m < monkey.length; m++) {
            temp[main[m]-1] = monkey[m];
        }
        return temp;
    }

    public static void main(String[] args) {
        try{
            StringBuilder sb = new StringBuilder();
//            File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                int count = 1;
                int[] arr = new int[sc.nextInt()];
                String[] m = new String[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = sc.nextInt();
                    m[i] = "m"+(i+1);
                }
                String initialPos = Arrays.toString(m);
                String temp = "";
                while (true) {
                    m = getAt1Pos(arr, m);
                    temp = Arrays.toString(m);
                    if(initialPos.equals(temp)){
                        break;
                    }
                    count++;
                }

                sb.append(count).append("\n");
            }
            System.out.print(sb);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
