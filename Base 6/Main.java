import java.util.Scanner;

public class Main {
    static int getSum(String s)
    {
        int sum=0;
        int n=Integer.parseInt(s);
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();

        }
        for(int i=0;i<n;i++) {
            arr[i]=getSum(Integer.toString(arr[i], 6));
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                    count++;
            }
        }
        System.out.println(count);
    }

}