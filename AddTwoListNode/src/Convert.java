import java.util.Scanner;

class ListNode {

    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode (int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Convert {
    String Number1;
    String Number2;

    public static ListNode stringToList(String Number1){
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        for(int i = 0; i < Number1.length();i++){
            char n = Number1.charAt(i);
            current.next = new ListNode(Character.getNumericValue(n));
            current = current.next;
        }

        return dummy.next;
            
    }
     public static ListNode stringToList1(String Number2){
        ListNode dummy = new ListNode(-2);
        ListNode current = dummy;

        for(int i = 0; i < Number2.length();i++){
            char n = Number2.charAt(i);
            current.next = new ListNode(Character.getNumericValue(n));
            current = current.next;
        }
        
        return dummy.next;
    }
    public static int lengthcalculate(ListNode head){
        int length = 0;
        if (head != null){
            length++;
            head = head.next;
        }
        return length;
    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz:");
        String Number1 = sc.nextLine();

        System.out.println("İkinci sayıyı giriniz:");
        String Number2 = sc.nextLine();
        
        ListNode head1 = reverse(stringToList1(Number2));
        ListNode head = reverse(stringToList(Number1));
        
        result(head, head1);
        
        sc.close();

    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            ListNode next_val = current.next;
            current.next = prev;
            prev = current;
            current = next_val;
        }
        return prev;
    }
    public static void result(ListNode head,ListNode head1){
        App app = new App();
        ListNode result = app.merge(head,head1);
        printResult(result);
    
    }
    public static void printResult(ListNode result){
        ListNode current = result;
        while(current != null){
            System.out.print(current.val);
            current = current.next;
        }
        System.out.println();
    }



    
}
