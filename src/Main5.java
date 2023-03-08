import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while(count < 20) {
            boolean isPrime = true;
            for(int i=2; i<=num/2; i++) {
                if(num%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}
