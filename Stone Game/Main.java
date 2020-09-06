import java.util.Scanner;
public class Main {
    static boolean whowin(int n){
        if(n==1)
            return true;
        int alice=0;
        int c=n;
        int a=4;
        int b=1;
        int bob=0;
        int count=1;
        while(c>=0) {

            if (count % 2 != 0) {
                if (c>=a) {
                    c = c - a;
                    if(c==0) {
                        alice++;
                        break;
                    }
                } else {
                    c = c - b;
                }
                if(c==1)
                {
                    bob++;
                }
            }
            else
            {
                if (c>=a) {
                    c = c - a;
                } else {
                    c = c - b;
                }
                if(c==1)
                    alice++;
            }

            count++;

        }

        if(alice==1)
            return true;
        else

        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            boolean b=whowin(n);
            if(b)
            System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}