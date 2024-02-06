package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons159994 {
	// 큐 간단한 예제
	public static void main(String[] args) {
		String[] cards1 = {"i", "drink", "water"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		String answer = "";
		
		Queue<String> queue1 = new LinkedList<>();
		Queue<String> queue2 = new LinkedList<>();
		for(String a : cards1) queue1.add(a);
		for(String a : cards2) queue2.add(a);
		int i = 0;
	
		for( i = 0 ; i < goal.length; i ++ ) {
			String target = goal[i];
			if(!target.equals(queue1.peek()) && !target.equals(queue2.peek())) {
				answer = "No";
				break;
			}
			else if(target.equals(queue1.peek())) {
				queue1.poll();
			}
			else if(target.equals(queue2.peek())) {
				queue2.poll();
			}
		}
		if(i == goal.length) answer = "Yes";
		
		
		System.out.println(answer);
		
	}
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        return answer;
    }
}
