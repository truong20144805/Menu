import java.util.Scanner;

public class DisplayPrimeNumber {
    public static void main(String[] args) {
        int num,i;
        String StringNumber = " ";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number you want dislay: ");
        num = sc.nextInt();
        sc.close();
        for (i = 1; i <= num; i++){
       int count = 0;
       for (i = num; i >=num; i--){
           if (i%num==0){
               count ++;
           }
       }
        }

    }
}
