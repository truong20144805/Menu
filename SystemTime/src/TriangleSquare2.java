import java.util.Scanner;

public class TriangleSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of a dimension:");
        int b = sc.nextInt();
        sc.close();
        for (int i=0;i <= b; i ++){
            for (int j = b;j > i; j --){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
