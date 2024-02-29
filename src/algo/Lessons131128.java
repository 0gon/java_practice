package algo;

import java.util.Arrays;

public class Lessons131128 {
/*
	"100"	"2345"	"-1"
	"100"	"203045"	"0"
	"100"	"123450"	"10"
	"12321"	"42531"	"321"
	"5525"	"1255"	"552"
*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String X = "5525";
		String Y = "1255";
		
		String answer = "";
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
				
				
		// 0. 짝궁이 0인 경우를 위해 Y의 크기값을 구해놓는다.
		int Ysize = Y.length();
		// 1. X의 크기만큼 반복문을 수행한다.
		for(int i = 0; i < X.length(); i++) {
			// 2. X의 요소와 Y의 요소를 비교한다
			// 2-1. X의 요소와 Y의 요소가 같은 경우
			if(Y.contains(String.valueOf(X.charAt(i)))) {
				//      -> 같은 값을 리스트에 저장한다.
				sb.append(X.charAt(i));
				//		-> Y에서 X의 요소를 제거한다
				Y = Y.replaceFirst(String.valueOf(X.charAt(i)), "");
			}
		}
		System.out.println("Y.length(): "+Y.length());
		System.out.println("Ysize: "+Ysize);
		// 3. Y의 크기값과 반복문 수행 이후 크기값이 같은 경우 -1을 리컨한다.
		if(Y.length() == Ysize) answer = "-1";
		
		// 4. 저장된 리스트 값으로 최대값을 만들어준다.
		char[] a = sb.toString().toCharArray();
		Arrays.sort(a);
		
		for(int i = 0 ; i < a.length ; i++) {
			sb2.append(a[i]);
		}
		answer = sb2.reverse().toString();
		if(answer.charAt(0) == 0 && answer.length() > 1) answer = "0";
		System.out.println("Y.length(): "+Y.length());
		System.out.println("Ysize(): "+Ysize);
		System.out.println(answer);
		
	}
	
    
    public String solution(String X, String Y) {
        String answer = "";
        return answer;
    }
}
