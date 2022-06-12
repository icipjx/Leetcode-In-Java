/**
 * @author jx
 * @description 链表环路检测
 * 解题思路：利用两个快慢指针，一个按一步速度，另一个按两步速度，如果有环，早晚会相交
 * @date 2022-06-12 17:28
 **/
public class DetectCycle {
    public static boolean detectCycle(LinkList l) {
        ListNode p = l.head;
        ListNode q = l.head;
        while (p != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num[] = {4,5,6,7,8};
        LinkList l = new LinkList(num);
        boolean tag = detectCycle(l);
        if(tag) {
            System.out.println("链表有环");
        } else {
            System.out.println("链表无环");
        }
    }


}
