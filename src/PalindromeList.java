/**
 *  
 * @author Floyd
 * Created on 2016年5月23日 下午3:26:29
 */
public class PalindromeList {
	 public boolean isPalindrome(ListNode head) {
	     ListNode fast=head, slow=head;
	     while(fast!=null && fast.next!=null){
	    	 fast = fast.next.next;
	    	 slow = slow.next;
	     }	//slow就是中心
	     ListNode newHead; 
	     if(fast==null){
	    	 //偶数个
	    	 newHead = reverseList(slow);
	     } else{
	    	 newHead = reverseList(slow.next);
	     }
	     while(newHead!=null){
	    	 if(head.val!=newHead.val)
	    		 return false;
	    	 head = head.next;
	    	 newHead = newHead.next;
	     }
		 return true; 
	}
	 
	private ListNode reverseList(ListNode node) {
		// TODO Auto-generated method stub
		if(node==null || node.next==null)	return node;
		ListNode next = node.next;
		node.next=null;
		ListNode newHead = reverseList(next);
		next.next = node;
		return newHead;
	}

	// Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
}
