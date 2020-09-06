
import java.util.*;

public class Main {
    static LinkedHashSet<Integer> lh ;
    public static int max = 6767;
    static {
        lh = getAllPrimeBySieve();
//        System.out.println(lh);
    }
    public static LinkedHashSet<Integer> getAllPrimeBySieve(){
        boolean[] arr = new boolean[max];
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i<arr.length;i++){
            if(!arr[i]) {
                for (int j = i * i; j < arr.length; j = j + i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i]) hs.add(i);
        }
        return hs;
    }

    public static int getCountConcatenatingPrime(int n){
        ArrayList<Integer> al = getAllNPrime(n);
        return getCountConcatenating(al);
    }
    public static int getCountConcatenating(ArrayList<Integer> al){
        HashSet<Integer> l = new HashSet<>();
        for(int i = 0;i<al.size();i++){
            for (int j = 0; j < al.size(); j++) {
                int x = Integer.parseInt(al.get(i)+""+al.get(j));
                if(lh.contains(x)){
                    l.add(x);
                }
            }
        }
//        System.out.println(l);
        return l.size();
    }
    public static ArrayList<Integer> getAllNPrime(int n){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i:lh) {
            if(i>n) break;
            al.add(i);
        }
        //System.out.println(al);
        return al;

    }
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
//            for (int i = 0; i <= 71; i++) {
//             //   int n = 33;
//             getCountConcatenatingPrime(n);
//            }
            int n = sc.nextInt();
            if(n<=70)
                System.out.println(getCountConcatenatingPrime(n));

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}