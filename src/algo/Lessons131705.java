package algo;

public class Lessons131705 {

	/* dfs?
	[-2, 3, 0, 2, -5]	2
	[-3, -2, -1, 0, 1, 2, 3]	5
	[-1, 1, -1, 1]	0
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {-2, 3, 0, 2, -5};
		int answer = 0;
		// 27
	
		for(int i = 0 ; i < number.length - 2 ; i ++) {
			for(int j = i+1 ; j < number.length - 1 ; j++) {
				for(int k = j+1 ; k < number.length  ; k++) { // 2 3 4 // 3
					if(number[i]+number[j]+number[k] == 0) {
						answer ++;
					}
				}
			}
		}
		System.out.println(answer);

	}
    public int solution(int[] number) {
        int answer = 0;
        return answer;
    }
}


