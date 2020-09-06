 
import java.util.Scanner;

public class Main {
    static int rockSample( int arr[],int min,int max)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>=min && arr[i]<=max)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int r=sc.nextInt();
        int count[]=new int[r];
        int arr[]=new int[s];
        int arr1[][]=new int[r][r];
        for(int i=0;i<s;i++)
            arr[i]=sc.nextInt();
        for(int i=0;i<r;i++) {

            int min=sc.nextInt();
            int max=sc.nextInt();
            count[i]=rockSample(arr,min,max);

        }
        for(int i=0;i<r;i++)
            System.out.print(count[i]+" ");
    }
}