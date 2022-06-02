import java.util.*;
public class Ropes {
    public static long findMinSingleRope(int[]arr,int n){
        Queue<Long> queue = new PriorityQueue<>();
        long ans = 0;
        for(int i = 0 ; i < n ; ++i){
            queue.add((long) arr[i]);
        }
        while (queue.size() != 1){
            long sum = queue.poll() + queue.poll();
            System.out.println(sum);
            ans += sum;
            queue.add(sum);
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; ++i){
            arr[i] = sc.nextInt();
        }
        System.out.println(Ropes.findMinSingleRope(arr,n));
    }
}
