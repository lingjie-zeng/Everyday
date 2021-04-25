package oo.day06;

public class test {
    public static void main(String[] args) {
        Person[] ps = new Person[5];
        ps[0] = new Student("小飞机",1,"sky","0001");
        ps[1] = new Student("大飞机",2,"sky","0002");
        ps[2] = new Teacher("Bee",3,"sky",10000.0);
        ps[3] = new Teacher("Hero",4,"sky",20000.0);
        ps[4] = new Doctor("Bullte",5,"sky","first");
        for(int i=0;i<ps.length;i++) {
            Person p = ps[i];
            System.out.println(p.name);
            p.sayHi();
        }
    }
}
