import java.util.Arrays;

/**
 * @author jx
 * @description TODO
 * @date 2022-05-25 23:48
 **/
public class InsertSort {
    public static void main(String[] args) {
        int arr[] = {2,3,5,1,3,4};
        sort(arr);
    }

    /*
     * @author jx
     * @decription 如果arr[i]大于arr[j],则交换
     * @date 2022/5/25 23:57
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i, int j) {
        //设置临时变量
        int temp = 0;
        if(arr[i] > arr[j]) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /*
     * @author jx
     * @decription 快排实现
     * @date 2022/5/25 23:55
     * @param arr
     */
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<i; j++) {
                swap(arr,j,i);
            }
            System.out.println("第"+(i+1)+"次排序结果："+ Arrays.toString(arr));
        }
    }

}
