//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1
// pascal's triangle

import java.util.*;
public class prob23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int num = 1;
            // Print leading spaces
            for(int s=0; s<n-i-1; s++) {
                System.out.print(" ");
            }
            // Print numbers
            for(int j=0; j<=i; j++) {
                System.out.print(num + " ");
                num = num * (i-j) / (j+1);
            }
            System.out.println();
        }
    }
}
