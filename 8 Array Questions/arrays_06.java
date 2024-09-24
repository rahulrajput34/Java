// Question : buying and selling stocks -- find heghest profit
public class arrays_06 {
    public static int stockBuyOrSell(int prices[]){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if(buyingPrice < prices[i]){
                // to calculate todays profit 
                int profit = prices[i] - buyingPrice;
                // to calculate overall max profit
                maxProfit = Math.max(maxProfit, profit);
            } else{
                buyingPrice = prices[i];  // to make buying price less
            }
        }
        return maxProfit;
    }   
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Heighest profit is:" + stockBuyOrSell(prices));

    } 
}
