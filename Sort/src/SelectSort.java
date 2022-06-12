import java.util.Arrays;

/**
 * @author jx
 * @description 选择排序
 * 不稳定排序,最好O(n²）:,平均O(n²）:,最差O(n²）：
 * @date 2022-05-26 0:10
 **/
public class SelectSort {
    public static void main(String[] args) {
        int arr[] = {5,1,2,3,6,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
     * @author jx
     * @decription 交换
     * @date 2022/6/5 13:39
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
     * @decription 选择排序实现
     * @date 2022/6/5 13:39
     * @param arr
     */
    public static void sort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr,minIndex,i);
            System.out.println("第"+(i+1)+"次排序结果："+ Arrays.toString(arr));
        }
    }
}
