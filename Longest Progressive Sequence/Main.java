import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            // StringBuilder sb = new StringBuilder();
            // File ip = new File("src/com/theabhieye/input.txt");
            // Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            StringBuilder s= new StringBuilder(arr[0] + "");
            ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> l = new ArrayList<>();
            l.add(arr[0]);
            int maxLength = 0;
            for (int i = 1 ; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    al.add(l);
                    maxLength = Math.max(maxLength,l.size());
                    l = new ArrayList<>();
                }
                l.add(arr[i]);
            }
            maxLength = Math.max(maxLength,l.size());
            al.add(l);
            for(ArrayList<Integer> arrayList:al){
                if(arrayList.size() == maxLength){
                    for (int a:arrayList) {
                        System.out.print(a+" ");
                    }
                    return;
                }
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
