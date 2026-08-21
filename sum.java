
import java.util.*;

public class sum {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int arr[]=new int[n];
        for(int  i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }

        long sum1=0;
        long sum2=0;
        int i=0;
        int j=n-1;
        long ans=0;
        while(i<=j){
            if(sum1<sum2){
                sum1+=arr[i++];
            }else{
                sum2+=arr[j--];
            }

            if(sum1==sum2){
                ans=sum1;
            }
        }
        System.out.println(ans);
    }
}
