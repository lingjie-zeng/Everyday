package oo.day05;

public class test {
    public static void main(String[] args) {
        Person[] ps = new Person[5];
        ps[0] = new Student("zlj",23,"cq","001");
        ps[1] = new Student("wc",23,"cq","002");
        ps[2] = new Teacher("hwl",23,"hb",50000.0);
        ps[3] = new Teacher("zjq",23,"sc",50000.0);
        ps[4] = new Doctor("ygx",23,"hb","院长");
        for(int i=0;i<ps.length;i++) {
            Person p = ps[i];
            System.out.println(p.name);
            p.sayHi();
        }
    }
}
