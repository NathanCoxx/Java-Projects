package Agnment3GENARICS;

public class UnorderedLinkedList<T> extends LinkedListClass<T> { 
    //Default constructor 
    public UnorderedLinkedList() { 
        super(); 
    }

    public boolean search(T searchItem)  { 
        LinkedListNode<T> current; //variable to traverse the list 
        current = first; 
        while (current != null) 
            if (current.info.equals(searchItem)) 
                return true; 
            else 
               current = current.link; 
        return false; 
    }

    public void insertFirst(T newItem) { 
        LinkedListNode<T> newNode;  //variable to create the new node 
        //create and insert newNode before first 
        newNode = new LinkedListNode<T>(newItem, first); 
        first = newNode; 
        if (last == null) 
            last = newNode; 
        count++; 
    }

    public void insertLast(T newItem)  { 
        LinkedListNode newNode; //variable to create the new node 
        //create newNode 
        newNode = new LinkedListNode(newItem, null); 
        if (first == null) { 
            first = newNode; 
            last = newNode; 
        } 
        else { 
            last.link = newNode; 
            last = newNode;

        } 
        count++; 
    }

    public void deleteNode(T deleteItem) { 
        LinkedListNode<T> current; //variable to traverse the list 
        LinkedListNode<T> trailCurrent; //variable just before current 
        boolean found; 
        //Case 1; the list is empty 
        if ( first == null) 
            System.err.println("Cannot delete from an empty list."); 
        else { 
            //Case 2: the node to be deleted is first 
            if (first.info.equals(deleteItem)) { 
                first = first.link; 
                if (first == null)  //the list had only one node 
                    last = null; 
                count--; 
            } 
            else {  //search the list for the given info 
                found = false; 
                trailCurrent = first; //trailCurrent points to first node 
                current = first.link; //current points to second node 
                while (current != null && !found) { 
                    if (current.info.equals(deleteItem)) 
                        found = true; 
                    else { 
                        trailCurrent = current; 
                        current = current.link; 
                    } 
                } 
                //Case 3; if found, delete the node 
                if (found) { 
                    count--; 
                    trailCurrent.link = current.link; 
                    if (last == current)  //node to be deleted was the last node 
                       last = trailCurrent; 
                } 
                else 
                   System.out.println("Item to be deleted is not in the list."); 
            } 
        } 
    }
    public void merge1(UnorderedLinkedList<T> list_2) {
    	UnorderedLinkedList<T> list_1 = this;
    	while(list_2.first != null) {
    		list_1.insertLast(list_2.first.info);
    		list_2.first = list_2.first.link;
    	}
    }
    public UnorderedLinkedList<T> merge2(UnorderedLinkedList<T> list_2) {
    	UnorderedLinkedList<T> list_3 = new UnorderedLinkedList<T>();
    	UnorderedLinkedList<T> list_1 = this;
    	while(list_1.first != null) {
    		list_3.insertLast(list_1.first.info);
    		list_1.first = list_1.first.link;
    }
    	while(list_2.first != null) {
    		list_3.insertLast(list_2.first.info);
    		list_2.first = list_2.first.link;
    	}
    	return list_3;
    }
    public void split(UnorderedLinkedList<T> list_1, UnorderedLinkedList<T> list_2, T key) {
    	UnorderedLinkedList<T> list_3 = this;
    	UnorderedLinkedList<T>.LinkedListNode<T> node = list_3.first;
    	while(node != null) {
    		Comparable<T> nodeInfo = (Comparable<T>) node.info;
    		if (nodeInfo.compareTo(key) > 0)
    			list_2.insertLast(node.info);
    		else
    			list_1.insertLast(node.info);
    		node = node.link;
    	}
    }
}


