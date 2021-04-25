package oo.day04;

public class Test {
    public static void main(String[] args) {
        Person[] ps = new Person[5];
        ps[0] = new Student("zlj",23,"cq","001");
        ps[1] = new Student("wc",23,"cq","002");
        ps[2] = new Teacher("hwl",23,"hb",30000.0);
        ps[3] = new Teacher("ygx",23,"hb",40000.0);
        ps[4] = new Doctor("zjq",23,"sc","院长");
        for(int i=0;i<ps.length;i++) {
            System.out.println(ps[i].name);
            ps[i].sayHi();
        }

        //重写方法被调用时，看对象的累心
        Student stu = new Student("zs",25,"LF","003");
        Person p = new Student("zs",25,"LF","003");
        stu.sayHi();//调用的是Student的sayHi()
        p.sayHi();  //调用的是Student的sayHi()
    }
}
