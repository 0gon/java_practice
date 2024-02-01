package algo;

public class Lessons161989 {

	/*
	 * 
	 *
	 * 
	 * n m section answer 8 4 [2, 3, 6] 2 5 4 [1, 3] 1 4 1 [1, 2, 3, 4] 4
	 * 
	 * 
	 * 1 2 3 4 5 6 7 8 2 3 6
	 * 
	 * 
	 * 1 2 3 4 5 1 3
	 * 
	 *
n   m    sect       answer
8	4	[2, 3, 6]	2
5	4	[1, 3]	1
4	1	[1, 2, 3, 4]	4
	 * 
	 * 
	 * 
1 2 3 4 5 6 7 8
  2 3     6
  <----->
    <----->
  
	 */
	public static void main(String[] args) {
		int[] section = { 1, 2, 3, 4 };
		int m = 1;

		int answer = 1;
		/*
        int roller = section[0];
        answer = 1;
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
            	answer++;
                roller = section[i];
            }
        }*/
		int startPoint = section[0];
		int endPoint = section[section.length-1];
		
		while(startPoint + m - 1 < endPoint) {
			answer++;
			startPoint++;
		}
		
		System.out.println(answer);
		
	}

	public int solution(int n, int m, int[] section) {
		int answer = 0;
		return answer;
	}
}
