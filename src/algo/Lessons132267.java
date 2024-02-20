package algo;

public class Lessons132267 {
	/*
	a	b	n	result
	2	1	20	19
	3	1	20	9
	*/
	// 10*b + 0
	// 5*b + 0
	// 2 + 1 
	// 1 + 1
	// 1 + 0 
	
	// 6 + 2 = 8
	// 2 + 2 = 4
	// 1 + 1 = 2
	
	//8(20 – 18 + 6(몫) = 8) -> 몫 + 나머지
	//4(8 – 6 + 2(몫) = 4)  -> 몫 + 나머지
	//2(4 – 3 + 1(몫) = 2) -> 몫 + 나머지
	//
	
	
	//9(6 + 2 + 1 = 9)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 1;
		int n = 20;
		int answer = 0;
		
		
		// 1. 전체개수(n)에서 a 로 나눈 나머지, a로 나눈 몫을 구한다.
		while(n >= a) {
			answer += (n / a) * b;
			n = (n / a) * b + n % a ;
		}
		System.out.println("dd"+answer);
		
		
		// 2. 몫*b의 합을 구한다.
		
		// 3. 나머지와 몫의 합이 a 보다 작으면 멈춘다.
		

	}
	public int solution(int a, int b, int n) {
        int answer = 0;
        return answer;
    }

}
