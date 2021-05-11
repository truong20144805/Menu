import java.util.Scanner;

public class PositiveAndNegative {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number a: ");
        a = sc.nextInt();
        sc.close();
        if (a > 0) {
            System.out.println(+a +" is positive number ");
        } else if (a <0) {
            System.out.println(+a +" is negative number");
        } else {
            System.out.println(+a+ " is negative number or  positive number");
        }
    }
}
