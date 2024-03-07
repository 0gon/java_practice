package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lessons42587_2 {
	/*
	[93, 30, 55]             	[1, 30, 5]	        [2, 1]
	[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]
	
	7  3 9   => 2 , 1
	5 10 1 1 20 1  => 1, 3 , 2
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses = {55, 6, 65};
		int[] speeds = {5, 10, 7};
		int[] answer = {};
		
		
		/*
		1. 배포 가능일을 구합니다.
		2. 작업을 진행하며 배포 가능일이 첫번째 작업일보다 빠른 작업들은 함께 배포합니다
		3. 첫 번째 작업의 배포 가능일보다 늦은 작업이 나오면 2단계와 유사하게 해당 작업의 배포일을 기준으로 뒤의 작업들을 배포합니다. 이를 모든 작업이 완료될 때까지 반복합니다.
		*/
		Queue<Integer> q = new LinkedList<Integer>();
		ArrayList<Integer> ar = new ArrayList<Integer>(); 
		// 1. 배포 가능일을 구하기.
		for(int i =0; i < progresses.length; i++) {
			progresses[i] = (100 - progresses[i]) % speeds[i] > 0 ? (100 - progresses[i]) / speeds[i] + 1 : (100 - progresses[i]) / speeds[i];
			q.offer(progresses[i]);
		}
		
		// 2. 기준값 확인
		int target = q.poll();
		int deploy = 1;
		if(q.isEmpty()) ar.add(deploy);
		
		while(!q.isEmpty()) {
			if(q.peek() > target) {
				ar.add(deploy);
				deploy = 1;
				target = q.poll();
			}else {
				deploy++;
				q.poll();
			}
			if(q.isEmpty()) ar.add(deploy);
		}
		
		// 2-1. 다음값이 기준값보다 큰 경우
		//   배포개수 리턴
		//   꺼낸값으로 기준값 변경
		// 2-2. 다음값이 기준값보다 같거나 작은 경우
		//   배포개수 증가
		//   꺼내기
		
		// 3. 큐에 아무것도 존재하지 않을때까지 반복
		
	}

}

