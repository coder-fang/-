/**
 * @author LiFang
 * @version 1.0
 * @since 2021/12/15 15:44
 * 构建数组
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 0, 1, 2, 3, 4};
        buildArray(arr);
    }

    public static int[] buildArray(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < ans.length ; j++) {
                ans[j] = nums[nums[j]];
            }
        }
        for (int an : ans) {
            System.out.print(an);
        }
        return ans;
    }
}
