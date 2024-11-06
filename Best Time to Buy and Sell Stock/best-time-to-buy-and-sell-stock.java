class Solution {
    public int maxProfit(int[] prices) {
        int currentCoin = 0;    //denots day 0's purchase[1st index]
        int maximumProfit = 0;  //initialize with 0

        for(int i=1;i<prices.length;i++){ //check from 2nd days price;that's why loop starts from 1

            if(prices[currentCoin] < prices[i] ){ //check if current coin's value is lesser than next day's value
                int currentProfit = prices[i] - prices[currentCoin]; //calculate the profit
                maximumProfit = Math.max(maximumProfit, currentProfit); //compare prev. profit with new profit
            }
            else{
                currentCoin = i;    //slide the current coin's day[index] if current coin's value is greater than next day's value
            }
        }

        return maximumProfit;
    }
}
