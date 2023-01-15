public class merge2llists extends ListNode{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = new ListNode(-1);
        ListNode ptr1 = list1;
        ListNode ptr2 = list2;
        ListNode ptr3 = merged;
        while(ptr1!=null && ptr2!=null){
            if(ptr1.val>=ptr2.val){
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
            }
            else if(ptr1.val<ptr2.val){
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
            }
            ptr3 = ptr3.next;
        }
        if(ptr1!=null) ptr3.next=ptr1; 
        if(ptr2!=null) ptr3.next=ptr2;
        return merged.next;
    }
    public void printlist(ListNode ll){
        while(ll!=null){
            System.out.print(" "+ll.val+" ");
            ll = ll.next;
        }
    }
    public static void main(String[] args) {
        ListNode ll1= new ListNode(1, new ListNode(2,new ListNode(4,null)));
        ListNode ll2= new ListNode(1, new ListNode(3,new ListNode(4,null)));
        merge2llists mll = new merge2llists();
        ListNode merged = mll.mergeTwoLists(ll1, ll2);
        mll.printlist(merged);
    }
}