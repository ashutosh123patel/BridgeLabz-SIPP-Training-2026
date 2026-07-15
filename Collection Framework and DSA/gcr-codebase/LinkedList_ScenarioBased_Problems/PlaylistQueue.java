/**
 * AddingTrack
 * 
 */
public class PlaylistQueue {

    static class Node {

        int trackId;
        Node next;

        Node(int trackId) {
            this.trackId = trackId;
            this.next = null;
        }
    }

    public static void insertAfter(Node current, int trackId) {

        Node newNode = new Node(trackId);

        newNode.next = current.next;

        current.next = newNode;
    }

    public static void display(Node head) {

        Node temp = head;

        while (temp != null) {

            System.out.print(temp.trackId + " -> ");

            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(104);

        System.out.println("Before Insertion:");
        display(head);

        insertAfter(head.next, 103);

        System.out.println("After Insertion:");
        display(head);
    }
}