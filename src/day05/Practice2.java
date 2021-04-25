package day05;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("开始进行随机加法运算（输入-1结束优秀）");
            int random1 = (int) (Math.random() * 100);
            int random2 = (int) (Math.random() * 100);
            System.out.print(random1 + "+" + random2 + "=");
            int input = scan.nextInt();
            if(input==-1) {
                break;
            }
            if (input == random1 + random2) {
                System.out.println("回答正确");
            } else {
                System.out.println("回答错误");
            }
        }
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
        double[] arr1 =new double[100];
        double[] arr2 = new double[]{1,2,3,4};
        double[] arr3 ={1,2,3,4};
        /*
        double[] scores = new double[10];
        for(int i=0;i<scores.length;i++) {
            System.out.print("请输入第"+(i+1)+"个学生的成绩：");
            scores[i] = scan.nextDouble();
        }
        double sum=0,average=0;
        for(int i=0;i<scores.length;i++) {
            sum+=scores[i];
        }
        average = sum/scores.length;
        System.out.println("总分为："+sum+"\t平均分为"+average);

         */
    }
}
