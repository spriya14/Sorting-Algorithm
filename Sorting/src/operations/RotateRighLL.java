package operations;

public class RotateRighLL {
	
	class ListNode{
		public int val;
		public ListNode next;
		ListNode(int x){
			val = x;
			next = null;
		}
	}
	
	public ListNode rotateright(ListNode A, int B) {
		
		int size = 0;
		ListNode current = A;
		
		while (current.next != null) {
			size ++;
			current = current.next;
		}
		current.next = A;
		
		int count = size - (B%  size ); //Catch Statement 'could memorize this line'
		
		while (count -- >0) {
			current = current.next;
		}
		ListNode new_head = current.next;
		current.next = null;
		return new_head;
		
		
	}

}
