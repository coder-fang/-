import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LiFang
 * @version 1.0
 * @since 2021/12/15 16:41
 * 整数反转
 */
public class Main01 {
    public static void main(String[] args) {
        reverse(-153);
    }

    public static int reverse(int x) {
        boolean bo = false;
        String str = x + "";
        char[] charArr = str.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == '-') {
                bo = true; //是负数
                continue;
            }
            list.add(charArr[i]);
        }

        StringBuilder str1 = new StringBuilder();
        for (int j = list.size() - 1; j >= 0; j--) {
            str1.append(list.get(j));
        }
        String str2 = str1.toString();
        if (bo) {
            str2 = "-" + str1;
        }
        str2 = str2.trim();
        try {
            int o = Math.toIntExact(Long.valueOf(str2));
            System.out.println(o);
            return o;
        }catch(Exception e){
           return 0;
        }
    }
}
