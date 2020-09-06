import java.io.File;
import java.util.Scanner;

public class Main {
    public static int slice(int startingIndex,int endingIndex,int[] arr)
    {
        int sum = 0;
        for(int i=startingIndex;i<=endingIndex;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        try {
//          File ip = new File("src/com/theabhieye/input.txt");
//            Scanner sc = new Scanner(ip);
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            int[] z = new int[n];
            for (int i = 0; i < n; i++) {
                z[i] = sc.nextInt();
            }
            for (int a = 0; a < n; a++) {
                for (int b = a+2; b < n; b++) {
//                    System.out.println(z[i]+" "+z[j]);
                    int x = slice(0,a-1,z);
                    int y = slice(a+1,b-1,z);
                    if(x==y){
                        if(x==slice(b+1,n-1,z)){
                            System.out.println("Indices which form equi pair {"+a+","+b+"}");
                            System.out.println("Slices are {0,"+(a-1)+"},{"+(a+1)+","+(b-1)+"},{"+(b+1)+","+(n-1)+"}");
                            return;
                        }
                    }
                }
            }
            System.out.println("Array does not contain any equi pair");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
