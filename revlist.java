public class revlist extends ListNode {
    public ListNode reverselist (ListNode head){
        if(head==null || head.next==null)
           return head;
       ListNode curr = head;
       ListNode prev = null;
       ListNode nxt = null;
       while(curr!=null){
         nxt=curr.next;
         curr.next = prev;
         prev=curr;
         curr=nxt;
       }    
       head=prev;
        return head;
    }
    public void printlist(ListNode ll){
        while(ll!=null){
            System.out.print(" "+ll.val+" ");
            ll = ll.next;
        }
    }
    public static void main(String[] args) {
        ListNode ll = new ListNode(12,new ListNode(23, new ListNode(14,null)));
        revlist rl = new revlist();
        // rl.printlist(ll);
        rl.reverselist(ll);
        rl.printlist(ll);
    }
}
