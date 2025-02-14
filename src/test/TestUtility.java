package test;

import main.model.TreeNode;

/**
 * Class to hold utility functions to be utilized in writing test-cases.
 */
public class TestUtility {
    /**
     * Method to create a Tree with dummy values for test-cases.
     * @return
     */
    public static TreeNode createDummyTree(){
        //Constructing Dummy Min Heap as per the Prompt for testing
        TreeNode root = new TreeNode(45);
        TreeNode a = new TreeNode(65);
        TreeNode b = new TreeNode(72);
        TreeNode c = new TreeNode(90);
        TreeNode d = new TreeNode(81);
        TreeNode e = new TreeNode(82);
        TreeNode f = new TreeNode(96);
        TreeNode g = new TreeNode(99);
        TreeNode h = new TreeNode(95);

        root.setLeft(a);
        root.setRight(b);

        a.setLeft(c);
        a.setRight(d);

        c.setLeft(g);
        c.setRight(h);

        b.setLeft(e);
        b.setRight(f);
        // tree construction ends

        return root;
    }
}
