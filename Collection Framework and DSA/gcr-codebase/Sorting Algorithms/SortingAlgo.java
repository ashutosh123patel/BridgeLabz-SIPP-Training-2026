public class SortingAlgo {

    static class BubbleSort {

        public static void sort(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int t = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = t;
                    }
                }
            }
        }
    }

    static class SelectionSort {

        public static void sort(int[] arr) {

            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }
                int t = arr[i];
                arr[i] = arr[min];
                arr[min] = t;
            }
        }
    }

    static class InsertionSort {

        public static void sort(int[] arr) {
          for (int i = 1; i < arr.length; i++) {

            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {

                int t = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = t;

                j--;
            }
         }
            
        }
    }

    public static void main(String[] args) {

        int[] a = {5, 3, 8, 1, 2};
        int[] b = {5, 3, 8, 1, 2};
        int[] c = {5, 3, 8, 1, 2};

        BubbleSort.sort(a);
        SelectionSort.sort(b);
        InsertionSort.sort(c);

        System.out.println("Bubble Sort");
        for (int x : a) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Selection Sort");
        for (int x : b) {
            System.out.print(x + " ");
        }

        System.out.println();

        System.out.println("Insertion Sort");
        for (int x : c) {
            System.out.print(x + " ");
        }
    }
} 