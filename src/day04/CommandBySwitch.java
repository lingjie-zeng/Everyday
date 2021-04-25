package day04;

import java.util.Scanner;

public class CommandBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请选择功能:1.存款 2.取款 3.查询余额 0.退出：");
        int command = scan.nextInt();
        switch (command) {//带数 0 1 2 3 4
            case 1:
                System.out.println("存款业务...");
                break;
            case 2:
                System.out.println("取款业务...");
                break;
            case 3:
                System.out.println("查询业务...");
                break;
            case 0:
                System.out.println("退出，欢迎下次再来");
                break;
            default:
                System.out.println("输入错误");

        }
    }
}
