import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isWin(double bobEn,int[] zombie){
        Arrays.sort(zombie);
        for(int i = 0;i<zombie.length;i++) {
            int a = zombie[i];
            bobEn -= ((a % 2) + (a / 2));
//System.out.println(bobEn +" "+a+ " -> " + (a % 2) + " " + (a / 2) + " " + ((a % 2) + (a / 2)));
        }
        if(bobEn>0) return true;
        else return false;
    }
    public static void main(String[] args) {
        try {
//            File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            double bobEn = sc.nextDouble();
            if(bobEn<=0) return;
            int numberOfZombie = sc.nextInt();
            if(numberOfZombie<=0) return;
            int[] zombie = new int[numberOfZombie];
            for (int i = 0; i < numberOfZombie; i++) {
                zombie[i] = sc.nextInt();
            }
            if(isWin(bobEn , zombie))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
