/**
 * @author jx
 * @description 添加和打印结点
 * @date 2022-06-09 22:45
 **/
public class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode() { }

    // 添加结点
    public void addNode(int newVal) {
        ListNode listNode = new ListNode(newVal);
        if(this.next==null) {
            this.next = listNode;
        } else {
            this.next.addNode(newVal);
        }
    }

    // 打印结点
    public void print() {
        System.out.print(this.val);
        if(this.next != null) {
            System.out.print("--->");
            this.next.print();
        }
    }
}
