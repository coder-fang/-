import java.util.*;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/1/19 10:52
 * 349. 两个数组的交集  done
 */
public class Main06 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4};
        int[] nums2 = {1, 3, 2, 4, 4};

        intersection(nums1, nums2);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet();
        Set<Integer> set2 = new HashSet();
        Set<Integer> arrSet = new HashSet<>();

        for (int element : nums1) {
            set1.add(element);
        }
        for (int item : nums2) {
            set2.add(item);
        }
        for (int s1 : set1) {
            for (int s2 : set2) {
                if (s1 == s2) {
                    arrSet.add(s1);
                }
            }
        }

        int[] num3 = new int[arrSet.size()];
        ArrayList<Integer> objects = new ArrayList<>(arrSet);

        for (int i = 0; i < num3.length; i++) {
            num3[i] = objects.get(i);
        }
        return num3;
    }
}
