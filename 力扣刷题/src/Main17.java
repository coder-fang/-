/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/18 13:47
 */
public class Main17 {
    public String longestPalindrome(String s) {

        int len = s.length();
        StringBuilder str = new StringBuilder();
        if (len == 0) return str.toString();
        int[] r = new int[2];
        for (int i = 0; i < len; i++) {
             r = app(s, i, len % 2 == 0 ? i + 1 : i);
        }
        System.out.println(str);
        return "";
    }

    private int[] app(String s, int start, int end) {
        // 存起始位置和子串长度
        int[] res = new int[2];
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            res = new int[]{start, end - start};
            start--;
            end++;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "babac";
        Main17 m = new Main17();
        m.longestPalindrome(s);
    }
}
