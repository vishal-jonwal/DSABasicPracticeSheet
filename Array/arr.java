package Array;

public class arr {
    public static int linearSearch(int arr[], int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return key;
            }
        }

        return -1;

    }
    public static int binarySearch(int arr[], int key){
        int start = 0,  end = arr.length-1;
        
        while (start <= end) {
            int mid = (start+end)/2;

            if(arr[mid] == key){
                return key;
            }
            if(arr[mid] > key){
                end = mid-1;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
        }




        return -1;
    }

    
    
    public static void main(String[] args) {
       int arr[] = {2, 3, 5, 8, 8, 9, 9};

        int key = 3;
        System.out.println(linearSearch(arr, key));
        System.out.println(binarySearch(arr, key));
        // System.out.println("i came git and github ready.");
    }
}