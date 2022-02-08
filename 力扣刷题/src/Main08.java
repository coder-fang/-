import org.omg.PortableInterceptor.INACTIVE;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/1/24 13:56
 */
public class Main08 {
    public static void main(String[] args) {
//        int num = 16;
//       String a = Integer.toString(num,4);
//        System.out.println(a);
        int[] arr = {2,4,1};
        Solution.maxProfit(arr);
    }
    static class Solution {
        public static int maxProfit(int[] prices) {
            int min = prices[0];
            int indexMin = 0;
            for(int i = 0; i < prices.length; i++ ){
                if(min >= prices[i]){
                    min = prices[i];
                    indexMin = i;
                }
            }
            if(indexMin == prices.length-1){
                return 0;
            }else{
                int max = prices[indexMin];
                int indexMax = 0;
                for(int j = indexMin; j < prices.length;j++ ){
                    if(max <= prices[j]){
                        max = prices[j];
                        indexMax = j;
                    }
                }
                if(indexMax == indexMin){
                    return 0;
                }else{
                    return prices[indexMax] - prices[indexMin];
                }
            }
        }
    }
}
