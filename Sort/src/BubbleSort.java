import java.util.Arrays;

/**
 * @author jx
 * @description 冒泡排序
 * 稳定排序，平均时间复杂度O(n²)，最好时间复杂度O(n),最坏时间复杂度O(n²)
 * @date 2022-05-25 22:21
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3,4};
        sort(arr);

    }

    /*
     * @author jx
     * @decription 如果arr[i]大于arr[j],则交换
     * @date 2022/5/25 23:54
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i, int j) {
        //设置临时变量
        int temp = 0;

        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    /*
     * @author jx
     * @decription 排序函数实现
     * @date 2022/5/25 23:55
     * @param arr
     */
    public static void sort(int [] arr) {
        for(int i=0; i<=arr.length-1; i++) {
            for(int j=0; j<arr.length-1-i; j++) {
                //数组相邻元素比较，大者往后冒泡
                if(arr[i] > arr[j]) {
                    swap(arr, j, j + 1);
                }
            }
            System.out.println("第"+(i+1)+"次排序结果："+Arrays.toString(arr));
        }
    }

}
