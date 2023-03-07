import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner usd = new Scanner(System.in);
        System.out.println("nhap so tien usd :");
        int monney = usd.nextInt();
        int vnd = monney*23000;
        System.out.println(monney+" usd = "+ vnd +" vnd" );

    }
}