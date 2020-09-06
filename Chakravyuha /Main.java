import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            StringBuilder sb = new StringBuilder();
//            File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int count=0;
            ArrayList<Integer[]> al = new ArrayList<>();
            al.add(new Integer[]{0,0});
            for (int i = 0; i < (n+1)/2; i++) {
                for(int j = i; j <= n-i-1; j++) {
                    arr[i][j] = ++count;
                    if(count%11==0) {
                        al.add(new Integer[]{i,j});
                    }
                }
                for (int j = i + 1; j <= n - i - 1; j++) {
                     arr[j][n-i-1] = ++count;
                    if(count%11==0) {
                        al.add(new Integer[]{j,n-i-1});
                    }
                }
                for (int j = n - i - 2; j >= i; j--) {
                    arr[n - i - 1][j] = ++count;
                    if(count%11==0) {
                        al.add(new Integer[]{n - i - 1,j});
                    }
                }
                for (int j = n - i - 2; j > i; j--) {
                    arr[j][i] = ++count;
                    if(count%11==0) {
                        al.add(new Integer[]{j,i});
                    }
                }
            }
            for (int[] a :arr) {
                for (int b:a) {
                    System.out.print(b+"\t");
                }
                System.out.println();
            }
            System.out.println("Total Power points : "+al.size());
            for (Integer []a:al) {
                System.out.println("("+a[0]+", "+a[1]+")");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
