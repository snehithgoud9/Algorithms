import java.util.Scanner;

class InnerLinearSearch {

public void search(){
    try {

        int[] arr={12,13,14,56,58,89,63};
        int count=0;
        Scanner data= new Scanner(System.in);
        System.out.println("Enter the number you want to search ");
        int num=data.nextInt();
       System.out.println(num);
       for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            System.out.println("Element found at:"+i);
            count=1;
            break;
        }
        
       }
       if(count==0){
            System.out.println("Element not found");
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        // TODO: handle exception
        e.printStackTrace();
        
    }
}

    
}

public class LinearSearch {

    
    public static void main(String[] args) {


        InnerLinearSearch ils=new InnerLinearSearch();
        ils.search();
        
    }
}