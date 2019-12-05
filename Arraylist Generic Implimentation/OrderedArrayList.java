package Agnment3GENARICS;


public class OrderedArrayList<T> extends ArrayListClass<T>{ 
    //Default constructor 
    public OrderedArrayList() { 
        super(); 
    }

    //Alternate constructor 
    public OrderedArrayList(int size) { 
        super(size); 
    }

    //implementation for abstract methods defined in ArrayListClass 
    //ordered list --> binary search 
    public int search(T item) { 
        int first = 0; 
        int last = length - 1; 
        int middle = -1;

        while (first <= last)  { 
            middle = (first + last) / 2; 
            Comparable<T> listElem = (Comparable<T>) list[middle]; 
            if (listElem.compareTo(item) == 0) 
                return middle; 
            else 
                if (listElem.compareTo(item) > 0) 
                    last = middle - 1; 
                else 
                    first = middle + 1; 
        } 
        return -1; 
    }

    public void insert(T item) { 
        int loc; 
        boolean found = false; 
        if (length == 0)         //list is empty 
            list[length++] = item;  //insert item and increment length 
        else if (length == maxSize) //list is full 
            System.err.println("Cannot insert in a full list."); 
        else { 
            for (loc = 0; loc < length; loc++) { 
                Comparable<T> temp = (Comparable<T>) list[loc]; 
                if (temp.compareTo(item) >= 0) { 
                    found = true; 
                    break; 
                } 
            } 
            //starting at the end, shift right 
            for (int i = length; i > loc; i--) 
                list[i] = list[i - 1]; 
            list[loc] = item; 
            length++; 
        } 
    }
    public void insertAt(int location, T item)  { 
        if (location < 0 || location >= maxSize) 
            System.err.println("The position of the item to be inserted is out of range."); 
        else if (length == maxSize)  //list is full 
            System.err.println("Cannot insert in a full list."); 
        else { 
            System.out.println("This is a sorted list. Doing insert in place (call to insert)."); 
            insert(item); 
        } 
    }

    public void insertEnd(T item) { 
        if (length == maxSize)  //the list is full 
            System.err.println("Cannot insert in a full list."); 
        else { 
            System.out.println("This is a sorted list. Doing insert in place (call to insert)."); 
            insert(item); 
        } 
    }

    public void replaceAt(int location, T item) { 
        //the list is sorted! 
        //is actually removing the element at location and inserting item in place 
        if (location < 0 || location >= length) 
             System.err.println("The position of the item to be replaced is out of range."); 
        else { 
            removeAt(location);//method in ArrayListClass 
            insert(item); 
        } 
    }

     public void remove(T item) { 
        int loc; 
        if (length == 0) 
            System.err.println("Cannot delete from an empty list."); 
        else  { 
            loc = search(item); 
            if (loc != -1) 
                removeAt(loc);//method in ArrayListClass 
            else 
                System.out.println("The item to be deleted is not in the list.");
        } 
    }
	public OrderedArrayList<T> merge(OrderedArrayList<T> otherList) {
		OrderedArrayList<T> newList = new OrderedArrayList<T>();
		for(int i = 0; i < length; i++) {
			newList.insert(list[i]);
		}
		for(int i = 0; i < otherList.listSize(); i++) {
			newList.insert(otherList.retrieveAt(i));
		}
		return newList;
	}
	public OrderedArrayList<T> split(OrderedArrayList<T> list2, T key) {
		OrderedArrayList<T> list1 = new OrderedArrayList<T>();
		for(int i = 0; i < length; i++) {
			Comparable<T> listElem = (Comparable<T>) (T)list[i];
			if(listElem.compareTo(key) > 0) {
				list2.insert(list[i]);
			}
			else {
				list1.insert(list[i]);
			}
		}
		return list1;
	}
}
