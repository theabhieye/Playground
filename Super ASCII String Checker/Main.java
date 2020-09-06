
import java.util.Arrays;
import java.util.Scanner;

class Main
{
    public static boolean isSuperString(String s){
        char[] c = s.toCharArray();
        int[] a = new int[27];
        for(char c1:c){
            a[c1-97]++;
        }
        for (int i = 1; i <= 26; i++) {
            if(a[i-1]!=0 && i!=a[i-1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            StringBuilder sb = new StringBuilder();
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-->0){
                if(isSuperString(sc.next())) sb.append("YES ");
                else sb.append("NO ");
            }
            System.out.print(sb);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}