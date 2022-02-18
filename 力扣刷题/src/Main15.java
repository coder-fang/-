import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/17 12:01
 */
    public class Main15 {

        public List<List<Integer>> permute(int[] nums) {
            int len = nums.length;
            // 使用一个动态数组保存所有可能的全排列
            List<List<Integer>> res = new ArrayList<>();
            if (len == 0) {
                return res;
            }

            boolean[] used = new boolean[len];
            ArrayList<Integer> path = new ArrayList<>(len);

            dfs(nums, len, 0, path, used, res);
            return res;
        }

        private void dfs(int[] nums, int len, int depth,
                         ArrayList<Integer> path, boolean[] used,
                         List<List<Integer>> res) {
            if (depth == len) {
//                res.add(new ArrayList<>(path));
                res.add(path);
                return;
            }

            for (int i = 0; i < len; i++) {
                if (!used[i]) {
                    path.add(nums[i]);
                    used[i] = true;

                    System.out.println("  递归之前 => " + path);
                    dfs(nums, len, depth + 1, path, used, res);

                    used[i] = false;
                    path.remove(path.size()-1);
                    System.out.println("递归之后 => " + path);
                }
            }
        }

         public static void main(String[] args) {
             int[] nums = {1, 2, 3};
             Main15 solution = new Main15();
             List<List<Integer>> lists = solution.permute(nums);
             System.out.println(lists);
         }
    }

