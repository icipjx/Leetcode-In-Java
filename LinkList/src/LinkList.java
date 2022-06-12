import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author jx
 * @description 创建链表
 * @date 2022-06-09 23:20
 **/
public class LinkList {
    ListNode head;
    ListNode next;
    /*
     * @author jx
     * @decription 根据输入创建链表，两种方法：根据头结点和头指针创建链表
     * @date 2022/6/12 14:58
     */
    public   LinkList() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入值：");
        String val = scanner.nextLine();
        String[] str = val.split(" ");

//        //方法一：头结点构建链表
//        this.head = new ListNode();
//        for(String s : str) {
//            int j = Integer.parseInt(s);
//            this.head.addNode(j);
//        }


        //方法二：头指针构建链表
        this.head = new ListNode(Integer.parseInt(str[0]));
        List<String> strList = Arrays.asList(str);
        for(String s : strList.subList(1,strList.size())) {
            int j = Integer.parseInt(s);
            head.addNode(j);
        }
    }

    /*
     * @author jx
     * @decription 根据传入num数组构建链表
     * @date 2022/6/12 14:59
     * @param num
     */
    public LinkList(int[] num) {
        this.head= new ListNode(num[0]);
        int[] numCopy =  Arrays.copyOfRange(num,1,num.length);
        for(int n : numCopy) {
            this.head.addNode(n);
        }

    }

    public int size() {
        int i = 0;
        ListNode cur = this.head;
        while(cur != null) {
            cur = cur.next;
            i++;
        }
        return i;
    }




    public static void main(String[] args) {
        int[] num = {1,3,4,2};
        LinkList l = new LinkList(num);
        l.head.print();
        System.out.println("\n链表长度为："+l.size());

    }
}
