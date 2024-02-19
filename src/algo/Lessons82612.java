package algo;

public class Lessons82612 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 3;
		int money = 20;
		int count = 4;
		
		long answer = 0;
		long sum = 0;
		for(int i = 1; i <= count ; i ++) {
			sum += price * i;
		}
		answer = sum - money;
		answer = answer < 0 ? 0 : answer;  
		System.out.println(answer);
		
		
	}
    public long solution(int price, int money, int count) {
        long answer = -1;

        return answer;
    }
}
