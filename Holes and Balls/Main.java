import java.io.File;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
                StringBuilder sb = new StringBuilder();
                // File ip = new File("src/input");
                // Scanner sc = new Scanner(ip);
                Scanner sc = new Scanner(System.in);


                // Input Of Holes
                int n = sc.nextInt();
                int diameter_holes[] = new int[n];
                for (int i = 0; i < n; i++)
                    diameter_holes[i] = sc.nextInt();

                //Input of Balls
                int m = sc.nextInt();
                int diameter_ball[] = new int[m];
                for (int i = 0; i < m; i++)
                    diameter_ball[i] = sc.nextInt();

                LinkedHashMap<Integer, Integer> lhm =
                        new LinkedHashMap<Integer, Integer>();
                for (int i = 0; i < n; i++)
                    lhm.put(diameter_holes[i], i + 1);

                ArrayList<Integer> a = new ArrayList<>();

                for (int j = 0; j < m; j++) {
                    int k = 0;
                    boolean flag=false;
                    for (int i = n-1; i >=0; i--) {
                        if (diameter_holes[i] >=diameter_ball[j] && lhm.get(diameter_holes[i]) != 0) {

                            a.add(i + 1);
                            k=lhm.get(diameter_holes[i]);
                            lhm.put(diameter_holes[i], k-1);
                            flag=true;
                            break;
                        }

                    }
                    if(flag==false)
                    {
                        a.add(0);
                    }

                }
            Iterator itr=a.iterator();
            while(itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }
            }
            catch(Exception e){
            System.out.println(e);
            }
    }
}