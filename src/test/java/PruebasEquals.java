import com.binarytree.BinaryTree;

import com.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PruebasEquals {
    private BinaryTree<String> b;


    @BeforeEach
    public void setUp(){
        b = new BinaryTree<String>("20");
    }

    @Test
    public void testEquals1(){
        BinaryTree<String> c = new BinaryTree<>("20");
        Assertions.assertTrue(b.equals(c));
    }

    @Test
    public void testEquals2(){
        BinaryTree<String> c = new BinaryTree<>("21");
        Assertions.assertFalse(b.equals(c));
    }

    @Test
    public void testEquals3(){
        BinaryTree<String> c = new BinaryTree<>("20");
        c.insert("21", c.getRoot(), true);
        Assertions.assertFalse(b.equals(c));
    }

    @Test
    public void testEquals4(){
        BinaryTree<String> c = new BinaryTree<>("20");
        c.insert("21", c.getRoot(), true);
        b.insert("21", b.getRoot(), true);
        Assertions.assertTrue(b.equals(c));
    }
    @Test
    public void testEquals5(){
        BinaryTree<String> c = new BinaryTree<>("20");
        c.insert("21", c.getRoot(), true);
        b.insert("21", b.getRoot(), false);
        Assertions.assertFalse(b.equals(c));
    }

}
