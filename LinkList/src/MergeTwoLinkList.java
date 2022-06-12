/**
 * @author jx
 * @description 将两个升序链表合并为一个新的升序链表并返回
 * @date 2022-06-12 17:30
 **/
public class MergeTwoLinkList {
    public static ListNode mergeTwoLinkList(LinkList l1,LinkList l2) {
        ListNode p = l1.head;
        ListNode q = l2.head;
        ListNode h = new ListNode(0);
        ListNode newHead = h;
        while (p!=null && q!=null) {
            if(q.val >= p.val) {
                h.next = new ListNode(p.val);
                p = p.next;
            }else {
                h.next  = new ListNode(q.val);
                q = q.next;
            }
            h = h.next;
        }
        if(p != null) {
            h.next  = p;
        } else {
            h.next  = q;
        }
        return newHead.next;


    }

    public static void main(String[] args) {
        int num1[] = {1,2,3,4,5};
        int num2[] = {4,5,6,7,8};
        LinkList l1 = new LinkList(num1);
        LinkList l2 = new LinkList(num2);
        ListNode head = mergeTwoLinkList(l1,l2);
        head.print();

    }

}
