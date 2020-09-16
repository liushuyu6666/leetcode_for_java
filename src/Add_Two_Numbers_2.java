import java.util.List;

public class Add_Two_Numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int val1, val2;
        /** tips: when we call new ListNode(), a ListNode(val=0, next=null) is created, so
         * here head.val and head.next is accessible*/
        ListNode head = new ListNode();
        ListNode cur = head;
        while(l1 != null || l2 != null){
            val1 = (l1 == null)?0:l1.val;
            val2 = (l2 == null)?0:l2.val;
            cur.next = new ListNode((carry + val1 + val2) % 10, null);
            carry = (int)((carry + val1 + val2) / 10);
            cur = cur.next;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        if(carry != 0){
            cur.next =
                    new ListNode(carry, null);
        }
        return head.next;
    }

    public static void main(String[] args){
        ListNode l1 = new ListNode(5);
        // ListNode l2 = new ListNode(5);
        ListNode l2 = new ListNode(1, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))))))))));
        Add_Two_Numbers_2 atn = new Add_Two_Numbers_2();
        ListNode a = atn.addTwoNumbers(l1, l2);
        while(a != null){
            System.out.println(a.val);
            a = a.next;
        }

    }
}
