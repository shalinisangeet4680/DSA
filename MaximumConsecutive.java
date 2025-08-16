public class MaximumConsecutive {
  public static int maximumConsecutiveOnes(int[] prices) {
    int maxCount = 0;
    int count = 0;

    for (int i = 0; i < prices.length; i++) {
      if (prices[i] == 1) {
        count++;
      } else {
        count = 0;
      }

      maxCount = Math.max(count, maxCount);

    }
    return maxCount;
  }

  public static void main(String[] args) {
    int[] prices = { 1, 1, 0, 1, 1, 1 };

    int answer = maximumConsecutiveOnes(prices);
    System.out.println(answer);
  }
}
