import java.util.ArrayList;
import java.util.List;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/19 23:11
 */
public class Main19 {
    public static void main(String[] args) {
        Main19 main19 = new Main19();
        main19.maximumEvenSplit(10);
    }
    public List<Long> maximumEvenSplit(long finalSum) {
        if(finalSum % 2 != 0) return new ArrayList<>();
        List<Long> list = new ArrayList<>();
//        dfs(finalSum);
        while(finalSum >= 2 && finalSum % 2 ==0){
            finalSum = finalSum / 2;
            if(finalSum % 2 != 0) {
               long b1 = finalSum - 1;
               long b2 = finalSum + 1;
                list.add(b1);
                list.add(b2);
               if(b1 > 2 ) {
                   long b3 = b1 - 2;
                   long b4 = b2 + 2;
                   list.add(b3);
                   list.add(b4);
               }
            }
        }
        System.out.println(list+"-------");
        return list;
    }
//    public void dfs(long num){
//        if()
//        for (int i = 0; i < num; i++) {
//
//        }
//    }
}
