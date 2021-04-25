package oo.day02;
//重载的演示
public class OverloadDemo {
    public static void main(String[] args) {
        Aoo a = new Aoo();
        a.show();
        a.show(15);
        a.show("zlj");
        a.show(18,"jyt");
        a.show("zzz",18);
        String s = "Java程序员";
        System.out.println(s.getBytes());
    }
}
