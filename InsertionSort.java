class InnerInsertionSort {
    public void insSort(int[] a){

        try {

            for(int i=1;i<a.length;i++){ //outer loop for unsorted sublist
                int temp=a[i];
                int j=i-1;
                while(j>=0&&a[j]>temp){  //inner loop for sorted sublist

                    a[j+1]=a[j];
                    j--;                
                    
                }
                a[j+1]=temp;
            }
            for(int k=0;k<a.length;k++){
                System.out.println(a[k]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            // TODO: handle exception

            e.printStackTrace();
        }
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={12,15,48,74,66,55,99,88};
    InnerInsertionSort ins=new InnerInsertionSort();
    ins.insSort(arr);
    }
}
