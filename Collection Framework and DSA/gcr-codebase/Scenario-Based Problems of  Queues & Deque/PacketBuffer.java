public class PacketBuffer {

    int[] data;
    int front;
    int count;

    PacketBuffer(int capacity) {

        data = new int[capacity];
        front = 0;
        count = 0;
    }

    public boolean enqueue(int packetId) {

        if (count == data.length) {
            System.out.println("Buffer is Full");
            return false;
        }
        int rear = (front + count) % data.length;
        data[rear] = packetId;
        count++;
        return true;
    }

    public int dequeue() {

        if (count == 0) {
            System.out.println("Buffer is Empty");
            return -1;
        }

        int val = data[front];
        front = (front + 1) % data.length;
        count--;

        return val;
    }

    public void display() {

        if (count == 0) {
            System.out.println("Buffer is Empty");
            return;
        }

        System.out.print("Packet Buffer : ");

        for (int i = 0; i < count; i++) {
            System.out.print(data[(front + i) % data.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PacketBuffer pb = new PacketBuffer(5);

        pb.enqueue(101);
        pb.enqueue(102);
        pb.enqueue(103);
        pb.enqueue(104);

        pb.display();

        System.out.println("Processed Packet : " + pb.dequeue());

        pb.display();

        pb.enqueue(105);
        pb.enqueue(106);
        pb.display();
    }
}