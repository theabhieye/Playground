import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static boolean findSum(int[] arr,int target,int st){
        int i=st,j=arr.length-1;
        while (i<j){
            int sum = arr[i]+arr[j];
            if(sum==target)
                return true;
            if(target>sum)
                i++;
            else
                j--;
        }
        return false;
    }
    public static void main(String[] args) {
        try{
//            StringBuilder sb = new StringBuilder();
            // File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] bottles = new int[size];
            for(int i=0;i<size;i++){
                bottles[i]=sc.nextInt();
            }
            int target = sc.nextInt();
            Arrays.sort(bottles);
            for (int i = 0; i < size; i++) {
                if(findSum(bottles,target-bottles[i],i+1)){
                    System.out.println("TRUE");
                    return;
                }
            }
            System.out.println("FALSE");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
