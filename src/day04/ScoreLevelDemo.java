package day04;
//成绩等级判断
import java.util.Scanner;
public class ScoreLevelDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入分数:");
        double score = scan.nextDouble();
        if(score<0 || score>100) {//判断成绩等级及合法性
            System.out.println("成绩不合法");
        }else if(score>=90) {
            System.out.println("A-优秀");
        }else if(score>=80) {
            System.out.println("B-良好");
        }else if(score>=60) {
            System.out.println("C-合格");
        }else {
            System.out.println("D-不合格");
        }
    }
}
