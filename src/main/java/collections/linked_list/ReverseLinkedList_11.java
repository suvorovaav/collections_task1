package collections.linked_list;

/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */

public class ReverseLinkedList_11 {
    public static void main(String[] args){
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
//        ListNode listNode = new ListNode(1);
        result(reverseList(listNode));
    }
    public static void result(ListNode listNode){
        while (true){
            System.out.println(listNode.val);
            if (listNode.next != null){
                listNode = listNode.next;
            } else {
                break;
            }
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode previous;
        ListNode buff= null;
        if (head!=null){
            buff = new ListNode(head.val);
            while (head.next != null) {
                previous = new ListNode(head.next.val, buff);
                buff = previous;
                head = head.next;
            }
        }
        return buff;
    }

    // just to know
//    public static ListNode reverseListRecursive(ListNode head) {
//        // Special case...
//        if (head == null || head.next == null) return head;
//        // Create a new node to call the function recursively and we get the reverse linked list...
//        ListNode res = reverseList(head.next);
//        // Set head node as head.next.next...
//        head.next.next = head;
//        //set head's next to be null...
//        head.next = null;
//        return res;     // Return the reverse linked list...
//    }

}
