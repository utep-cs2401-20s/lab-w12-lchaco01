
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class myBinarySearchTreeNodeTest {
    @Test
//This tests that the program goes through the methods
    public void MBSTNTest1() {
        myBinarySearchTreeNode test = new myBinarySearchTreeNode(new int []{3,5,1,2,4});
        //test.print();
        assertEquals(5,test.size());
        assertEquals(3,test.height());
        assertEquals(1,test.depth(1));
    }

    @Test
//This tests that the program detects the duplicate
    public void MBSTNTest2() {
        myBinarySearchTreeNode test2 = new myBinarySearchTreeNode(new int []{2,5,3,6,9,3});
        //test2.print();
        assertEquals(5,test2.size());
        assertEquals(4, test2.height());
        assertEquals(3,test2.depth(9));
    }

    @Test
//This tests a bigger tree for the methods
    public void MBSTNTest3() {
        myBinarySearchTreeNode test3 = new myBinarySearchTreeNode(new int []{2,4,3,6,1,8,9,7,5});
        //test3.print();
        assertEquals(9,test3.size());
        assertEquals(5,test3.height());
        assertEquals(3,test3.depth(8));
    }

    @Test
//This tests that the number gets inset, a negative number, and the path is correct.
    public void MBSTNTest4() {
        myBinarySearchTreeNode test4 = new myBinarySearchTreeNode(new int[]{5,1,3,7});
        //test4.insert(-3);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int[]{5,1,3,7,-3});
        test4.print();
        assertEquals(exp.myValue, test4.myValue);
        assertEquals(exp.left.right.myValue, test4.left.right.myValue);
        assertEquals(exp.right.myValue, test4.right.myValue);
    }

    @Test
//This tests that is handles the path and the negative number
    public void MBSTNTest5(){
        myBinarySearchTreeNode test5 = new myBinarySearchTreeNode(new int[]{0,-1,1,-2,2,});
        //test5.insert(3);
        myBinarySearchTreeNode exp = new myBinarySearchTreeNode(new int[]{0,-1,1,-2,2,3});
        test5.print();
        assertEquals(exp.myValue, test5.myValue);
        assertEquals(exp.left.myValue, test5.left.myValue);
        assertEquals(exp.right.myValue, test5.right.myValue);
    }
}