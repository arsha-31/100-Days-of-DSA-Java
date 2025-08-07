import java.util.*;
public class prob21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<2*n;i++){
            int tc = i>n ? (2*n-i) : i;
            int sp = n - tc;
            for(int s=0;s<sp;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=tc;j++){
                System.out.print("*");
                if(j < tc) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
