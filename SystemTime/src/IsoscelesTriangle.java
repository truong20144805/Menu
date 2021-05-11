import java.util.Scanner;

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println(" Enter the number of row to be printed: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        sc.close();
        for (int i = 1;i <= rows; i++){
            for (int j = rows; j >= i; j--){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
            System.out.print("* ");
        }
            System.out.println();
        }
    }
}
