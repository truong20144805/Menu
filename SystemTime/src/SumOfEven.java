import java.util.Scanner;

public class SumOfEven {
    public static void main(String[] args) {
        int num,count,total = 0;
        System.out.println(" Enter even number: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(count = 0; count <= num;count++){
            total += 2*count;
        }
        System.out.println(" sum of "+num+" number even is "+total);
    }
        }
