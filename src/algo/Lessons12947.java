package algo;

public class Lessons12947 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		boolean answer = true;
		
		String sx = String.valueOf(x);
		int sum = 0;
		for(int i = 0 ; i < sx.length(); i++) {
			sum += Character.getNumericValue(sx.charAt(i));
		}
		
	
		answer = x % sum ==0 ? true : false;
		System.out.println(answer);
		
		
		
	}

	
    public boolean solution(int x) {
        boolean answer = true;
        return answer;
    }
}
