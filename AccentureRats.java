import java.util.Scanner;

public class AccentureRats {
    public static int solve(int r,int unit, int arr[],int n){
        if(arr==null)
        return -1;
        int res= r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            count++;
            if(sum>=res)
            break;
        }
        if(sum<res)
        return 0;
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int r=scn.nextInt();
        int unit = scn.nextInt();
        int n= scn.nextInt();
        int arr[]= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
            System.out.println(solve(r,unit,arr,n));
        }
    }
