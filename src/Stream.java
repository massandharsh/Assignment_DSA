import java.util.Scanner;

public class Stream {
    public static final int MAXI = 10000006;
    public static int indexOf(int[]arr,int find){
        int upper_bound = -1;
        int lower_bound = -1;
        for(int i = 1 ; i < MAXI ; i = i * 2){
            if(arr[i] > find){
                   upper_bound = i;
                   lower_bound = i/2;
                   break;
            }
        }
        int low = lower_bound;
        int high = upper_bound;
        int ans = -1;
        while(low <= high){
            int mid = (low + high) >> 1;
            if(arr[mid] == find) return mid;
            if(arr[mid] < find) low = mid + 1;
            else high = mid - 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[MAXI]; //very big array
        for(int i = 0; i < MAXI ; ++i){
            arr[i] = i + 2;
        }
        int find = sc.nextInt();
        System.out.println(indexOf(arr,find));

    }
}
