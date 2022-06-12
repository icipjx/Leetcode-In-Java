import java.util.Arrays;

/**
 * @author jx
 * @description 快速排序
 *  不稳定排序,最好O(nlogn):,平均O(nlogn):,最差O(n²)：
 * @date 2022-05-25 23:31
 **/
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {4,5,2,6,1,8};
        sort(arr,0,arr.length-1);
        System.out.println("排序结果："+ Arrays.toString(arr));
    }
    /*
     * @author jx
     * @decription 交换
     * @date 2022/6/5 14:42
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
     * @decription 快排实现
     * @date 2022/6/5 14:44
     * @param arr
     * @param start
     * @param end
     */
    public static void  sort(int[] arr,int start,int end) {
        int pivod = start ;

        //如果只有一个元素
        if(start+1>=end) {
            return ;
        }
        int l = start;
        int r = end;
        while(l < r) {
            while(l<r && arr[r]>=arr[pivod]) {
                r--;
            }
//            if(arr[r]<arr[pivod]) {
                arr[l] = arr[r];
//                r++;
//            }

            while(l<r && arr[l]<=arr[pivod]) {
                l++;
            }
//            if(arr[start]>arr[pivod]) {
                arr[r] = arr[l];
//                end--;
//            }
        }
        arr[l] = arr[pivod];
        sort(arr,start,l-1);
        sort(arr,l+1,end);
    }
}
