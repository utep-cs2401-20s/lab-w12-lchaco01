class myBinarySearchTreeNode {
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue) {
    // creates the variables
    myValue = inValue;
    left = null;
    right = null;
  }
  
  myBinarySearchTreeNode(int[] A){
    //starts the tree
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);
    // adds the beginning of the tree
    myValue = A[0];
    // Goes through the array and adds the vales to the tree
    for (int i = 1; i < A.length; i++) {
      this.insert(A[i]);
    }
  }
  
  public void insert(int inValue) {
    // Looks through each part of the tree and inserts the number in the correct place
    if (inValue < myValue) {
      if (left == null) {
        left = new myBinarySearchTreeNode(inValue);
      } else {
        left.insert(inValue);
      }
    } else if (inValue > myValue) {
      if (right == null) {
        right = new myBinarySearchTreeNode(inValue);
      } else {
        right.insert(inValue);
      }
    }
    else if (inValue == myValue) {
      //handles if there is a duplicate number
      System.out.println("Can not add duplicate numbers.");
    }
  }
  
  public int height() {
     // This registers the height of the tree
     int treeHeight;
     int lHeight = 0;
     int rHeight = 0;

     if (left != null) {
       lHeight++;
       lHeight = left.height();
     }
     if (right != null) {
       rHeight++;
       rHeight = right.height();
     }
     if (lHeight > rHeight) {
       treeHeight = lHeight;
     } else {
       treeHeight = rHeight;
     }
     return treeHeight + 1;
  }
  
  public int depth(int search) {
     // This method will find the picked value's depth in the tree
    if (search < myValue) {
      return left.depth(search) + 1;
    }
    if (search > myValue) {
      return right.depth(search) + 1;
    }
    if (search == myValue) {
      return 0;
    }
    return -1;
  }

  public int size() {
    //This will go through the whole tree and count the size
    int sum = 1;
    if (left != null) {
      sum += left.size();
    }
    if (right != null) {
      sum += right.size();
    }
    return sum;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
