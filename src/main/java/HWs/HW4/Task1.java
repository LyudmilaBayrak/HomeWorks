package HWs.HW4;

public class Task1 {
    public static int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 9) {
                ++count;
            }
        }

        return count;
    }
}
