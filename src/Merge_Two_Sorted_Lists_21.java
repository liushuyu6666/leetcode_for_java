public class Merge_Two_Sorted_Lists_21 {
    public ListNode mergeTwoLists(ListNode h1, ListNode h2) {
        ListNode l1 = h1;
        ListNode l2 = h2;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode l1_prev = h1;
        ListNode l2_next = l2.next;

        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
                if(l1 == l1_prev){
                    h1 = l2;
                    l1_prev = l2;
                    l2.next = l1;
                    l2 = l2_next;
                    if(l2_next != null){
                        l2_next = l2_next.next;
                    }
                }
                else{
                    l1_prev.next = l2;
                    l2.next = l1;
                    l1_prev = l2;
                    l2 = l2_next;
                    if(l2_next != null){
                        l2_next = l2_next.next;
                    }
                }
            }
            else{
                if(l1_prev != l1){
                    l1_prev = l1;
                    l1 = l1.next;
                }
                else{
                    l1 = l1.next;
                }

            }
        }
        if(l1 == null){
            l1_prev.next = l2;
        }
        return h1;
    }

    public static void main(String[] args) {
        Merge_Two_Sorted_Lists_21 mtsl =
                new Merge_Two_Sorted_Lists_21();
        System.out.println(mtsl.mergeTwoLists(new ListNode(1,
        new ListNode(2, new ListNode(4, null))),
                new ListNode(1, new ListNode(3,
                        new ListNode(4, null)))));
    }
}
