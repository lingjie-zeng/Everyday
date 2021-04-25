package oo.day01;
//学生类
public class Student {
    //成员变量
    String name;
    int age;
    String address;

    //有参构造
    public Student(String name,int age,String address) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
    //方法
    void study() {
        System.out.println(name+"在学习.");
    }
    public void sayHi() {
        System.out.println("大家好，我叫"+name+",今年"+age+"岁了，家住"+address);
    }
}
