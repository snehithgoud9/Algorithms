import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedSet;

class InnerBinarySearch {
public void binSearch(){
    try {

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number to search");
int data=sc.nextInt();
          
  int[] arr={11,12,13,14,15,16,17,18,19,20};
  int left=0; int right=arr.length-1;

        while(left<right)
        {
        int mid=left+right/2;
        if(arr[mid]==data){
            System.out.println("Element "+" "+arr[mid]+" "+"found at position"+" "+mid);
            break;
        }
        else if (data>arr[mid]) {
            left=mid+1;
            
        }
        else 
            right=mid-1;
        }
        if(left>right)
        System.out.println("Element is not present");
        





    } catch (Exception e) {
        // TODO: handle exception
    }
}
    
}





public class BinarySearch {
    public static void main(String[] args) {

        InnerBinarySearch ib=new InnerBinarySearch();
        ib.binSearch();
        
    }
    
}
