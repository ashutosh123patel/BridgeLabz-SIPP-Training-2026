/**
 * FindTheRotationpoint
 */
public class FindTheRotationpoint {
    public static int findMin(int[] arr) {
       int l =0, h = arr.length-1; 

       while(l<h){
        if(arr[l]<arr[h]) return arr[l];

        int mid = l+(h-l)/2;
        if(arr[mid]> arr[h] ){
            l=mid+1;
        }
        else  h=mid;
      }
      return arr[l];
    }

    public static void main(String[] args) {
        int [] arr ={4,5,6,1,2,3};
         /*int val =arr[0];
        for(int i=0;i<arr.length;i++){
            val = Math.min(val, arr[i]);
           
        }

        System.out.println(val);*/
        System.out.println(findMin(arr));


    }
}