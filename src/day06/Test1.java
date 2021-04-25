package day06;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr =creatArray();
        Arrays.sort(arr);//对数组进行排序
        for(int i=0;i<arr.length;i++) {//输出数组的所有元素的值
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        double avg = avgArray(arr);//求数组的平均值
        arr = maxArray(arr);
        int[] arr1 = new int[arr.length+1];
        System.arraycopy(arr,0,arr1,0,arr.length);
        arr1[arr.length] = (int)(avg);
        for(int i=0;i<arr.length;i++) {//输出arr数组的所有元素的值
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for(int i=0;i<arr1.length;i++) {//输出arr1数组的所有元素的值
            System.out.print(arr1[i]+"\t");
        }

    }

    public static int[] creatArray() {//随机创建一个10以内的数组
        int num = (int)(Math.random()*10+1);
        int[] arr = new int[num];
        for(int i =0;i<arr.length;i++) {
            arr[i] = (int)(Math.random()*100);
        }
        return arr;
    }

    public static int[] maxArray(int[] arr) {//求数组里面元素的最大值，并扩容数组，将max放在最后一位
        int max = arr[0];
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1] = max;
        return arr;
    }

    public static double avgArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double)sum/arr.length;
        return avg;
    }
}
