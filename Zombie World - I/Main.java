import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean isWin(int time,int[] zombie, int initialEnergy,int minEnergy){
        int currentEnergy = initialEnergy;
        Arrays.sort(zombie);
        int i = 0;
        while (time-->0){
            if(i==zombie.length)
                break;
            if(currentEnergy>=zombie[i]){
                currentEnergy+=(currentEnergy-zombie[i]);
//                System.out.println(currentEnergy);
                i++;
            }
            else {
                return false;
            }
        }
        if(minEnergy<=currentEnergy)
            return true;
        else
            return false;
    }

    public static void main(String[] args)  {
        try {
            StringBuilder sb =new StringBuilder();
            //File ip = new File("src/com/theabhieye/input.txt");
            Scanner sc = new Scanner(System.in);
           // Scanner sc = new Scanner(ip);
            int t = sc.nextInt();
            while (t-->0){
                int n = sc.nextInt();
                int time = sc.nextInt();
                int[] zombie = new int[n];
                for (int i = 0; i < zombie.length; i++) {
                    zombie[i] = sc.nextInt();
                }
                int initialEnergy = sc.nextInt();
                int minEnergy = sc.nextInt();
                if(time<n){
                    sb.append("NO");
                    continue;
                }

                if(isWin(time,zombie,initialEnergy,minEnergy)){
                    sb.append("YES");
                }
                else {
                    sb.append("NO");
                }
            }
            System.out.println(sb);
            sc.close();
        }
        catch (Exception e )
        {
            System.out.println(e);
        }
    }
}
