public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<weights.length; i++){
            max = Math.max(max, weights[i]);
            sum+= weights[i];
        }
        int low=max;
        int high = sum;
        while(low<high){
            int mid = low+(high-low)/2;
            if(calculate(weights, mid)<=days){
                high=mid;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public int calculate(int[] weights, int cap){
        int sum=0;
        int count=1;
        for(int i=0; i<weights.length; i++){
            if(sum+weights[i]>cap){
                count++;
                sum = weights[i];
            }else{
                sum+=weights[i];
            }
        }
        return count;
    }
}
