import java.util.Scanner;

public class CreatArray {
    public static void main(String[] args) {
        int [] arr = new int[100];
       int size =inputSize();
        inputArray(arr,size);
    }
    static int inputSize(){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        return size;
    }
    static  void inputArray(int[]arr, int size){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter array "+size+ " element: ");
        for (int i = 0; i< size;i++){
            System.out.print("Arr["+i+"] = ");
            arr[i]= sc.nextInt();
        }

    }
}
