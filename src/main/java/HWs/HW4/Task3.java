package HWs.HW4;

public class Task3 {
    public static void sum() {
        int count = 0;
        int sum = 0;

        for (int i = 0; i < 100; ++i) {
            if (i % 2 == 0) {
                sum += i;
                ++count;
            }
        }

        System.out.println("Сумма четных чисел " + sum);
        System.out.println("Количество четных чисел " + count);
    }
}
