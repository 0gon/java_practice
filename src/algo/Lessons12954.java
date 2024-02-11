package algo;

public class Lessons12954 {
			/*
			 * 
			2	5	[2,4,6,8,10]
			4	3	[4,8,12]
			-4	2	[-4, -8]
			
			*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x= 2 ;
		int y =5;
		long[] answer = {};
		
		answer = new long[y];
		answer[0] = x;
		for(int i = 1; i < y ; i++) {
			answer[i] = answer[i-1] + x;  
		}
		
		for(long a : answer) {
			System.out.println(a);
		}
		

	}

    public long[] solution(int x, int n) {
        long[] answer = {};
        return answer;
    }
}
