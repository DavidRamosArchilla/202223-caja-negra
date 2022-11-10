

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.binarytree.*;

public class PruebasConstructor {
    private final BinaryTree<String> b = new BinaryTree<String>("23");

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void testConstructor1() {
        BinaryTree<String> b = new BinaryTree<String>("23");
    }
    @Test
    public void testConstructor2() {
        BinaryTree<String> b = new BinaryTree<String>("hola");
    }
    @Test
    public void testConstructor3() {
        BinaryTree<String> b = new BinaryTree<String>("hola23");
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor4() {
        BinaryTree<String> b = new BinaryTree<String>(null);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testConstructor5() {
        BinaryTree<String> b = new BinaryTree<String>("♪");
    }
}