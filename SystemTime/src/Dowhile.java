import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        int sum = 0;
        int number;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println(" Enter value of number: ");
            number = sc.nextInt();
            sum += number;
        } while ( number != 0);
            System.out.println(" Sum is "+sum);
        }
    }

