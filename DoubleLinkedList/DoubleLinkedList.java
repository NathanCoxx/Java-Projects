package assignment4;

public class DoubleLinkedList<T> implements DoubleLinkedListADT<T> { 
	//Double linked list node class 
	public class DoubleLinkedListNode<T>  { 
		T info; 
		DoubleLinkedListNode<T> next; 
		DoubleLinkedListNode<T> back;

		public DoubleLinkedListNode() { 
			info = null; 
			next = null; 
			back = null; 
		}
		public DoubleLinkedListNode(T elem, DoubleLinkedListNode<T> an) { 
			info = elem; 
			back = null;
			next = an; 
		}

		public String toString() { 
			return info.toString(); 
		} 
	}

	protected int count;  //number of nodes 
	protected DoubleLinkedListNode<T> first; //reference to first node 
	protected DoubleLinkedListNode<T> last;  //reference to last node 
	public DoubleLinkedList() { 
		first = null; 
		last = null; 
		count = 0; 
	}

	public boolean isEmptyList() { 
		return (first == null); 
	}

	public void initializeList() { 
		first = null; 
		last = null; 
		count = 0; 
	}
	public T front()   { 
		return first.info; 
	}

	public T back()  { 
		return last.info; 
	}
	public int length() {
		return count;
	}
	public void print()  { 
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		current = first; 
		while (current != null) {//while more data to print 
			System.out.print(current.info + " "); 
			current = current.next; 
		} 
	}
	public void reversePrint()  { 
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		current = last; 
		while (current != null) {//while more data to print 
			System.out.print(current.info + " "); 
			current = current.back; 
		} 
	}
	public boolean search(T searchItem)  { 
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		current = first; 
		while (current != null) 
			if (current.info.equals(searchItem)) 
				return true; 
			else 
				current = current.next; 
		return false; 
	}
	public void insertNode(T newItem) { 
		DoubleLinkedListNode<T> newNode = new DoubleLinkedListNode<T>();  //variable to create the new node 
		DoubleLinkedListNode<T> current = first;
		DoubleLinkedListNode<T> trailCurrent = null;
		newNode.info = newItem;
		boolean b = false;
		if(first == null) {
			first = newNode;
			last = newNode;
			count++;
		}
		else {
			while(current != null && !b) {
				Comparable<T> temp = (Comparable<T>)current.info;

				if(temp.compareTo(newItem) >= 0) {
					b = true;
					break;
				}
				trailCurrent = current;
				current = current.next;
			}
			if(current == first) {
				newNode.next = first;
				first.back = newNode;
				first = newNode;
				count++;
			}
			else if(current == null) {
				trailCurrent.next = newNode;
				newNode.back = trailCurrent;
				last = newNode;
				count++;
			}
			else {
				trailCurrent.next = newNode;
				newNode.back = trailCurrent;
				newNode.next = current;
				current.back= newNode;
				count++;
			}
		}


	}
	public void deleteNode(T deleteItem) { 
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		DoubleLinkedListNode<T> trailCurrent; //variable just before current 
		boolean found; 
		//Case 1; the list is empty 
		if ( first == null) 
			System.err.println("Cannot delete from an empty list."); 
		else { 
			//Case 2: the node to be deleted is first 
			if (first.info.equals(deleteItem)) { 
				first = first.next; 
				if (first == null)  //the list had only one node 
					last = null; 
				count--; 
			} 
			else {  //search the list for the given info 
				found = false; 
				trailCurrent = first; //trailCurrent points to first node 
				current = first.next; //current points to second node 
				while (current != null && !found) { 
					if (current.info.equals(deleteItem)) 
						found = true; 
					else { 
						trailCurrent = current; 
						current = current.next; 
					} 
				} 
				//Case 3; if found, delete the node 
				if (found) { 
					count--; 
					trailCurrent.next = current.next; 
					if (last == current)  //node to be deleted was the last node 
						last = trailCurrent; 
				} 
				else 
					System.out.println("Item to be deleted is not in the list."); 
			} 
		} 
	} 
	public String toString() {
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		String output = " [head]";
		current = first;
		while(current != null) {
			output += " - " + current.info;
			current = current.next;
		}
		return output + "-[tail]";
	}
	public String recursiveToString() {
		return recursiveToString(first)+ " ";
	}
	public String recursiveToString(DoubleLinkedListNode<T> head) {
		if(head == null)
			return "[tail]";
		else
			return head.info.toString()+ " - " +recursiveToString(head.next);	
	}
	public String backwardsString() {
		DoubleLinkedListNode<T> current; //variable to traverse the list 
		String output = "[tail]-";
		current = last;
		while(current != null) {
			output += " " + current.info;
			current = current.back;
		}
		return output + "-[head]";
	}
	public String recursiveBackwardsString() {
		return " [tail] " + recursiveBackwardsString(last);
	}
	public String recursiveBackwardsString(DoubleLinkedListNode<T> node) {
		if(node == null)
			return "";
		else
			return node.info.toString()+ " - " +recursiveBackwardsString(node.back);	
	}
	public boolean equals(Object o) {
		DoubleLinkedList<T> otherList = (DoubleLinkedList<T>)o;
		DoubleLinkedListNode<T> current1;
		DoubleLinkedListNode<T> current2;
		if(first == null || otherList.first == null)
			return false; //Empty list
		else {
			current1 = first;
			current2 = otherList.first;	

			while(current1 != null && current2 != null) {
				Comparable<T> listElem = (Comparable<T>) current2.info;
				if(listElem.compareTo(current1.info) != 0) { 
					return false;
				}
				else {				
					current1 = current1.next;
					current2 = current2.next;
				}
			}
			return true;
		}

	}
	public void copy(DoubleLinkedList<T> otherList){
		DoubleLinkedListNode<T> newNode;
		DoubleLinkedListNode<T> currentNode=otherList.first;     
		if(otherList.first==null){
			this.first = this.last=null;
			count = 0;
		}
		else{
			this.first = this.last = null;
			this.count = otherList.count;
			this.first = new DoubleLinkedListNode();
			this.first.info = currentNode.info;
			this.first.next = null;
			this.last = this.first;
			currentNode = currentNode.next;
			while(currentNode!=null) {
				newNode=new DoubleLinkedListNode();

				newNode.info=currentNode.info;
				newNode.back=this.last;
				this.last.next=newNode;
				this.last=newNode;
				currentNode=currentNode.next;
			}
		}
	}
	public void reversedCopy(DoubleLinkedList<T> otherList){
		DoubleLinkedListNode<T> newNode;
		DoubleLinkedListNode<T> currentNode=otherList.last;   

		if(otherList.first==null){
			this.first=this.last=null;
			count=0;
		}
		else{
			this.first=this.last=null;
			this.count=otherList.count;
			this.first=new DoubleLinkedListNode();

			this.first.info=currentNode.info;
			this.first.next=null;
			this.last=this.first;
			currentNode=currentNode.back;
			while(currentNode!=null){
				newNode=new DoubleLinkedListNode();

				newNode.info=currentNode.info;
				newNode.back=this.last;
				this.last.next=newNode;
				this.last=newNode;
				currentNode=currentNode.back;
			}
		}
	}
}

