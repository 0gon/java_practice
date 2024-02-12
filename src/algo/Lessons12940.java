package algo;

public class Lessons12940 {
	static /*
			3	12	[3, 12]
			2	5	[1, 10]
			*/
	
	   int gcd(int n, int m) {
	        int r;
	        while(m > 0) {
	            r = n % m;
	            n = m;
	            m = r;
	        }
	        return n;
	    }
	   
	public static void main(String[] args) {
		int n = 3;
		int m = 12;
		int[] answer = {};
		
		answer = new int[2];
		
		
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        // 최대공약수 구하기
        answer[0] = gcd(n, m);
        
        // 최소공배수 구하기
        answer[1] = n * m / answer[0];
		
	}
 
    public int[] solution(int n, int m) {
        int[] answer = {};
        return answer;
    }
}
