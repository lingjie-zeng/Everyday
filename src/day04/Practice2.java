package day04;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入你的成绩：");
        double score = scan.nextDouble();
        if(score>100 || score<0) {
            System.out.println("成绩输入错误");
        }else if(score>=90) {
            System.out.println("A-优秀");
        }else if(score>=80) {
            System.out.println("B-良好");
        }else if(score>=60) {
            System.out.println("C-合格");
        }else {
            System.out.println("D-不合格");
        }
        System.out.println("继续...");

        System.out.print("请输入你选择的业务:");
        int command = scan.nextInt();
        switch (command) {//1存款 2取款 3查看账户余额 0退出
            case 0:
                System.out.println("退出，欢迎下次再来");
                break;
            case 1:
                System.out.println("存款业务");
                break;
            case 2:
                System.out.println("取款业务");
                break;
            case 3:
                System.out.println("查看账户余额");
                break;
            default:
                System.out.println("输入错误");
        }
        System.out.println("继续...");

        int guess;
        int num = (int)(Math.random()*1000+1);
        System.out.print("请输入你猜的数字:");
        guess = scan.nextInt();
        while(guess!=num) {
            System.out.println(guess>num?"猜大了":"猜小了");
            System.out.print("请输入你猜的数字:");
            guess = scan.nextInt();
        }
        System.out.println("恭喜你，猜对了");
        System.out.println("继续...");
        num = (int)(Math.random()*1000+1);
        do{
            System.out.print("请输入你猜的数字:");
            guess = scan.nextInt();
            System.out.println(guess==num?"恭喜你，猜对了":guess>num?"猜大了":"猜小了");
        }while(guess!=num);
        System.out.println("继续...");

    }
}
