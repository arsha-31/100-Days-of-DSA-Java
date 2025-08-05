//Question Statement: 
//1. You are required to check if a given set of numbers is a valid pythagorean triplet.
//2. Take as input three numbers a, b and c.
//3. Print true if they can form a pythagorean triplet and false otherwise.
import java.util.Scanner;
public class prob13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Check if a, b, c can form a Pythagorean triplet
        boolean isTriplet = (a * a + b * b == c * c) || 
                            (a * a + c * c == b * b) || 
                            (b * b + c * c == a * a);
        
        System.out.println(isTriplet);
        sc.close();
    }
}