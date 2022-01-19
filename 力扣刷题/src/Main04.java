/**
 * @author LiFang
 * @version 1.0
 * @since 2022/1/18 15:26
 */
public class Main04 {

    public static void main(String[] args) {
        int[] nums = {2, 2};
        StringBuilder str = new StringBuilder();
        int multi = 1;
        for (int n : nums) {
            multi *= n;
        }
        int[][] arr = new int[nums.length][multi];
        for (int i = 0; i < nums.length; i++) {
//            int m = multi;
            if (nums[i] > 1) {
                int index = nums[i] - 1;
                // 内部数组的长度
                int numsLength = nums.length;
//                int mm = m;
                for (int j = 0, k = 0; j < index; j++, k++) {
                    str.append(j);
                    if (str.length() == nums[i]) {
                        char[] carry = str.toString().toCharArray();
                        int myindex = 0;
                        for (char c : carry) {
                            if(myindex < carry.length){
                                int d = (int) c;
                                nums[myindex] = d;
                                myindex++;
                            }
                        }
                         arr[k] = nums;
                    }

                }
                for (int[] ints : arr) {
                    for (int anInt : ints) {
                        System.out.print(anInt+",");
                    }
                    System.out.print(",");
                }
            }
        }
//        System.out.println("str:" + str);
    }
}
