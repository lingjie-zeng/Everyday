package day06;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] a = new int[(int)(Math.random()*10+1)];
        int[] b = new int[a.length+1];
        System.arraycopy(a,0,b,0,a.length);
        /*
        say();
        sayHi("zlj");
        sayHello("zlj",23);
        double a =getNum();
        System.out.println(a);
        int m=5,n=6;
        int c = plus(m,n);
        System.out.println(c);
        int[] arr= testArray();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }

    }

    public static void say() {
        System.out.println("Hello world!");
    }

    public static void sayHi(String name) {
        System.out.println("My name is "+name+".");
    }

    public static void sayHello(String name ,int age) {
        System.out.println("My name is "+name+". My age is "+age+".");
    }

    public static double getNum() {
        return 3.1415926;
    }

    public static int plus(int num1,int num2) {
        int num =num1+num2;
        return num;
    }

    public static int[] testArray() {
        int num = (int)(Math.random()*10+1);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
        */
    }

}
