import java.util.*;
public class fine {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int f=sc.nextInt();
        for(int i=0;i<n;i++){
        if(a[i]%2==0){
            for(i=0;i<n;i++)
            {
                if(a[i]%2!=0)
                {
                    f=f+200;
                }
            }
        }else{
            if(a[i]%2!=0)
            {
                for(i=0;i<n;i++)
                {
                    if(a[i]%2==0)
                    {
                        f=f+200;
                    }
                }  
            }
        }
    
    }
    for(int i=0;i<n;i++){
        System.out.println(f);
    }
    }
}