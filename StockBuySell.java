public class StockBuySell {
  public static int maxProfit(int[] nums) {
    int maxProfit = 0;
    int minPrice = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      minPrice = Math.min(minPrice, nums[i]);
      maxProfit = Math.max(maxProfit, nums[i] - minPrice);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    int[] nums = { 7, 1, 5, 3, 6, 4 };

    int answer = maxProfit(nums);
    System.out.println(answer);
  }

}
