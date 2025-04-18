import java.util.*;
public class countarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        int count=0;
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==0&&a[j]==1) {
                    count++;     
                }
    
        }
            
        }
        System.out.println(count);
    }
}