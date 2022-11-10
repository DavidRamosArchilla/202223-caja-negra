import com.binarytree.BinaryTree;

import com.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PruebasDeph {


    @Test
    public void testDepth1(){
        BinaryTree<String> b = new BinaryTree<String>("23");
        Assertions.assertEquals(b.depth(), 0);
    }
    @Test
    public void testDepth2(){
        BinaryTree<String> b = new BinaryTree<String>("23");
        b.insert("24", b.getRoot(), true);
        Assertions.assertEquals(b.depth(), 1);
    }
    @Test
    public void testDepth3(){
        BinaryTree<String> b = new BinaryTree<String>("23");
        b.insert("24", b.getRoot(), true);
        Assertions.assertEquals(b.depth(b.search("24")), 0);
    }
    @Test
    public void testDepth4(){
        BinaryTree<String> b = new BinaryTree<String>("23");
        b.insert("24", b.getRoot(), true);
        b.insert("25", b.search("24"), true);
        System.out.println(b);
        Assertions.assertEquals(b.depth(b.search("24")), 1);
    }
}
