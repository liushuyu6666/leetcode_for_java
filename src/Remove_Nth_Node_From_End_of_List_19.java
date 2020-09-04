
public class Remove_Nth_Node_From_End_of_List_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head == null){
            return null;
        }
        ListNode r = head;
        ListNode l = head;

        // set interval between r and l
        while(n > 0){
            r = r.next;
            if(r == null){
                return head.next;
            }
            n--;
        }

        // set l to the node just before the target node
        while(r.next != null){
            r = r.next;
            l = l.next;
        }

        ListNode after = l.next.next;
        l.next = after;

        return head;
    }

    public static void main(String[] args) {
        Remove_Nth_Node_From_End_of_List_19 rnnfeol = new Remove_Nth_Node_From_End_of_List_19();
        System.out.println(rnnfeol.removeNthFromEnd(new ListNode(1,null), 1));
    }
}
