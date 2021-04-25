package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for(int i=0;i< arr1.length;i++){
            arr1[i]=i;
            System.out.print(arr1[i]+"\t");
        }
        System.out.println();
        int[] arr2 = new int[]{1,2,3,4,5};
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+"\t");
        }
        /*
        int[] arr = new int[]{3,2,5};
        arr[0] = 100;//给arr中的第一个元素赋值为100
        arr[1] = 200;//给arr中的第二个元素赋值为200
        arr[2] = 300;//给arr中的第三个元素赋值为300
        //arr[3] = 500;//运行时发生数组下标越界异常
        System.out.print(arr[0]+"\t"+arr.length+"\t"+arr[arr.length-1]);

         */
        /*
        //数组的定义
        //声明整型数组arr，包含10个元素，每个元素都是int类型，默认值为0
        int[] arr = new int[10];
        double[] d1 = new double[2];
        double[] d3 = new double[]{2,3,4};
        //数组的初始化
        int[] arr1 = new int[2];
        int[] arr2 = {1,2,3};
        int[] arr3 = new int[]{1,2,3};
        //arr1={1,2};会发生编译错误
        int[] arr4;
        arr4 = new int[]{1,2,3,4};
        for(int i=0;i<arr4.length-1;i++) {
            System.out.print(arr4[i]+"\t");
        }
        */
    }
}
