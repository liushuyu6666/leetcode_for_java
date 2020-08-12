import java.util.List;

public class Add_Two_Numbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // cursor for l1
        ListNode p = l1;
        // cursor for l2
        ListNode q = l2;
        // result ListNode
        ListNode r = new ListNode();
        // cur points to the initial addr of r
        ListNode cur = r;
        // values for each node of l1, l2
        int val1=0, val2=0;
        int carry = 0;
        int sum = 0;
        while(p != null || q != null){
            val1 = (p == null)? 0: p.val;
            val2 = (q == null)? 0: q.val;
            sum = val1 + val2 + carry;
            carry = (int) (sum / 10);
            cur.next = new ListNode(sum%10);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0){
            cur.next = new ListNode(carry);
        }
        return r.next;
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
