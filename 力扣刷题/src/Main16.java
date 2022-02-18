/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/17 19:27
 */
public class Main16 {
        char str ;
        public boolean canPermutePalindrome(String s) {
            char[] ch = s.toCharArray();

            for(int i = 0; i < ch.length;i++){
                str ^= ch[i];
            }

            System.out.println(str+"====");
            return (str + "").equals("");
        }

    public static void main(String[] args) {
        Main16 m = new Main16();
        m.canPermutePalindrome("abbcdef");
    }
}
