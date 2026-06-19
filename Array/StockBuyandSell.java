package LAB.Array;
import java.util.*;

public class StockBuyandSell {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int n = scan.nextInt();
		
		int []  arr= new int [n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = scan.nextInt();
			
			
		}
		
		int minValue = Integer.MAX_VALUE;
		
		int maxProfit = 0 ;
		
		for(int i=0; i<n; i++) {
			
			if(arr[i] < minValue) {
				
				minValue = arr[i];
				
			}
			
			
			int profit = arr[i] - minValue;
			
			if(profit > maxProfit) {
				
				maxProfit = profit;
				
			}
			
			
		}
		
		System.out.print(maxProfit);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
