package Trees;

public class BinarySearchTree {

	/* Class containing left and right child of current node and key value*/
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
  
    
    /* Given a binary tree, print its nodes according to the 
    "bottom-up" postorder traversal. */
  void printPostorder(Node node) 
  { 
      if (node == null) 
          return; 

      // first recur on left subtree 
      printPostorder(node.left); 

      // then recur on right subtree 
      printPostorder(node.right); 

      // now deal with the node 
      System.out.print(node.key + " "); 
  } 

  /* Given a binary tree, print its nodes in inorder*/
  void printInorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first recur on left child */
      printInorder(node.left); 

      /* then print the data of node */
      System.out.print(node.key + " "); 

      /* now recur on right child */
      printInorder(node.right); 
  } 

  /* Given a binary tree, print its nodes in preorder*/
  void printPreorder(Node node) 
  { 
      if (node == null) 
          return; 

      /* first print data of node */
      System.out.print(node.key + " "); 

      /* then recur on left sutree */
      printPreorder(node.left); 

      /* now recur on right subtree */
      printPreorder(node.right); 
  }
  
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(1); 
        tree.insert(2); 
        tree.insert(3); 
        tree.insert(4); 
        tree.insert(5); 
      
  
        // print inorder traversal of the BST 
        tree.printPreorder(tree.root); 
        System.out.println();
        tree.printInorder(tree.root); 
        System.out.println();

        tree.printPostorder(tree.root); 

    } 
} 

