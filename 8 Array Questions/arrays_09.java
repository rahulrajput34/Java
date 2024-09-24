// Question 3: we compare buy price and sell price daily
// for that we first we are looking for least buy price..
// that is why we created buyprice variable
// maxprice we can also start with zero if we want
// we get each day
// than i compare with each day so that i found the largest one
// if buying price is more than price of today than we update the buying price to the todays price.
public class arrays_09 {
    public static int buyOrSellStock(int prices[]) {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) { // price[i] == todays price == selling price
                // todays profit
                int profit = prices[i] - buyprice; // get each days profits
                // Maxprofit
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyprice = prices[i];
            }
        }
        return maxProfit;

    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int largestProfit = buyOrSellStock(prices);
        System.out.println(largestProfit);

    }
}
