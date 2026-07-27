class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int left =0;
        int right =1;
        while(right<prices.length){
            if(prices[right]>prices[left]){
                System.out.println("left: "+ left +" right: "+right);
                int profit = prices[right]-prices[left];
                maxProfit = Math.max(profit,maxProfit);
            }else{
                left=right;
            }
            right++;
            
        }
        return maxProfit;
    }
}
