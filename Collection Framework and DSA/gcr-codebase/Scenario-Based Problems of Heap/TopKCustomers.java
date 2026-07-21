import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKCustomers {

    public static List<Integer> topKLargest(int[] transactions, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int amount : transactions) {

            if (minHeap.size() < k) {
                minHeap.offer(amount);

            } else if (amount > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(amount);
            }
        }
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {

        int[] transactions = {5000, 1200, 8000, 3000, 9500, 7000, 2000};
        int k = 3;
        List<Integer> topCustomers = topKLargest(transactions, k);
        System.out.println("Top " + k + " Highest Spending Customers:");
        for (int amount : topCustomers) {

            System.out.print(amount + " ");
        }
    }
}