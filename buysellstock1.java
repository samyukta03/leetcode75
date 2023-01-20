public class buysellstock1 {
    public int maxProfit(int[] prices) {
        //kadane algo
        int minsofar = 9999;
        int maxprofsofar=0;
        for(int i=0;i<prices.length;i++){
            minsofar = Math.min(minsofar, prices[i]);
            maxprofsofar = Math.max(maxprofsofar, prices[i]-minsofar);
        }
        return maxprofsofar;
    }
    public static void main(String[] args) {
        int[] prices = new int[] {4,5,4,32,8};
        buysellstock1 sol1 = new buysellstock1();
        int ans = sol1.maxProfit(prices);
        System.out.println(ans);
    }
}
