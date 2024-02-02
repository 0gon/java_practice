package algo;

public class Lessons142086 {

	/*
	"banana"	[-1, -1, -1, 2, 2, 2]
	"foobar"	[-1, -1, 1, -1, -1, -1]
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "foobar";
		int[] answer = {};
		
		answer = new int[s.length()];
		
	
		answer[0]=-1;
		for(int i = 0; i < s.length(); i ++) {
			char target = s.charAt(i); // i=3  a
			for(int j = 0 ; j < i ; j++) { // 012 
				if(target == s.charAt(j)) {  // 1
					answer[i]=i-j;
				}
			}
		}
		for(int i = 0 ; i < answer.length; i++) {
			if(answer[i] == 0) answer[i] = -1;
		}
		
		
		for(int a : answer) {
			System.out.println(a);
		}
	}
	
	
	  public int[] solution(String s) {
	        int[] answer = {};
	        return answer;
	    }

}
