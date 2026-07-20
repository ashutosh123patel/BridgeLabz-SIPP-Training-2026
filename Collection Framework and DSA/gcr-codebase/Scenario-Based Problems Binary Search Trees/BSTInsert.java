public class BSTInsert {

    static class Node {

        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node insert(Node node, int id) {

        if (node == null) {
            return new Node(id);
        }

        if (id < node.val) {
            node.left = insert(node.left, id);

        } else if (id > node.val) {
            node.right = insert(node.right, id);
        }
        return node;
    }

    public static void inorder(Node node) {

        if (node == null) {
            return;
        }

        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public static void main(String[] args) {

        Node root = new Node(50);

        root.left = new Node(30);
        root.right = new Node(70);

        root.left.left = new Node(20);
        root.left.right = new Node(40);

        root.right.left = new Node(60);
        root.right.right = new Node(80);

        System.out.println("Before Insertion:");

        inorder(root);
        root = insert(root, 65);

        System.out.println("\n\nAfter Insertion:");

        inorder(root);
    }
}