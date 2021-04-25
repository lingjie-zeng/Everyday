package day02;

//数据类型的演示
public class DateTypeDemo {
    public static void main(String[] args) {
        long a=10000000011L;
        float b=a;
        System.out.println(b);
        byte b1=4;
        byte b2=5;
        byte b3=(byte)(b2+b1);//当byte short char参与运算是转化为int型参与运算
        char c = 'a';
        char e = 'b';
        System.out.println(c+e);//195 a的码97加上b的码98=195
        System.out.println(2+'2');//52,2的ASCISS值为50加上2
        System.out.println(2+2);
        /*
        int a=5;
        long b=a;//自动类型转换
        int c=(int)b;//强制类型转换
        long d=5;//自动类型转换
        double e=5;//自动类型转换
        long f = 100000000000L;
        long g =(int)f;//强转有可能会发生溢出
        System.out.println(g);
        double h=3.1415;
        int i =(int)h;//强转有可能会丢失精度
        System.out.println(i);

         */
        /*
        //5):字符型，单引号哦中，只能有一个,char采用unicode字符集编码格式
        char c1 = '女';//字符女
        char c2 = 'f';//字符f
        char c3 = '2';//字符2
        char c4 = ' ';//空格符
        //char c5 = 女;//编译错误，字符必须在单引号内
        //char c6 = '';//编译错误，必须有字符
        //char c7 = '10';//编译错误，只能有一个字符
        //6）String：字符串型，双引号中，0个到多个
        String s1 = "";
        String s2 = "男";
        String s3 = "重庆市渝北区";
        //String s4 = 你好世界;//编译错误，字符串必须在双引号中

         */
        /*
        //3)double：浮点型，只能装小数，很大很大很大
        double a = 3.1415926;//3.1415926为double型
        double b = 25;//25为int型，此处发生了自动转化类型，将25转化为double类型
        System.out.println(b);

        double c=3.0,d=2.9;
        System.out.println(c-d);//0.10000000000000009
                                //double类型参与运算时，有可能会发生舍入误差

        //4)boolean:布尔型，占一个字节，只能说true或者false
        boolean e = true; //true为boolean型 表示真/对
        boolean f = false;//false为boolean型，表示假/错
        //boolean g = 1;//编译错误，布尔型只能是true或者false
        */
        /*
        //int：整型，只能装整数，-21个多亿到21个多亿
        int a = 25;
        //int b = 3.1415926;//编译错误，int类型只能装整数
        //int c=100000000000;//编译错误，100亿超出int范围了

        //2)long:长整型，只能装整数，很大很大很大
        long d = 100000000000L;//100亿为长整型
        long e = 25;//25为int型。此处发生了自动类型转化，将int型的25转化为long的25
        //long f=2.987;//编译错误，long类型中只能是整数

        long d=1000000000*2*10L;//200亿
        System.out.println(d);
        long e = 1000000000*3*10L;//不是300亿，前部分相乘为30亿已经溢出了int的范围
        System.out.println(e);
        long f = 1000000000L*3*10;//300亿
        System.out.println(f);
        */
    }
}
