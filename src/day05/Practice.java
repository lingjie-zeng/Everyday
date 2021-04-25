package day05;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min;
        System.out.print("请输入初始小兔子对数：");
        min = scan.nextInt();
        System.out.print("请输入小兔子需要几个月长大：");
        int num1 = scan.nextInt();
        int[] hare = new int[num1];//兔子各个时期的对数
        for(int i=0;i<num1;i++) {
            if(i!=num1-1) {//分别输入各个时期的兔子对数 hare[i]代表长了i+1个月的兔子
                System.out.print("请输入长了" + (i + 1) + "个月的兔子对数：");
                hare[i] = scan.nextInt();
            }else {//已经长大的兔子对数
                System.out.print("请输入大兔子对数:");
                hare[i] = scan.nextInt();
            }
        }
        System.out.print("请输入大兔子一个月生的小兔子的对数：");
        int num = scan.nextInt();
        System.out.print("请输入查看的月份:");
        int month = scan.nextInt();
        for(int i=1;i<month;i++){
            for(int j=num1-1;j>0;j--) {
                if(j==num1-1){
                    hare[j] = hare[j]+hare[j-1];
                }else {
                    hare[j]=hare[j-1];
                }

            }
            hare[0]=min;//长了一个月的兔子对数
            min=num*hare[num1-1];//大兔子生成的小兔子对数
        }
        int sum=0;//总兔子对数
        for(int i=0;i<num1;i++){
            sum+=hare[i];
        }
        sum+=min;//总兔子对数为小兔子对数加成长的兔子对数
        System.out.println("兔子对数为"+sum);

    }
}
