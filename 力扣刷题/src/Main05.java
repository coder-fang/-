import java.math.BigDecimal;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/1/18 19:19
 */
public class Main05 {

    public static void main(String[] args) {
       String a = "1010";
       String b = "0001";
       addBinary(a,b);
    }
        public static String addBinary(String a, String b) {
            // 另一种解法，没看懂。。。。
            // StringBuffer sb = new StringBuffer();
            // int carry = 0, i = a.length()-1, j = b.length()-1;
            // while(i >= 0 || j >= 0 || carry != 0){
            //     if(i >= 0) carry += a.charAt(i--)-'0';
            //     if(j >= 0) carry += b.charAt(j--)-'0';
            //     sb.append(carry%2);
            //     carry /= 2;
            // }
            // return sb.reverse().toString();

            // 解法二：

            // int c = 0, i = a.length() - 1, j = b.length() - 1;
            // StringBuilder sb = new StringBuilder();
            // char[] charA = a.toCharArray();
            // char[] charB = b.toCharArray();
            // while (c > 0 || i >= 0 || j >= 0){
            //     int valA = i >= 0 ? charA[i--] - '0' : 0;
            //     int valB = j >= 0 ? charB[j--] - '0' : 0;
            //     int sum = valA + valB + c;
            //     c = sum >> 1;
            //     sb.append(sum % 2);
            // }
            // return sb.reverse().toString();

            // 解法三：
            //        if (a==null)return  b;
//        if (b==null) return  a;
            int i=a.length()-1,j=b.length()-1,jiwei=0,sum=0;
            StringBuilder sb=new StringBuilder();
            while (i>=0||j>=0){
                sum=jiwei;
                if (i>=0){
                    sum+=a.charAt(i--)-'0';
                }
                if (j>=0){
                    sum+=b.charAt(j--)-'0';
                }
                jiwei=sum/2;
                sb.insert(0,sum%2);
            }
            if (jiwei==1)sb.insert(0,1);
            System.out.println(sb);
            return sb.toString();
        }
    }
