import javax.print.attribute.standard.PagesPerMinute;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/1/19 20:53
 */
public class Main07 {
    public static void main(String[] args) {
        app(4);
    }
    public static List<Integer> app(Integer rowIndex){
        List<Integer> cur = new ArrayList<>();
        int dp[][] = new int[rowIndex][rowIndex];

        for(int i = 0; i < rowIndex;i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }
        for(int i = 2; i < rowIndex; ++i){
            for(int j = 1; j < rowIndex; ++j){
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
            }
        }
        int[] arr = dp[rowIndex - 1];
        for(int i = 0; i < arr.length ;i++){
            cur.add(arr[i]);
        }
        return cur;
    }
}
