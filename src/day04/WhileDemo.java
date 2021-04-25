package day04;

public class WhileDemo {
    public static void main(String[] args) {
        int times = 0;
        while(times++<6) {
            System.out.println("行动是成功的阶梯");
        }
        /*
          执行过程：
               times=0
          true times=1 输出
          true times=2 输出
          true times=3 输出
          true times=4 输出
          true times=5 输出
          true times=6 输出
          false
         */
        System.out.println("继续");

        int num=1;
        while (num<=9){
            System.out.print(num+"*9="+num++*9+"\t");
        }
        System.out.println("\n继续...");
    }
}
