 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    static ArrayList<Long> al = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int d = sc.nextInt();
        permute(n,0,n.length()-1);
        Collections.sort(al);
//        System.out.println(al);
        for(long a:al){
            if(a%d==0){
                System.out.println(a);
                return;
            }
        }
        System.out.println("-1");
    }
    private static void permute(String str, int l, int r)
    {
        if (l == r) {
            al.add(Long.parseLong(str));
//            System.out.println(str);
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
