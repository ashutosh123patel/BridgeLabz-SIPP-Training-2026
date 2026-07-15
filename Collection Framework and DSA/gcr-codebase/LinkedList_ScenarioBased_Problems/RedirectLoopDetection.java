public class RedirectLoopDetection {
    static class Node {
        int urlId;
        Node next;

        Node(int urlId) {
            this.urlId = urlId;
            this.next = null;
        }
    }

    public static boolean hasRedirectLoop(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {

                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = new Node(101);
        head.next = new Node(102);
        head.next.next = new Node(103);
        head.next.next.next = new Node(104);
        head.next.next.next.next = new Node(105);
        head.next.next.next.next.next = head.next;

        if (hasRedirectLoop(head)) {
            System.out.println("Cycle Detected");

        } else {
            System.out.println("No Cycle");
        }
    }
}