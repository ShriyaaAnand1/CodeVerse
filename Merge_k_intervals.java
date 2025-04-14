public class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            List<Integer> values = new ArrayList<>();
            for (ListNode node : lists) {
                while (node != null) {
                    values.add(node.val);
                    node = node.next;
                }
            }
            Collections.sort(values);
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;
            for (int val : values) {
                current.next = new ListNode(val);
                current = current.next;
            }
            return dummy.next;
        }
    }
