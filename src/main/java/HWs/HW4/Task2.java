package HWs.HW4;

public class Task2 {
    public static boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            if (i >= 4) {
                return false;
            }

            if (nums[i] == 9) {
                return true;
            }
        }

        return false;
    }
}
