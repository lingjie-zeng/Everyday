package day05;

public class Practice03 {
    int i =0;
    int a(int month){
        System.out.println(i+"+"+month);
        i++;
        if( month==1 || month==2) {
            return 1;
        }
        else{
            return a(month-1)+a(month-2);
        }
    }

    public static void main(String[] args) {
        Practice03 a1 = new Practice03();
        a1.a(5);
    }
}
