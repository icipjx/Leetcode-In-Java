import java.util.List;

/**
 * @author jx
 * @description 判断链表是否相交，若相交返回交点
 * 思路：得到两条链表长度差diff，让长链表先走diff步，然后长短链表一样速度往后走，看是否存在相同结点
 * @date 2022-06-12 17:27
 **/
public class GetIntersectionNode {
    public static  ListNode getIntersectionNode(LinkList l1,LinkList l2) {

        if(l1==null || l2==null) {
            return null;
        }
        int lengthOfL1 = l1.size();
        int lengthOfL2 = l2.size();
        int diff = Math.abs(lengthOfL1-lengthOfL2);
        // 长链表
        ListNode longNode = lengthOfL1>=lengthOfL2?l1.head:l2.head;
        // 短链表
        ListNode shortNode = lengthOfL1<lengthOfL2?l1.head:l2.head;
        // 长链表先走
        while(diff != 0) {
            longNode = longNode.next;
            diff--;
        }
        while(longNode != shortNode) {
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        if(longNode != null) {
            return longNode;
        } else {
            return null;
        }

    }

    public static void main(String[] args) {
        int num1[] = {1,2,3,4};
        int num2[] = {4,5,6,7,8};
        LinkList l1 = new LinkList(num1);
        LinkList l2 = new LinkList(num2);
        ListNode node = getIntersectionNode(l1,l2);
        if(node == null) {
            System.out.println("不相交");
        } else {
            System.out.println("相交结点为："+node.val);
        }

    }

}
