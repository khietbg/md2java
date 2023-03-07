import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner PTB2 = new Scanner(System.in);
        System.out.println("nhap so a :");
        Double a = PTB2.nextDouble();
        System.out.println("nhap so b :");
        Double b = PTB2.nextDouble();
        System.out.println("nhap so c :");
        Double c = PTB2.nextDouble();
        Double delta = b*b-(4*a*c);
        if(delta<0){
            System.out.println("phuong trinh vo nghiem");
        }if(delta==0){
            System.out.println("phuong trinh co 2 nghiem kep :" + (-b)/(2*a));
        }
        if (delta>0){
            System.out.println("phuong trinh co 2 nghiem phan biet"+ "x1 :"+ ((-b)+Math.sqrt(delta))/(2*a) + "  x2 :"+ ((-b)-Math.sqrt(delta))/(2*a));
        }
    }
}

