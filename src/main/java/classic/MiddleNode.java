package classic;

/**
 * Created by parkey19 on 2019. 9. 29..
 */
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

public class MiddleNode {

    //walker : 한번에 한칸씩
    //runner : 한번에 두칸씩
    //walker 1 2x
    //runner 1 2 nullx

    //walker 1 2x 3
    //runner 1 2 3 nullx
    //while 루프 마다 조건은 러너 != Null  러너가 끝에 먼저 도달이니까

    public static ListNode node(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        while (runner != null) {
            runner = runner.next;
            if (runner != null) {
                walker = walker.next;
                runner = runner.next;
            }
        }
        return walker;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2= new ListNode(3);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode node = MiddleNode.node(listNode1);
        System.out.println(node.val);
    }
}
