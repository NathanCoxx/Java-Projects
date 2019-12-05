  /*
 * NAME: BENJAMIN KING AND NATHAN COX
 * 
 * CLASS: COSC 237.001
 * 
 * ASSIGNMENT 3 BONUS(ADAPTION FOR GENARICS)
 * 
 */ 

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
    