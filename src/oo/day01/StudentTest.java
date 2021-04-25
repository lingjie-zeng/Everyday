package oo.day01;
//引用类型数组的演示
public class StudentTest {
    public static void main(String[] args) {
        Student[] stus = new Student[3];
        stus[0] = new Student("zs",25,"lf");
        stus[1] = new Student("ls",26,"jms");
        stus[2] = new Student("ww",27,"sd");
        System.out.println(stus[0].name);
        stus[1].age = 24;
        stus[2].sayHi();
        for (int i=0;i<stus.length;i++) {
            System.out.println(stus[i].name);
            stus[i].sayHi();
        }

        Student[] stus1 = new Student[]{//了解
                new Student("zlj",23,"cq"),
                new Student("wc",23,"cq")
        };
    }
}
