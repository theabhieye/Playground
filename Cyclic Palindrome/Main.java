
import java.util.ArrayList;
import java.util.Scanner;

class Main
{
	    public static ArrayList<StringBuilder> getAllRotation(String s)
    {
        int n = s.length();
        s+=s;
        ArrayList<StringBuilder> al = new ArrayList<>();
        for (int i = 1; i < n; i++)
        {
            StringBuilder s1 = new StringBuilder();
            for (int j = 0; j != n ; j++)
                s1.append(s.charAt(i + j));
            al.add(s1);
        }
        return al;
    }


    public static boolean isPal(String s){
        char[] c = s.toCharArray();
        int i = 0 ;
        int j = c.length-1;
        while (i<j){
            if(c[i++]!=c[j--]) return false;
        }
        return true;
    }


    public static int getMinCyclicPal(String s){
        ArrayList<StringBuilder> al = getAllRotation(s);
        for (int i = 0; i <= al.size()/2; i++) {
            if(isPal(al.get(i)+"") || isPal(al.get(al.size()-i-1)+"")){
                return i+1;
            }
        }
        return -1;
    }
    public static void main(String[] arg){
        try {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            int t = sc.nextInt();
//                    1;
            while (t-->0){
                String s = sc.next();
//                        "aabb";
                if(isPal(s)){
                    sb.append("0").append("\n");
                }
                else
                    sb.append(getMinCyclicPal(s)).append("\n");
            }
            System.out.print(sb);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}