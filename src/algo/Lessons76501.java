package algo;

/*
[4,7,12]	[true,false,true]	9
[1,2,3]	[false,false,true]	0
 */
public class Lessons76501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] absolutes = {4, 7, 12};
		boolean[] signs = {true,false,true};
		int answer = 0;
		
		for(int i = 0 ; i < absolutes.length; i++) {
			if(signs[i]) {
				answer += absolutes[i];  
			}else {
				answer += -absolutes[i];
			}
		}
		
		System.out.println(answer);
		

	}

	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 123456789;
		return answer;
	}
}
