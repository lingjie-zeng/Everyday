package day05;

public class ForDemo {
    public static void main(String[] args) {
        for(int num=1;num<=9;num++) {
            if(num==5){
                break;
            }
            System.out.print(num+"*9="+num*9+"\t");
            /*
            执行过程：
            num=1 true 输出
            num=2 true 输出
            num=3 true 输出
            num=4 true 输出
            num=5
             */
        }
        /*
        for(int times=0;times<6;times++) {
            System.out.println("行动是成功的阶梯");
        }
        System.out.println("继续...");
        for(int num=1;num<=9;num++){
            System.out.print(num+"*9="+num*9+"\t");
        }
        System.out.println("\n继续...");
        for(int num=1;num<=9;num+=2){
            System.out.print(num+"*9="+num*9+"\t");
        }

        num=1 true 输出
        num=3 true 输出
        num=5 true 输出
        num=7 true 输出
        num=9 true 输出
        num=11 false 结束for循环

        System.out.println("\n继续...");
        for(int num=9;num>=1;num--){
            System.out.print(num+"*9="+num*9+"\t");
        }
        System.out.println("\n继续...");
        */
    }
}
