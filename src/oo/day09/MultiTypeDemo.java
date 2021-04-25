package oo.day09;

public class MultiTypeDemo {
    public static void main(String[] args) {
        Aoo o = new Boo();
        Boo o1 =(Boo)o;  //引用o所指向的对象就是Boo类型
        Inter o2= (Inter)o;//引用o所指向的对象实现了Inter接口
        //Coo o3 = (Coo)o;//运行时会发生ClassCastException类型转换异常
        if(o instanceof Coo) {
            Coo o4 = (Coo)o;
        }else {
            System.out.println("o不是Coo类型");
        }
    }
}