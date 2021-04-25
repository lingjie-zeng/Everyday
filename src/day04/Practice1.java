package day04;

public class Practice1 {
    public static void main(String[] args) {
        int num=9;
        while(num>=1) {
            System.out.print(num+"*9="+num--*9+"\t");
        }
        /*执行过程:
        num=9 true 输出
        num=8 true 输出
        num=7 true 输出
        num=6 true 输出
        num=5 true 输出
        num=4 true 输出
        num=3 true 输出
        num=2 true 输出
        num=1 true 输出
        num=0 false结束循环
         */
    }
}
