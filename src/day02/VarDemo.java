package day02;

public class VarDemo {
    public static void main(String[] args) {
        //1)变量的声明----在银行开账户
        int a;//声明一个整型的变量，名为a
        int b,c,d;//声明3个整型的变量，名为b,c,d
        //int a;//编译错误，变量不能同名

        //2)变量的初始化----给账户存钱
        int e = 258;//声明整型变量e并赋值258
        int f;//声明整型变量f
        f = 258;//给变量f赋值258
        f = 368;//给变量f赋值368


        //3)变量的使用-----使用的是账户里面的钱
        int g = 8;
        int h = g+10;//取出g的值，加上10后，赋值给h
        System.out.println(h);  //输出变量h的值15
        System.out.println("h");//输出h，双引号中的原样输出

        //int i =25.58;//编译错误，数据类型不匹配
        //System.out.println(j);//编译错误，变量j为声明
        int j;
        //System.out.println(j);//编译错误，变量j未初始化

        //4)变量的命名
        int a_2,_59,_3c,$_s;
        //int a*b; //编译错误，不能包含*等特殊符号
        // int 5a;//编译错误，不能以数字开头

        int aa = 5;
        //System.out.println((aA));//编译错误，严格区分大小写
        //int class;//编译错误，不能使用关键字

        int ab;      //不直观
        int 年龄;     //直观但不专业
        int nianling;//既不直观也不专业
        int age;     //建议“英文的见名知意”
        int score ,myScore,myJavaScire;//驼峰命名法


    }
}
