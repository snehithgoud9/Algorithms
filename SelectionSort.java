 class InnerSelectionSort {

    public void selSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            if (min!=i) {
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
                
            }
        }
        for (int ele : a) {
            System.out.println(ele);
            
        }

    }
    
}

public class SelectionSort {
    public static void main(String[] args){
        int[]arr={14,15,19,77,22,55,66,44,4,5,9,3,7};
        InnerSelectionSort ins=new InnerSelectionSort();
       ins.selSort(arr);
       
       
       }

    }
    

