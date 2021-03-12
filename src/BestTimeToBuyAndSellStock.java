public class BestTimeToBuyAndSellStock {

    public static int maxProfit(int[] prices) {

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            int current = prices[i];

            if (maxProfit < current - minPrice) {
                maxProfit = current - minPrice;
            }

            if (minPrice > current) {
                minPrice = current;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};

        System.out.println(BestTimeToBuyAndSellStock.maxProfit(prices));
    }
}
