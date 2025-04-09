 class InnerShellsort {
    void sort(int[] arr){
        for(int gap=arr.length/2; gap>=1;gap=gap/2){

            for(int j=gap;j<arr.length;j++){

                for(int i=j-gap;i>=0;i=i-gap){

                    if(arr[i+gap]>arr[i]){
                        break;
                    }
                    else{
                        int temp=arr[i];
                        arr[i]=arr[i+gap];
                        arr[i+gap]=temp;
                    }
                }
            }
        }

    }
    
}


public class Shellsort {
    public static void main(String[] args) {
        int[] a={12,6,4,8,7,2,111,788,425};
        InnerShellsort iss=new InnerShellsort();
        iss.sort(a);
        for (int ele : a) {
            System.out.print(ele+" ");
        }
        
    }
}
