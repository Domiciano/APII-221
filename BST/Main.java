public class Main {

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(new Node(20));
        b.insert(new Node(11));
        b.insert(new Node(8));
        b.insert(new Node(13));
        b.insert(new Node(5));
        b.insert(new Node(9));
        b.insert(new Node(42));
        b.insert(new Node(29));
        b.insert(new Node(44));
        b.insert(new Node(38));
        b.insert(new Node(30));
        b.insert(new Node(39));
        b.insert(new Node(43));

        b.inorder();
        System.out.println("------");

    }

}
