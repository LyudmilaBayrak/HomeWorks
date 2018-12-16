package HWs.HW3;

public class Task4 {
    public static void sum(int n) {
        int a = n / 100;
        int b = n % 100 / 10;
        int c = n % 10;
        System.out.println(a + b + c);
    }
}
