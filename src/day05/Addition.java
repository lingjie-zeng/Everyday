package day05;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for(int i=1;i<=10;i++) {
            int random1 = (int)(Math.random()*100);
            int random2 = (int)(Math.random()*100);
            System.out.print("("+i+")"+random1+"+"+random2+"=");
            int input = scan.nextInt();
            if(input == -1) {
                break;
            }
            if(input == random1+random2) {
                System.out.println("答对了");
                score+=10;
            }else {
                System.out.println("答错了");
            }
        }
        System.out.println("总分为"+score);
    }
}
