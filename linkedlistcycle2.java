public class linkedlistcycle2 {
    //https://leetcode.com/problems/linked-list-cycle-ii/solutions/1701128/c-java-python-slow-and-fast-image-explanation-beginner-friendly/
    // https://www.google.com/search?q=142.+Linked+List+Cycle+II&sxsrf=AJOqlzXTHsP8quK7tK85CjyrOG6mvGvOdQ:1673932619315&source=lnms&tbm=vid&sa=X&ved=2ahUKEwinwJv57M38AhUsUGwGHZMfDBEQ_AUoAnoECAEQBA#fpstate=ive&vld=cid:30da9e21,vid:rBIS-donFpU
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
       while (fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
           if (slow == fast) break;
       }
       if (fast == null || fast.next == null) return null;
       while (head != slow) {
           head = head.next;
           slow = slow.next;
       }
       return head;
}
}
