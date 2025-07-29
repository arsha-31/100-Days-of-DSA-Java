import java.util.Scanner;
public class prob4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int high = sc.nextInt();
        int low = sc.nextInt();
        if(low > high) {
            int temp = low;
            low = high;
            high = temp;
}
        for(int n = low; n <= high; n++) {
           int count = 0; 
           if(n < 2){
                System.out.println(n + " is not a prime number");
                continue;
              }
           for(int div = 2; div*div <= n;div++){
            if(n % div == 0){
                count++;
                break;
           }
        }
            if(count == 0){
    
            System.out.println(n + " is a prime number");
            } else {
                System.out.println(n + " is not a prime"); 
            }
        }
        sc.close();
    }
}



