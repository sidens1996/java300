package cn.sxt.oo;

import java.util.Arrays;

/**
 * @ClassName: TestBinarySearch
 * @Description: TODO
 * @Author: Achilles
 * @Date: 11/12/2019  12:41
 * @Version: 1.0
 **/

public class TestBinarySearch {


    public static int binarySearch(int[] arr, int ele) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (ele > arr[mid]) {
                low = mid + 1;
            } else if (ele < arr[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {9,0,1,8,4,2,7,3,6,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index = binarySearch(arr,9);
        System.out.println(index);
    }
}


