import java.util.*;
public class Buy&SellStock {

  public static int buyandSellStock(int prices[]){
    int buyprice = Integer.MAX_VALUE;
    int maxprofit = 0;
    for(int i=0; i<prices.length; i++){
      if(buyprice < prices[i]){  // profit
        int profit = prices[i] - buyprice; // todoy profit 
        maxprofit = Math.max(maxprofit, profit);
      }
      else {
        buyprice = prices[i];
      }
    }
  }
  public static void main(String[] args){
int prices[] = {7,1,5,3,6,4};
System.out.println("the maximum profit is : " + buyandSellStock(prices));
  }
}