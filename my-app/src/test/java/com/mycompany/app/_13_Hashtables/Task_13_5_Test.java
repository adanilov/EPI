package com.mycompany.app._13_Hashtables;

import com.mycompany.app._13_Hashtables.BinaryTreeWithParentPrototype.BinaryTree;
import junit.framework.TestCase;

import static com.mycompany.app._13_Hashtables.Task_13_5.LCA;

public class Task_13_5_Test extends TestCase {

    public void test0() {
        // 3
        // 2 5
        // 1 4 6
        BinaryTree<Integer> root = new BinaryTree<>(3, null, null);
        root.left = new BinaryTree<>(2, null, null);
        root.left.parent = root;
        root.left.left = new BinaryTree<>(1, null, null);
        root.left.left.parent = root.left;
        root.right = new BinaryTree<>(5, null, null);
        root.right.parent = root;
        root.right.left = new BinaryTree<>(4, null, null);
        root.right.left.parent = root.right;
        root.right.right = new BinaryTree<>(6, null, null);
        root.right.right.parent = root.right;

        // should output 3
        assert (LCA(root.left, root.right).data.equals(3));
        System.out.println(LCA(root.left, root.right).data);
        // should output 5
        assert (LCA(root.right.left, root.right.right).data.equals(5));
        System.out.println(LCA(root.right.left, root.right.right).data);
    }
}
