/**
 * @author LiFang
 * @version 1.0
 * @since 2021/12/16 17:12
 * 回文数
 */
public class Main02 {
    public static void main(String[] args) {
        isPalindrome(121);
    }
    public static boolean isPalindrome(int x) {
        if( x < 0 ){
            return false;
        }
        String str = x + "" ;
        char [] c = new char[str.length()];
        c = str.toCharArray();
        String str1 = "";
        for(int i = c.length-1 ;i >= 0 ;i --){
            str1 += c[i];
        }
        if(str1.equals(str)){
            return true;
        }
        return false;
    }
}
