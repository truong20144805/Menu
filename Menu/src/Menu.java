import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        int choice;
        int[] arr = new int[100];
        int size = 10;
        Scanner sc = new Scanner(System.in);
//        Tạo menu
        do{
            menu();
            System.out.println("Nhập lựa chọn :");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    size = inputSize();
                    inputArray(arr,size);
                    break;
                case 2:
                    displayArray(arr,size);
                    break;
                case 3:
                    size = inputSize();
                    for (int i = 0;i < size;i++){
                        if(arr[i]%2==0){
                            int max = findMaxEven(arr,size);
                                System.out.println("Số chẵn lớn nhất trong mảng là :" + max );
                    }else
                            System.out.println(" Mảng không có số chẵn");
                   }
                    break;
                case 4:
                    size = inputSize();
                    for (int i = 0; i < size; i++){
                        if (arr[i]%2==0){
                            int sumEven = sumEven(arr,size);
                            System.out.println(" Tổng các số chẵn trong mảng là:" +sumEven);
                        } else
                            System.out.println(" Mảng không có số chẵn");
                    }
                    break;
                case 5:
                    size = inputSize();
                    for (int i = 0; i < size; i++){
                        if (arr[i]%2==0){
                            displayEven(arr,size);
                        } else
                            System.out.println("Mảng không có số chẵn");
                    }
                    break;
                case 6:

                case 7:
                case 8:
                    int [] reverseArray = reverseArr(arr,size);
                    System.out.println("Mảng đảo ngược là: "+reverseArray);
                    break;
                case 9:
                    displayPrimeInArray(arr,size);
                    break;
                case 10:
                    sortArr(arr,size);
                    System.out.println(" Mảng sắp xếp lại là: "+arr);
                    break;
                case 11:
                    System.exit(0);
                    break;
            }
        } while ( choice >= 1 && choice <= 11);
    }
    // Phương thức menu
    static void menu(){
        System.out.println("============MENU===========");
        System.out.println("1.Nhập vào mảng có kích thước N (0 < N <100)");
        System.out.println("2.Hiển thị mảng vừa nhập ");
        System.out.println("3.Tìm số chẵn lớn nhất trong mảng ");
        System.out.println("4.Liệt kê danh sách các số chẵn trong mảng ");
        System.out.println("5.Tính tổng các số chẵn trong mảng ");
        System.out.println("6.Nhập vào giá trị và vị trí cần chèn của giá trị đó trong mảng,chèn giá trị đó vào mảng ");
        System.out.println("7.Xóa tất cả các phần tử có giá trị X (nhập từ bàn phím) khỏi mảng ");
        System.out.println("8.Đảo ngược mảng ban đầu ");
        System.out.println("9.Hiển thị danh sách các số nguyên tố trong mảng ");
        System.out.println("10.Sắp xếp mảng theo thứ tự giảm dần ");
        System.out.println("11.Thoát ");
    }
//    Nhập vào kích thước mảng
    static  int inputSize(){
        int N;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Nhập vào mảng có kích thước N (0 < N <100)");
            N = sc.nextInt();
        } while (N <=0 || N >= 100);
        return N;
    }
    static void inputArray(int[] arr, int N){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mảng gồm N phần tử: ");
        for (int i = 0; i < N; i++){
            System.out.print("arr["+ i +"] =");
            arr[i] = sc.nextInt();
        }
    }
//    Hiển thị mảng
    static void displayArray( int[] arr,int N){
        System.out.println("Mảng là :");
        for (int i = 0; i < N; i++){
            System.out.print(arr[i] + " ");
        }
    }
// Tim số chẵn lớn nhất trong mảng
    static  int findMaxEven(int[] arr, int N){
        int max =arr[0];
                for (int j = 0; j < N; j++){
                    if (arr[j]> max && arr[j]%2==0){
                        max= arr[j];
                    }
                }
                return max;
        }
// Tính tổng các số chẵn trong mảng
    static  int sumEven(int [] arr, int N){
        int sumEven = 0;
        for (int k = 0; k < N; k++){
            if (arr[k]%2==0){
                sumEven += arr[k];
            }
        }
        return  sumEven;
    }

// Liệt kê các số chẵn trong mảng
    static void displayEven(int[]arr, int N){
        for (int j = 0;j < N; j++){
            if (arr[j]%2==0){
                System.out.println(" Phần tủ chẵn "+ arr[j]+" ở vị trí thứ: "+j);
            }
        }
    }
//     Nhập vào giá trị và vị trí chèn trong mảng
//    Đảo ngược mảng ban đầu
static int[] reverseArr(int[] arr, int size) {
    for (int i = 0, j = size - 1; i < j; i++, j--) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    return arr;
}
// Hiển thị số nguyên tố trong mảng
    static void displayPrimeInArray(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                if (arr[i] % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
//    Sắp Xếp mảng theo thứ tự giảm dần
    static int[] sortArr(int[] arr, int size) {
        for (int i =0; i<size-1;i++) {
            for (int j = i+1; j<size;j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

 }
