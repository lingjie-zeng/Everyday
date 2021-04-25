package day06;

import java.util.Arrays;

//方法的演示
public class MethodDemo {
    public static void main(String[] args) {
        say();
        sayHi("ZLJ");           //String name = "zlj"
        sayHello("zlj",23);//String name = "zlj" int age = 23
        double a = getNum1();//geiNum1()的值就是return后的那个数
        System.out.println(a);
        int b =getNum2();
        System.out.println(b);
        System.out.println(plus(3,4));
        int m=5,n=6;
        System.out.println(max(m,n));
        System.out.println(max(21,44));
        int[] array=creatArray();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("over!");
    }

    //随机创建一个20以内的数组并随机赋值
    public static int[] creatArray() {
        int num = (int)(Math.random()*20+1);
        int[] arr= new int[num];
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static double max(double a,double b) {
        return a>b?a:b;
    }

    //有参数有返回值
    public static int[] plus(int num1,int num2) {
        int[] num = new int[]{num1,num2};
        System.out.println(num);
        return num;
    }

    public static int getNum2() {
        return (int)(Math.random()*1000);
    }

    //无参数有返回
    public static double getNum1() {
        //return ;//编译错误 return后面必须要跟一个值
        //return "abc";//编译错误 返回值类型要匹配
        return 3.1415926;
    }

    //有参数无返回
    public  static void sayHi(String name) {
        System.out.println("Hello,my name is "+name);
    }

    public  static void sayHello(String name,int age) {
        System.out.println("Hello,my name is "+name+".My age is "+age);
    }

    //无参数值无返回
    public  static void say() {
        System.out.println("Hello world!");
    }
}
