public class BST {

    public Node root;

    private void insert(Node current, Node node) {
        if (root == null) {
            root = node;
        } else if (node.value < current.value) {
            if (current.left == null) {
                current.left = node;
            } else {
                insert(current.left, node);
            }
        } else if (node.value > current.value) {
            if (current.right == null) {
                current.right = node;
            } else {
                insert(current.right, node);
            }
        }
    }

    public void insert(Node node) {
        insert(root, node);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.println(">>>" + node.value);
        inorder(node.right);
    }

    public void inorder() {
        inorder(root);
        System.out.println("Root: "+root.value);
    }

}
