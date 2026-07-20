public class CategoryTreeHeight {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int height(Node node) {

        if (node == null) {
            return -1;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public static boolean isTooDeep(Node root, int threshold) {
        return height(root) > threshold;
    }

    public static void main(String[] args) {

        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.left.left.left = new Node(6);

        int treeHeight = height(root);

        int threshold = 2;

        System.out.println("Tree Height : " + treeHeight);

        if (isTooDeep(root, threshold)) {
            System.out.println("Category Tree is Too Deep");
        } else {
            System.out.println("Category Tree is Within Safe Limit");
        }
    }
}