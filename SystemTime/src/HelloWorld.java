import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter name:");
        sc.close();
        String name = sc.nextLine();
        System.out.println("Hello "+name);
    }
}
