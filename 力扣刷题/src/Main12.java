import java.util.Scanner;

/**
 * @author LiFang
 * @version 1.0
 * @since 2022/2/8 22:22
 */
public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m=scanner.nextInt();
        double p =1.0/n;
        double [][]b=new double[m+1][n+1];  //防止数组越界
        if(n==1) {//当n等于1 m>m时几率为1
            b[m][n]=1;
            System.out.print("1.0000");
            return;
        }
        if(n>1&&m<n) {//当m<n时几率为0
            b[m][n]=0;
            System.out.print("0.0000");
            return;
        }
        for(int i=1;i<=m;i++) {
            for(int j=1;j<=n;j++) {
                if (i<j) b[i][j]=0;       //当m<n时几率为0
                if (j==1){
                    b[i][j]=Math.pow(p,i-1);        //当i张集齐1种的概率
                }else { //种类数大于1时 从夫和不重复
                    b[i][j]=b[i-1][j]*(j*1.0/n)+b[i-1][j-1]*((n-j+1)*1.0/n);        //当i张集齐j种的概率
                }
            }
        }
        System.out.printf("%.4f",b[m][n]);
    }
}
