package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons159994 {
	// 큐 간단한 예제
	/*
	 * 
	 *       // 큐의 상태 출력
        System.out.println("큐의 상태: " + queue); // 출력: [5, 3, 8, 1, 6]

        // 요소 제거 (dequeue)
        int removedElement = queue.poll();
        System.out.println("제거된 요소: " + removedElement); // 출력: 5

        // 큐의 상태 출력
        System.out.println("큐의 상태: " + queue); // 출력: [3, 8, 1, 6]

        // 큐의 첫 번째 요소 확인 (peek)
        int firstElement = queue.peek();
        System.out.println("첫 번째 요소: " + firstElement); // 출력: 3

        // 큐의 크기 확인
        int size = queue.size();
        System.out.println("큐의 크기: " + size); // 출력: 4
	 * 
	 * 
	 */
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
