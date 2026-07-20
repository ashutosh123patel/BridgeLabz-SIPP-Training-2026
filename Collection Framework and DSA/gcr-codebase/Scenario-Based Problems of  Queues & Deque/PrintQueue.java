import java.util.ArrayDeque;
import java.util.Deque;

public class PrintQueue {

    Deque<Integer> printQueue = new ArrayDeque<>();
    public void submitJob(int jobId) {

        printQueue.addLast(jobId);
        System.out.println("Normal Job Added : " + jobId);
    }

    public void submitUrgentJob(int jobId) {
        printQueue.addFirst(jobId);
        System.out.println("Urgent Job Added : " + jobId);
    }

    public int printNextJob() {

        if (printQueue.isEmpty()) {
            System.out.println("No Jobs Available");
            return -1;
        }

        return printQueue.removeFirst();
    }

    public void display() {

        if (printQueue.isEmpty()) {
            System.out.println("Print Queue is Empty");
            return;
        }

        System.out.println("Current Print Queue : " + printQueue);
    }

    public static void main(String[] args) {

        PrintQueue pq = new PrintQueue();

        pq.submitJob(101);
        pq.submitJob(102);
        pq.submitJob(103);

        pq.display();

        pq.submitUrgentJob(999);

        pq.display();

        System.out.println("Printing Job : " + pq.printNextJob());

        pq.display();
    }
}