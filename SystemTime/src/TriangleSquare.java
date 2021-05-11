import java.util.Scanner;

public class TriangleSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of a dimension: ");
       int a = sc.nextInt();
       sc.close();
       for (int i = 0;i < a;i ++){
           for (int j = 0; j <= i; j ++){
               System.out.print(" *");
           }
           System.out.println(" ");
       }
    }
}
