import java.util.LinkedList;
import java.util.Queue;

/**
 * TreeCreation
 */
class Node {
    char data;
    Node left;
    Node right;

    Node(char data) {
        this.data = data;
    }
}

public class TreeCreation {
    public static void preOrder(Node root) {

        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void postOrder(Node root) {

        if (root == null)
            return;
        // System.out.print(root.data + " ");
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    public static void inOrder(Node root) {

        if (root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }
    public static void levelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node ele = q.poll();
            System.out.println(ele.data);
            if(ele.left!=null) q.offer(ele.left);
            if(ele.right!=null) q.offer(ele.right);

        }
    }

    public static void main(String[] args) {

        Node t1 = new Node('A');
        Node t2 = new Node('B');
        Node t3 = new Node('C');
        Node t4 = new Node('D');
        Node t5 = new Node('E');
        Node t6 = new Node('F');
        Node t7 = new Node('G');
        Node t8 = new Node('H');
        Node t9 = new Node('I');
        Node t10 = new Node('J');

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;

        t5.left = t8;
        t5.right = t9;

        t7.left = t10;

        preOrder(t1);
        System.out.println();
        postOrder(t1);
        System.out.println();
        inOrder(t1);

        System.out.println();
        levelOrder(t1);

    }

}