package lab13;

//class: ClientBST 
//Input in this order: 70 83 39 27 45 94 55 80 85 105 40 95 102 52 50 125 110 999
import java.util.Scanner; 
public class Lab13Client { 
  public static void main(String[] args) { 
      Scanner input = new Scanner(System.in); 
      BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>(); 
      BinarySearchTree<Integer> bst2 = new BinarySearchTree<Integer>(); 
      Integer num; 
      System.out.print("Enter integers(999 to stop): "); 
      num = input.nextInt(); 
      while (num != 999) { 
          bst.insert(num); 
          bst2.insert(num);
          num = input.nextInt(); 
      } 
      System.out.println("Tree Height: " + bst.treeHeight()); 
      /*
      System.out.print("Enter value to search for: "); 
      num = input.nextInt(); 
      if(bst.search(num)) 
          System.out.println(num + " was found in this tree"); 
      else 
          System.out.println(num + " was NOT found in this tree"); 
      System.out.print("Inorder traversal: "); 
      bst.inOrderTraversal(); 
      System.out.print("\nPreorder traversal: "); 
      bst.preOrderTraversal(); 
      System.out.print("\nPostorder traversal: "); 
      bst.postOrderTraversal(); 
      System.out.print("\nEnter value to be deleted from tree: "); 
      num = input.nextInt(); 
      bst.delete(num); 
      System.out.print("\nInorder traversal after removing " + num + ": "); 
      bst.inOrderTraversal(); 
      System.out.print("\nPreorder traversal after removing " + num + ": "); 
      bst.preOrderTraversal(); 
      System.out.print("\nPostorder traversal after removing " + num + ": "); 
      bst.postOrderTraversal(); 
      System.out.println();
      */
      System.out.println("Testing isBST method: ");
      if(bst.isBinarySearchTree())
    	  System.out.println("This is a BST");
      else
    	  System.out.println("This is not a BST");
      System.out.println("Testing similar tree method: ");
      if(bst.similarTrees(bst2.root))
    	  System.out.println("These are simlar trees.");
      else
    	  System.out.println("These trees are not similar.");
      System.out.println("Changing the trees.....");
      bst2.delete(39);
      System.out.println("After changing: ");
      if(bst.similarTrees(bst2.root))
    	  System.out.println("These are simlar trees.");
      else
    	  System.out.println("These trees are not similar.");
      System.out.println("End Testing.");	  
  } 
} 