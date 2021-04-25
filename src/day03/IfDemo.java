package day03;

public class IfDemo {
    public static void main(String[] args) {
        double price = 600.0;
        if(price>=500) {//消费金额满500打8折
            price*=0.8;
        }
        System.out.println("最终消费金额是"+price);
        /*
        int num=5;
        if(num%2==0) {//判断num是否是偶数
            System.out.println(num+"是偶数");
        }
        String printf = num%2==0?"是偶数":"不是偶数";
        System.out.println(num+printf);
        System.out.println("继续...");
        */
    }
}
