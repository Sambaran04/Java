public class BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Maximum Profit is: "+maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int maxPro=0;
        int minPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i]-minPrice);
        }
        return maxPro;
    }
}
