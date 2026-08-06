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
      List<Integer> st = new ArrayList<>();
     ListNode t = list1;
     while(t != null){
        st.add(t.val);
        t = t.next;
        }

    for (ListNode x = list2; x != null; x = x.next) st.add(x.val);
  
    Collections.sort(st);

    ListNode dummy = new ListNode(-1);
    ListNode curr = dummy;
    for (int val : st) {
        curr.next = new ListNode(val);
        curr = curr.next;
    }
    return dummy.next;
    }
}