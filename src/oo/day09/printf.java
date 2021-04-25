package oo.day09;

import java.util.Scanner;

public class printf {
    public static void main(String[] args) {

        int num = -200;
        for(int i=num;i<=0;i++) {
            System.out.println(Integer.toBinaryString(i));
        }
        int m = 0x75c4a8fa;
        int m1 = m>>>8;
        int m2 = m>>>16;
        int m3 = m>>>24;
        int n = 0xff;
        int k = m&n;
        int k1 = m1&n;
        int k2 = m2&n;
        int k3 = m3&n;
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toBinaryString(m1));
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toHexString(k));
        System.out.println(Integer.toHexString(k1));
        System.out.println(Integer.toHexString(k2));
        System.out.println(Integer.toHexString(k3));

        m = k | (k1<<8) | (k2<<16) | (k3<<24);
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(k1<<8));
        System.out.println(Integer.toBinaryString(k2<<16));
        System.out.println(Integer.toBinaryString(k3<<24));
        System.out.println(Integer.toBinaryString(m));
        System.out.println(Integer.toHexString(m));

    }
}
