package day04;

import java.util.Scanner;

public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = (int)(Math.random()*1000+1);//随机生成要猜的数，范围为1到1000之间的整数
        int guess;
        do {
            System.out.print("请输入你猜的数:");
            guess = scan.nextInt();
            System.out.println(guess==num?"恭喜你，猜对了！":guess>num?"猜大了":"猜小了");
        }while(guess!=num);
        /*
        执行工程：假设num=500
        guess = 750 输出 true
        guess = 250 输出 true
        guess = 500 输出 false结束循环
        do{//假设num=500 分别带数750 250 500
            System.out.print("请输入你猜的数:");
            guess = scan.nextInt();
            System.out.println(guess==num?"恭喜你,猜对了":guess>num?"猜大了":"猜小了");//判断猜的数的大小
        }while (guess!=num);
         */
        /*
        System.out.print("请输入你猜的数:");
        int guess = scan.nextInt();
        int num = (int)(Math.random()*1000+1);//随机生成1到1000的整数
        while(guess != num) {
            System.out.println(guess<num?"猜小了":"猜大了");
            System.out.print("请输入你猜的数:");
            guess = scan.nextInt();
        }
        System.out.println("恭喜你了,猜对了");
        */
        /*查看随机数生成概率
        int count = 0;
        for(int i=0;i<1000000;i++){
            while(true) {
                num = (int)(Math.random()*1000);
                if(num==guess) {
                    break;
                }
                count++;
            }
        }
        count/=1000000;
        System.out.println(count);
        */
    }
}
