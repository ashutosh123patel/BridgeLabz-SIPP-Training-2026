public class FlightTicketPrices {

    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] prices = {4500,2200,3800,1800,5200};
        quickSort(prices,0,prices.length-1);

        for(int x : prices){

            System.out.print(x + " ");
        }
    }
}