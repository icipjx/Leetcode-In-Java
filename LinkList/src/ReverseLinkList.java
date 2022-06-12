/**
 * @author jx
 * @description 翻转链表
 * @date 2022-06-12 15:21
 **/
public class ReverseLinkList {
    // 方法一：头插法实现
    public static ListNode reverseLinkListByHeadInsert(LinkList l) {
        if(l==null) {
            return null;
        }
        ListNode head = l.head;
        ListNode cur = l.head.next;
        ListNode last = head;
        ListNode temp = null;
        while(cur != null) {
            temp = cur;
            cur = cur.next ;
            temp.next = head;
            head = temp;
        }
        last.next=null;
        return head;
    }

    //方法二：三指针法
    public static ListNode reverseLinkListByThreePointer(LinkList l) {
        if(l==null) {
            return null;
        }
        ListNode cur = l.head;
        ListNode pre= null;
        ListNode curNext = null;
        ListNode newHead = null;
        while(cur!=null) {
            curNext =cur.next ;
            if(curNext == null) {
                newHead = cur;
            }
            cur.next = pre;
            pre = cur;
            cur = curNext;
        }
        return newHead;
    }



    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        LinkList l = new LinkList(num);
        ListNode head = reverseLinkListByHeadInsert(l);
        head.print();

    }
}
