import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        boolean isPrime = true;
        int temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number need check: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 2; i < Math.sqrt(num);i++){
            temp = num %i;
            if (temp==0){
                isPrime =false;
                break;
            }
        }
        if (isPrime){
            System.out.println(num+" is a prime number");
        } else
            System.out.println(num+" is not a prime number");



    }
}
