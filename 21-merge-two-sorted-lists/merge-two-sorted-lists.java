/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

            ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    while (list1 != null && list2 != null) {
        if (list1.val <= list2.val) {
            curr.next = list1;
            list1 = list1.next;
        } else {
            curr.next = list2;         // soln in O(N)
            list2 = list2.next;
        }
        curr = curr.next;
    }
    curr.next = (list1 != null) ? list1 : list2;
    return dummy.next;

    //   List<Integer> st = new ArrayList<>();
    //  ListNode t = list1;
    //  while(t != null){
    //     st.add(t.val);
    //     t = t.next;
    //     }

    // for (ListNode x = list2; x != null; x = x.next) st.add(x.val);
  
    // Collections.sort(st);   dominating so o(nlogn)

    // ListNode dummy = new ListNode(-1);
    // ListNode curr = dummy;
    // for (int val : st) {
    //     curr.next = new ListNode(val);  
    //     curr = curr.next;
    // }
    // return dummy.next;
    }
}