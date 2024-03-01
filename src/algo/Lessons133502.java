package algo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lessons133502 {
	/*
	[2, 1, 1, 2, 3, 1, 2, 3, 1]	2
	야채2, 빵1, 빵1, 야채2, 고기3, 빵1, 야채2, 고기3, 빵1
	[1, 3, 2, 1, 2, 1, 3, 1, 2]	0
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//123
		//2, 1, 1, 2, 3, 1, 2, 3, 1
		//2, 1, 1, 2, 3, 1
		//2, 1, -, -, -, -
		//2, 1, -, -, -, - 2, 3, 1
		//2, =, -, -, -, - =, =, =
		
		
		//2, 1, 1, 2, 3, 1, 2, 3, 1
		//2, -, 1, 2, 3, 1, 2, 3, 1
		//2, -, 1, -, -, -
		//2, -, =, -, -, -, 
		//2, -, =, -, -, -, 2 
		//2, -, =, -, -, -, =, =, =
		
		
		//2, 1, 1, 2, 3, 1, 2, 3, 1
		//2, -, 
		//2, -, 1 
		//2, -, 1, -
		//2, -, 1, -, -
		//2, -, 1, -, -, -
		//2, -, 1, -, -, -
		//2, -, =, -, -, -
		//2, -, =, -, -, -, =
		//2, -, =, -, -, -, =, =
		//2, -, =, -, -, -, =, =, =
		
		
		//2, -, 2, -, -, -
		//2, -, 2, -, -, -, 
		//2, -, 2, -, -, -, 2 
		//2, -, 2, -, -, -, =, =, =
		
		int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
		int answer = 0;
		
		// 1. 숫자열 하나씩 큐에 쌓는다.
		
		// 2. (1231) 순서대로 뽑는다.
		// 2-1 answer 값증가
		
		// 3. 마지막의 쌓인값을 확인한다
		
		// 3-1 마지막이 1인경우 큐에서 제거 
		
		// 3-2 마지막이 1이 아닌 경우 다시 돌아간다.
		
		
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i < ingredient.length; i++) {
			st.add(ingredient[i]);
			
			if(st.size() >= 4) {
				if(st.get(st.size()-4)==1 && st.get(st.size()-3)==2 && st.get(st.size()-2)==3 && st.get(st.size()-1)==1 ) {
					answer ++;
					st.pop();
					st.pop();
					st.pop();
					st.pop();
				}
			}
		}
		System.out.println(answer);
		//2, 1, 1, 2, 3, 1, 2, 3, 1
		//2, -, 
		//2, -, 1 
		//2, -, 1, -
		//2, -, 1, -, -
		//2, -, 1, -, -, -
		//2, -, 1, -, -, -
		//2, -, =, -, -, -
		//2, -, =, -, -, -, =
		//2, -, =, -, -, -, =, =
		//2, -, =, -, -, -, =, =, =
		
		
		
	}
	//야채, 빵, 빵, 야채, 고기, 빵, 야채, 고기, 빵
	//빵1  야채2 고기3 
	// --, --, 빵, 야채, --, 빵, 야채, 고기, 빵
	// --, --, --, --, --, 빵, 야채, --, 빵
    public int solution(int[] ingredient) {
        int answer = 0;
        return answer;
    }
}
