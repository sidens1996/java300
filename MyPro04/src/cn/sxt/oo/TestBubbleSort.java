package cn.sxt.oo;

import java.util.Arrays;

/**
 * @ClassName: TestBubuleSort
 * @Description: 测试冒泡排序
 * @Author: Achilles
 * @Date: 11/12/2019  11:22
 * @Version: 1.0
 **/

public class TestBubbleSort {

    private static void SwapSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("======第"+(i+1)+"次循环======");
        }
    }

    private static void BubbleSort(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            System.out.println("======第"+(i+1)+"次比较");
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
                System.out.println(Arrays.toString(arr));
            }
            if (flag) {
                System.out.println("提取结束");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,9,2,5,735,21,523,765,124,4,3,99};
        //SwapSort(arr);
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
