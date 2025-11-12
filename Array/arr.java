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

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return key;
            }
            if (arr[mid] > key) {
                end = mid - 1;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int largestElement(int arr[]) {
        int maxElement = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
        }

        return maxElement;
    }

    public static void reverseArr(int arr[]) {
        int rArr[] = new int[arr.length];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            rArr[i] = arr[n - i - 1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(rArr[i] + " ");
        }

    }

    public static void printParis(int arr[]) {
        int n = arr.length;
        // outer loop index
        for (int i = 0; i < n - 1; i++) {
            // inner loop print all index's pairs
            for (int k = i; k < n - 1; k++) {
                System.out.print("(" + arr[i] + ", " + arr[k + 1] + ")");
            }
            System.out.println();
        }

        System.out.println("Total numbers of Paris : " + n * (n - 1) / 2 + ".");

    }

    public static void printSubarry(int arr[]) {
        int n = arr.length;
        // outer loop index
        for (int i = 0; i < n; i++) {
           
            for (int j = i; j < n; j++) {
                for(int k = i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
             System.out.println();
           
           
        }



    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5 };

        // int key = 3;
        // System.out.println(linearSearch(arr, key));
        // System.out.println(binarySearch(arr, key));
        // System.out.println("i came git and github ready.");
        // System.out.println(largestElement(arr));
        // reverseArr(arr);
        // printParis(arr);
        printSubarry(arr);

    }
}