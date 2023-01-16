public class middleofLL extends ListNode{
    public int countNodes(ListNode head){
        if(head==null) return 0;
        return 1+countNodes(head.next);
    }
    public ListNode middleNode(ListNode head) {
        int ans = countNodes(head);
        if(ans%2!=0){
            for(int i=1;i<(ans+1)/2;i++){
                head=head.next;
            }
        }
        else if(ans%2==0){
            for(int i=1;i<(ans/2)+1;i++){
                head=head.next;
            }
        }
      return head;
    }
    public void printlist(ListNode ll){
        while(ll!=null){
            System.out.print(" "+ll.val+" ");
            ll = ll.next;
        }
    }
    public static void main(String[] args) {
        ListNode ll1= new ListNode(1, new ListNode(2,new ListNode(4,null)));
        middleofLL llm = new middleofLL();
        int a = llm.countNodes(ll1);
        llm.printlist(ll1);
        System.out.println("After finding middle of list");
        llm.printlist(llm.middleNode(ll1));
    }
}
