//   1
//  212
// 32123
//4321234
//543212345
import java.util.*;
public class prob22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i++){
            int sp = n - i;
            for(int s=0;s<sp;s++){
                System.out.print(" ");
            }
            // Print decreasing numbers from i to 1
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            // Print increasing numbers from 2 to i
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
