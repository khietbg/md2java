import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a");
        int a = input.nextInt();
        System.out.println("nhap so b");
        int b = input.nextInt();
        int c = 0;

        for (int i = a ; i>0 ; i--) {
            if (a % i == 0 && b % i == 0){
                c = i;
                break;
            }

            }
        System.out.println("uoc chung lon nhat la :" +c);
        }


}

