package oo.day02;

public class Aoo {
    void show() {
        System.out.println();
    }

    void show(int age) {
        System.out.println("age="+age);
    }

    void show(String name) {
        System.out.println("name="+name);
    }

    void show(String name,int age) {
        System.out.println("name="+name+",age="+age);
    }

    void show(int age,String name) {
        System.out.println("age="+age+",name="+name);
    }
    //int  show(){ return 1;}//编译错误，重载与返回类型无关
    //void show(String address);//编译错误，重载与参数名称无关
}
