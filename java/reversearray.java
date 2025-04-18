import java.util.Scanner;
import java.util.Arrays;
public class reversearray {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the element:");
        int n=sc.nextInt();
        int[] arr= new int[n];

        System.out.println(" enter " + n + " elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        System.out.println("original array:"+Arrays.toString(arr));//array to readable string
        //for multiple   Arrays.deeptoString(arr);
        
        System.out.println("reversed array:");
        //main 
         for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
         }
         
    }
}
