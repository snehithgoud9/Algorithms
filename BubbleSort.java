 class InnerBubbleSort {
    public void bubSort(int[] a){
        try {
            for(int i=0;i<a.length-1;i++){
                int flag=0;
                for(int j=0;j<a.length-1-i;j++){ // or for(int j=0;j<n-1-i;j++)

                    if (a[j]>a[j+1]) {
                         int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        flag=1;// if swap happens
                        
                    }
                }
                if(flag==0)
                break;

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






public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={56,54,87,42,55};
        InnerBubbleSort ibs=new InnerBubbleSort();
        ibs.bubSort(arr);
    }
}
