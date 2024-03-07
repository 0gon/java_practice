package algo;

public class Lessons42584 {
// [1, 2, 3, 2, 3]	
// [4, 3, 1, 1, 0]
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = {};
		
		// 1  =>0, 4
		//   2 3 2 3  -> 4
		// 2  =>1, 3
		//   3 2 3  -> 3
		// 3  =>2, 2
		//   <2> 3 -> 1
		// 2  =>3, 1
		//   3 -> 1
		// 3
		//   0
		
		
		// 1. prices값을 하나씩 입력 받는다.
		int n = prices.length;
		answer = new int[n];
		int count = 0;
		
		for(int i = 0 ; i < n; i++) {
			int target = prices[i];
			for(int j = 0 ; j < n -1- i ; j++ ) {
				if(prices[(j+1)] >= target) count++;
			}
			answer[i] = count;
			count = 0;
		}
		for(int a : answer) {
			System.out.println(a);
		}
		// 2. 이 후의 나오는 값들에서 자신보다 크거나 같은 값의 수를 구한다.
		
		

	}
}
