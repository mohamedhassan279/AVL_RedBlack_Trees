public class Main {
    public static void main(String[] args) {
//        RedBlackTree t = new RedBlackTree();
//        System.out.println(t.insert(41));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.insert(38));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.insert(31));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.insert(12));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.insert(19));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.insert(8));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//
//        System.out.println(t.delete(8));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.delete(12));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.delete(19));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.delete(31));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.delete(38));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(t.delete(41));
//        t.test(t.root);
//        System.out.println(t.size());
//        System.out.println("-----------------------------------------");


        // Let's create a Red-Black tree and fill it with some nodes
        RedBlackTree tree = new RedBlackTree();
        System.out.println(tree.insert(7));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");

        System.out.println(tree.insert(3));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(18));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(10));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(22));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(8));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(11));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(26));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(2));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(6));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.insert(13));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");

// Case 1: Deleting a leaf node that is black
        System.out.println(tree.delete(13));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.delete(18));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.delete(11));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.delete(10));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.delete(3));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
        System.out.println(tree.delete(7));
        tree.test(tree.root);
        System.out.println(tree.size());
        System.out.println("-----------------------------------------");
//        System.out.println(tree.delete(20));
//        tree.test(tree.root);
//        System.out.println(tree.size());
//        System.out.println("-----------------------------------------");
//        System.out.println(tree.delete(8));
//        tree.test(tree.root);
//        System.out.println(tree.size());
//        System.out.println("-----------------------------------------");


//// Case 2: Deleting a node that has only one child
//        tree.delete(18);
//
//// Case 3: Deleting a node that has two children
//        tree.delete(11);
//
//// Case 3 (continued): Deleting a node that has two children and its successor has a right child
//        tree.delete(10);
//
//// Case 3 (continued): Deleting a node that has two children and its successor doesn't have a right child
//        tree.delete(3);
//
//// Case 1: Deleting the root node (which is a leaf node)
//        tree.delete(7);
//
//// Case 2: Deleting a node that has only one child (which is the new root node)
//        tree.delete(22);
//
//// Case 2: Deleting the only remaining node in the tree
//        tree.delete(8);

    }
}