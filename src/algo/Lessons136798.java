package algo;

/*

5	3	2	10
10	3	2	21

*/


public class Lessons136798 {
	
	public static void main(String[] args) {
		int number = 10; 
		int limit = 3;
		int power = 2;
		
		int answer = 0;
		
		int[] lst = new int[number];
		// [1, 2, 2, 3, 2, 4, 2, 4, 3, 4]
		// 1 2 2 3 2 2 2 2 3 2
		
		// 1. number 까지의 약수를 담는다
		for(int i = 1 ; i <= number ; i++) {
			int count = 0;
			for(int j = 1; j * j <= i; j++) {
				if (j * j == i) count++;
				else if (i % j == 0) count += 2;
			}
			lst[i-1] = count > 3 ? power : count;
			answer += lst[i-1];
		}
		System.out.println(answer);
		// 2. limit 보다 크면 power 값으로 변환
		
		
		
		
		//System.out.println(answer);
				
	}
}
