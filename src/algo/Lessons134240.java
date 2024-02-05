package algo;

public class Lessons134240 {
	
	/*
	[1, 3, 4, 6]	"1223330333221"
	[1, 7, 1, 2]	"111 3 0 311 1"
	                 "1 1 0 11"
	*/
	
	//두 선수는 1번 음식 1개, 2번 음식 2개, 3번 음식 3개씩을 먹게 되므로 음식의 배치는
	//"1223330333221"이 됩니다. 따라서 1번 음식 1개는 대회에 사용하지 못합니다.
	public static void main(String[] args) {
		//  1 -> 1, 2 -> 2, 3 -> 3
		// 1 22 333 0 333 22 1 
		// 1 1 1 3 0 3 1 1 1
		int[] food = {1, 3, 4, 6};
		String answer = "";
		
		StringBuilder sb = new StringBuilder(answer);

		for(int i = 0; i < food.length; i++) {
			int target = food[i];
			if(target > 1) {
				int value = target/2; // 1번, 3번
				for(int j = 0 ; j < value ; j++) {
					sb.append(i);
				}
			}
		}
		StringBuilder tmp = new StringBuilder(sb);
		sb.reverse();
		tmp.append("0").append(sb);
		answer = tmp.toString();
		
		System.out.println(answer);
		
	}
	
	
    public String solution(int[] food) {
        String answer = "";
        return answer;
    }
}
