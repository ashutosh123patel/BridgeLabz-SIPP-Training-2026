public class HeapSortReadings {

    public static void heapSort(int[] arr) {

        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {

            siftDownMax(arr, i, n);
        }

        for (int end = n - 1; end > 0; end--) {
            int temp = arr[0];
            arr[0] = arr[end];
            arr[end] = temp;

            siftDownMax(arr, 0, end);
        }
    }

    public static void siftDownMax(int[] arr, int i, int size) {

        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < size && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < size && arr[right] > arr[largest]) {
            largest = right;
        }

        if (largest != i) {

            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            siftDownMax(arr, largest, size);
        }
    }

    public static void display(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] readings = {35, 10, 45, 20, 50, 15, 30};

        System.out.println("Before Heap Sort:");

        display(readings);

        heapSort(readings);

        System.out.println("\nAfter Heap Sort:");

        display(readings);
    }
}