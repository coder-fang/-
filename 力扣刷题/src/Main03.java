/**
 * @author LiFang
 * @version 1.0
 * @since 2021/12/17 15:23
 * 有效的括号
 */
public class Main03 {
    public static void main(String[] args) {

    }
}
class Solution {
    public boolean isValid(String s) {
        int length = s.length() / 2 ;
        for (int i = 0; i < length; i++) {
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        }
        return s.length() == 0;
    }
}
