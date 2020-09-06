
import java.io.File;
import java.util.Scanner;

public class Main {
    public static int countOne(int a ,int b){
        int c = 0;
        while(true) {
//            System.out.println(a+" X "+b);
            if(a==b){
                c++;
                break;
            }
            if((a==1 && b==0) || (b==1 && a==0)){
                c++;
                break;
            }
            if(a>b){
                a=a-b;
            }
            else {
                b=b-a;
            }
            c++;
        }
        return c;
    }
    public static int getDistribution(int minLength,int maxLength,int minWidth,int maxWidth){
        int c = 0;
        for(int i=minLength;i<=maxLength;i++){
            for (int j = minWidth; j <= maxWidth ; j++) {
//                System.out.println("For "+i+" "+j);
                c+=countOne(i,j);
//                System.out.println("______________________");
            }
        }
        return c;
    }
    public static void main(String[] args) {
        try{
            StringBuilder sb = new StringBuilder();
            //File ip = new File("src/com/theabhieye/input.txt");
            //Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            System.out.println(getDistribution(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
