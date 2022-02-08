import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/6 11:45
 */
public class Main10 {

    public static int[] sortEvenOdd(int[] nums) {
        if (nums.length <= 2) {
            return nums;
        }
        int length = nums.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                list1.add(nums[i]);
            }
            if (i % 2 != 0) {
                list2.add(nums[i]);
            }
        }
       list1.sort(Comparator.naturalOrder()); //偶数 +
        list2.sort(Comparator.naturalOrder()); //奇数  -
        for (int j = 0, index = 0; j < list1.size(); j++, index += 2) {
            if (index < length) {
                nums[index] = list1.get(j);
            }

        }
        System.out.println(list1);
        System.out.println(list2);
        for (int k = list2.size()-1, index = 1; k > 0; k--, index += 2) {
            if (index < length) {
                nums[index] = list2.get(k);
            }
        }
        System.out.println(nums[0]+" "+ nums[1]+" "+nums[2]+" "+nums[3]);
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3};
        sortEvenOdd(nums);

    }
}
