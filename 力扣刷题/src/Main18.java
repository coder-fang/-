/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/19 22:58
 */
public class Main18 {
    public long[] sumOfThree(long num) {
        long[] res = new long[3];
        if(num % 3 != 0) return new long[]{};
        long n = (long) (num*1.0 / (long)3);
        res[0]= n - 1;
        res[1] = n;
        res[2] = n+1;
        return res;

    }

    public static void main(String[] args) {
        Main18 main18 = new Main18();
//        main18.sumOfThree(33);
        main18.countPairs(new int[]{3,1,2,2,2,1,3},2);
    }
    public int countPairs(int[] nums, int k) {
        int count = 0;
        int len = nums.length;
//        int i = 0,j = len - 1;
//        while(i < j && i < len && j > 0 && (i * j ) % k == 0 && nums[i] == nums[j]){
//            count++;
//            i++;
//            j--;
//        }
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if((i * j ) % k == 0 && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}

