package oo.day04;

public class UploadDemo {
    public static void main(String[] args) {
        Aoo o1 = new Aoo();
        o1.a = 1;
        o1.show();;
        //o1.b = 3; 超类不能指向派生类的变量和方法

        Boo o2 = new Boo();
        o2.a = 1;
        o2.b = 2;
        o2.show();
        o2.test();

        Aoo o3 = new Boo();//向上造型
        o3.a =1;
        o3.show();
        //o3.b = 2;编译错误，能点出是什么，看引用类型有什么
        //Boo o4 = new Aoo();编译错误，引用类型是超类 指向派生类对象
    }
}
