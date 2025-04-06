class InnerQuicksort {
    public int partition(int[] a, int low, int high) {
        try {
            int start = low;
            int end = high;
            int pivot = a[low];
            while (start < end) {
                while (start <= high && a[start] <= pivot) {
                    start++;
                }
                while (a[end] > pivot) {
                    end--;
                }
                if (start < end) {
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                }
            }
            
            int temp1 = a[low];
            a[low] = a[end];
            a[end] = temp1; 
            return end;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            
        }
    }

    void sort(int[] a, int low, int high) {
        if (low < high) {
            int spot = partition(a, low, high);
            sort(a, low, spot - 1);
            sort(a, spot + 1, high);
        }
    }
}

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {12, 15, 8, 3, 59, 7, 5, 11};
        InnerQuicksort is = new InnerQuicksort();
        is.sort(arr, 0, arr.length - 1);
        for (int ele : arr) {
            System.out.print(ele + " "); 
        }
    }
}
