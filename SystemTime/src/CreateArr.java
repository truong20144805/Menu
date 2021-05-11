public class CreateArr {
    public static void main(String[] args) {
        int a[] = {4, 3, 5};

        a[2] = a[1] * 4;

        a[1] *= a.length;
        System.out.println(a);
    }
}
