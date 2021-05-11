import java.util.Scanner;

public class SumOfNatural {
    public static void main(String[] args) {
        int num,count,total = 0;
        System.out.println(" Enter number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        sc.close();
        for(count = 1;count <= num;count++){
            total +=  count;
        }
        System.out.println(" Sum of n first natural number is: "+ total);
    }
        }
