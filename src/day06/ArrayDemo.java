package day06;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //数组的排序
        int[] arr = new int[100];
        for(int i=0;i<arr.length;i++) {//对数组里面的所有元素进行随机赋值
            arr[i] = (int)(Math.random()*1000);
        }
        Arrays.sort(arr);//将arr数组进行排序中升序
        for(int i=0;i<arr.length;i++) {//输出arr数组中的所有值
            System.out.print(arr[i]+"\t");
            if((i+1)%10 == 0) {//每输出10个值换一行
                System.out.println();
            }
        }
        /*
        int[] a = new int[]{1,2,3,4,5,6,7};
        int[] b = new int[10];
        //a：为原数组
        //2：源数组的起始下标
        //b:目标数组
        //3：目标数组起始下标
        //4：复制元素的个数
        System.arraycopy(a,2,b,3,4);
        for(int i=0;i<b.length;i++) {
            System.out.print(b[i]+"\t");
        }
        System.out.println();
        System.arraycopy(b,3,a,0,2);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+"\t");
        }

         */
    }
}
