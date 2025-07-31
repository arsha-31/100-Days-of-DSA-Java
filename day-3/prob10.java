import java.util.Scanner;
public class prob10 {
    //ggdhg
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // e.g., 54321
        int k = sc.nextInt(); // e.g., 2

        int temp = n;
        int nod = 0;

        // Count number of digits
        while (temp > 0) {
            temp /= 10;
            nod++;
        }

        k = k % nod; // handle k > nod
        if (k < 0) {
            k += nod;
        }

        int div = (int) Math.pow(10, k);
        int mult = (int) Math.pow(10, nod - k);

        int r = n % div; // last k digits
        int q = n / div; // remaining digits

        int ans = r * mult + q;
        System.out.println(ans); // Rotated number
    }
}
