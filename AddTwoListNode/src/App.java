
class ListNode{

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class App {
    public ListNode merge(ListNode head1, ListNode head){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        int carry = 0;

        while(head != null || head1 != null || carry != 0){
             int val1 = (head != null) ? head.val : 0;
             int val2 = (head1 != null) ? head1.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum/10;

            current.next = new ListNode(sum%10);
            current = current.next;

            if (head != null) head = head.next;
            if (head1 != null) head1 = head1.next;

        }

        return Convert.reverse(dummy.next);

    }
}
