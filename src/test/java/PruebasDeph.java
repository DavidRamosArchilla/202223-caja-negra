import com.binarytree.BinaryTree;

import com.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PruebasDeph {
    private BinaryTree<String> b;

    @BeforeEach
    public void setUp(){
        b = new BinaryTree<String>("23");
    }

    @Test
    public void testDepth1(){
        Assertions.assertEquals(b.depth(), 0);
    }
    @Test
    public void testDepth2(){
        b.insert("24", b.getRoot(), true);
        Assertions.assertEquals(b.depth(), 1);
    }
    @Test
    public void testDepth3(){
        Node<String> n = b.insert("24", b.getRoot(), true);
        Assertions.assertEquals(b.depth(n), 0);
    }
    @Test
    public void testDepth4(){
        Node<String> n = b.insert("24", b.getRoot(), true);
        b.insert("25", n, true);
        Assertions.assertEquals(b.depth(n), 1);
    }
}
