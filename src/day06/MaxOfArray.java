package day06;

import java.util.Arrays;

//求数组元素最大值，并将max放到数组最后一个元素的下一个位置
public class MaxOfArray {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i]=(int)(Math.random()*1000);
            sum+=arr[i];
            System.out.print(arr[i]+"\t");
            if((i+1)%10==0) {
                System.out.println();
            }
        }
        int average =sum/arr.length;//数组arr里面的平均值
        int max = arr[0],min = arr[0];//假定第一个数为最大值和最小值
        for(int i =1;i<arr.length;i++) {//遍历数组
            if(arr[i]>max) {//若剩余元素大于max
                max = arr[i];//修改max为较大值
            }
            if(arr[i]<min) {//若剩余元素小于min
                min = arr[i];//修改min的值为较小值
            }
        }
        System.out.println("max="+max+",min="+min+",sum="+sum+",average="+average);
        arr = Arrays.copyOf(arr,arr.length+4);//将arr数组扩容4位
        arr[arr.length-4] = sum;//倒数第四位存放和sum
        arr[arr.length-3] = average;//倒数第三位存放平均值average
        arr[arr.length-2] = max;//倒数第二位保存最大值max
        arr[arr.length-1] = min;//最后一位保存最小值min
        for(int i=0;i<arr.length;i++) {//输出arr数组的所有元素值
            System.out.print(arr[i]+"\t");
            if((i+1)%10==0) {//每十位数换一行
                System.out.println();
            }
        }
    }
}
