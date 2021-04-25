package day03;
//运算符的演示
public class OperDemo {
    public static void main(String[] args) {
        /*
        int num =5;
        int flag =num>0?1:-1;
        System.out.println(flag);//1
        int a=30,b=20,c=25;
        int max = a>b?a>c?a:c:b>c?b:c;//求a b 之间的最大值
        System.out.println(max);

         */
        /*
        int age=23;
        System.out.println("age=");//age=
        System.out.println(age);
        System.out.println("age="+age);//age=23
        System.out.println("我的年龄是"+age);//我的年龄是23
        System.out.println("我今年"+age+"岁了");//我今年23岁了

        String name = "曾令杰";
        System.out.println("我的名字是"+name);//我的名字是曾令杰
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁了");//大家好，我叫曾令杰，今年23岁了

         */
        /*
        int a=5;
        a+=5;
        System.out.println(a);
        a*=5;
        System.out.println(a);
        a/=5;
        System.out.println(a);
        a-=3;
        System.out.println(a);
        short b=10;
        b+=10;//扩展赋值运算符自带强制转换，相当于b=(short)(b+10);
        b=(short)(b+10);
        System.out.println(b);
        */
        /*
        int a=5,b=10,c=5;
        boolean b2=!(b>a);//false !ture
        boolean b3 =a<3 && (b++>5);
        boolean b4 =a>1 || c++<3;
        System.out.println(c);
        System.out.println(b);
        System.out.println(b2);
        System.out.println(!(b<a));//true !false
        System.out.println(a<b || b<c);    //true true || false =true
        System.out.println(a>c || b>c);    //true false || true =true
        System.out.println(a==c || b>c); //true true || true =true
        System.out.println(a!=c || a>=b);//false false || false =false

         */
        /*
        boolean b1=a<b&&b<c;
        System.out.println(b1);        //false true && false=false
        System.out.println(a==b&&b<=c);//false false && false=false
        System.out.println(a!=c&&b>=c);//false false && true=false
        System.out.println(b>c&&a==c); //true true && true =true

         */
        /*
        int a=5,b=10,c=5;
        boolean b1=a>b;
        System.out.println(b1);  //false
        System.out.println(c<b); //true
        System.out.println(a>=c);//true
        System.out.println(a<=b);//true
        System.out.println(a==c);//true
        System.out.println(a!=c);//false

        System.out.println(a+c>b); //false
        System.out.println(a%2==0);//false
        System.out.println(c++>5); //false  c自增1变为6
        System.out.println(c++>5); //true

         */
        /*
        int a=5,b=5;
//        int c=a++;//1)将a++的值赋值给c 2）a自增1
//        int d=++b;//1）将++b的值赋值给d 2）b自增1
        int c=a--;
        int d=--b;
        System.out.println(a);//6  4
        System.out.println(b);//6  4
        System.out.println(c);//5  5
        System.out.println(d);//6  4

         */
        /*
        a++;//相当于a=a+1
        ++b;//相当于b=b+1
         */
        /*
        a--;//相当于a=a-1
        --b;//相当于b=b-1
        System.out.println(a);
        System.out.println(b);

         */
    }
}
