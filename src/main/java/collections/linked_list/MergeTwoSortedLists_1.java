package collections.linked_list;


/**
    You are given the heads of two sorted linked lists list1 and list2.
    Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
    Return the head of the merged linked list.
 */

public class MergeTwoSortedLists_1 {
    public static void main(String[] args){

        ListNode l1 = new ListNode(1, new ListNode(3, new ListNode(6, new ListNode(9))));
        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(15))));

        ListNode l = mergeTwoLists(l1, l2);
            while (true) {
                if (l != null ){
                    System.out.println(l.val);
                    if (l.next != null) {
                        l = l.next;
                    } else break;
                }
            }
    }

    public static ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        ListNode root = new ListNode();
        if (node1 != null && node2 != null){
            if (node1.val < node2.val){
                root.val = node1.val;
                root.next = mergeTwoLists(node1.next, node2);
            } else {
                root.val = node2.val;
                root.next = mergeTwoLists(node1, node2.next);
            }
        } else if (node1 != null){
            root.val = node1.val;
            root.next = mergeTwoLists(node1.next, null);
        } else if (node2 != null){
            root.val = node2.val;
            root.next = mergeTwoLists(node2.next, null);
        } else {
            return null;
        }
        return root;
    }
}
