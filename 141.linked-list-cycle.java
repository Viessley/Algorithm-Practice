
class ListNode {
    int val;           
    ListNode next;     
    
    ListNode() {}   
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) {
        this.val = val; 
        this.next = next; 
    }
}


class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode ptrFast = head;
        ListNode ptrSlow = head;

        while(ptrFast != null && ptrFast.next != null){
            ptrFast = ptrFast.next.next;
            ptrSlow = ptrSlow.next;
            if(ptrFast == ptrSlow){
                return true;
            }
        }
        return false;
    }
}