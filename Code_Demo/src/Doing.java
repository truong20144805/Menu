import java.util.Scanner;

public class Doing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a: ");
        a = sc.nextDouble();
        System.out.println("Enter b: ");
        b = sc.nextDouble();
        System.out.println("Enter c: ");
        c = sc.nextDouble();
        sc.close();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double discriminant = quadraticEquation.getCriminant();
        if (discriminant >= 0){
            System.out.println("quadratic equation has 2 roots: "+quadraticEquation.getRoot1() + " and "+ quadraticEquation.getRoot2());
        } else  if (discriminant==0){
            System.out.println("quadratic equation have roots: \"+quadraticEquation.getRoot1()");
        }
        else
            System.out.println("The equation has no roots");
    }
}
