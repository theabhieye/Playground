import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
     public static int getWinner(int[][] pos){
         int[] winner =new int[pos.length];

         int[] arr = new int[pos.length];
         int index = 0;
         for (int i = 1; i < pos[0].length; i+=2) {
             for (int j = 0; j < pos.length; j++) {
                 arr[index++] = pos[j][i];
             }
             index=0;
             int max = getMax(arr);
             for (int j = 0; j < arr.length; j++) {
                if(max==arr[j]){
                    winner[j]++;
                }
             }
         }
         int max = getMax(winner);
         for (int i = 0; i < winner.length; i++) {
             if(max == winner[i]) return i+1;
         }
         return 0;
    }

    public static int getMax(int[] a){
        int max = Integer.MIN_VALUE;
        for (int i:a)   max = Math.max(max,i);
        return max;
    }

    public static void main(String[] args) {

        try{
            StringBuilder sb = new StringBuilder();
//            File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);

            int numberOfParti = sc.nextInt();
            int totalTime = sc.nextInt();
            int[][] pos = new int[numberOfParti][totalTime];
            for (int i = 0; i < pos.length; i++) {
                for (int j = 0; j < pos[i].length; j++)
                    pos[i][j] = sc.nextInt();

                int perStep = sc.nextInt();

                for (int j = 0; j < pos[i].length; j++)
                    pos[i][j]*=perStep;

                for (int j = 1; j < pos[i].length; j++)
                    pos[i][j]+=pos[i][j-1];

            }
            System.out.println(getWinner(pos));

        }
        catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}
