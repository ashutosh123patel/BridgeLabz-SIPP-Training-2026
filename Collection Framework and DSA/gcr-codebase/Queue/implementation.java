import java.util.ArrayDeque;
import java.util.Deque;

/**
 * implementation
 */

public class implementation {

    static class Node {
        String  val;
        Node prev, next;

        Node(String  val) {
            this.val = val;
        }
    }

    private Node head, tail;

    void addFirst(String x) {
        Node n = new Node(x);
        n.next = head;
        if (head != null)
            head.prev = n;
        head = n;
        if (tail == null)
            tail = n;
    }

    void addLast(String x) {
        Node n = new Node(x);
        n.prev = tail;
        if (tail != null)
            tail.next = n;
        tail = n;
        if (head == null)
            head = n;
    }



    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();
        // d.add("Ashutosh Patel");
        // d.add("Abhishek Patel");
        // d.add("Neha Gupta");
        d.addFirst("Ashutosh Patel");
        System.out.println(d);
        d.addLast("Neha Gupta");
        System.out.println(d);
        

    }
}