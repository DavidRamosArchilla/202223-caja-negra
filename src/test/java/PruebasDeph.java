import com.binarytree.BinaryTree;

import com.binarytree.Node;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PruebasDeph {
    private BinaryTree<String> b;
    private Node<String> root;

    @BeforeEach
    public void setUp(){
        b = new BinaryTree<String>("20");
        root = b.getRoot();
    }

    @Test
    public void testDepth1(){
        Assertions.assertEquals(b.depth(), 0);
    }
    @Test
    public void testDepth2(){
        addNodos(3, root);
        Assertions.assertEquals(b.depth(), 3);
    }
    @Test
    public void testDepth3(){
        Node<String> n = b.insert("24", root, true);
        Assertions.assertEquals(b.depth(n), 0);
    }
    @Test
    public void testDepth4(){
        Node<String> n = b.insert("24", root, true);
//        b.insert("25", n, true);
        addNodos(3, n);
        Assertions.assertEquals(b.depth(n), 3);
    }

    private void addNodos(int cantidad, Node<String> inicio){
        Node<String> n = inicio;
        for(int i=0;i<cantidad;i++){
            n = b.insert("2" + (i+1), n,i%2==0);
        }
    }
}
