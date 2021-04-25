package day03;

public class IfElseDemo {
    public static void main(String[] args) {
        double price = 600.0;//消费金额 带数600 200
        if(price>=500) {//满500打8折
            price*=0.9;
        }else {//不满500打9折
            price*=0.8;
        }
        System.out.println("最终消费金额为"+price);

        int num=5;//带数 5，6
        if(num%2==0) {//判断num是否是偶数
            System.out.println(num+"是偶数");
        }
        System.out.println("继续...");

        int num1=6;//带数5，6
        if(num1%2==0) {//判断num1是否是偶数
            System.out.println(num1+"是偶数");
        }else {//
            System.out.println(num1+"是奇数");
        }
        System.out.println("继续...");
        /*
        int num = 6;//带数5，6
        if(num%2==0) {//判断num是否是偶数
            System.out.println(num+"是偶数");
        }else {
            System.out.println(num+"是奇数");
        }
        System.out.println("继续...");

         */

    }
}
