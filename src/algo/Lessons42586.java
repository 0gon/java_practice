package algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Lessons42586 {
	/*
[93, 30, 55]	[1, 30, 5]	[2, 1]
[95, 90, 99, 99, 80, 99]	[1, 1, 1, 1, 1, 1]	[1, 3, 2]

	[55, 6, 65], [5, 10, 7]
	
	9 10 5
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] progresses = {55, 6, 65};
		int[] speeds = {5, 10, 7};
		int[] answer = {};
		
		List<Integer> ar = new ArrayList<Integer>();
		
		
		// 93 30 55   1 30 5
		// 7 3 9
		// =>2 1
		
		
		// 95, 90, 99, 99, 80, 99
		// 5   10   1   1  20   1
		// => 1 3 2
		
		
		Queue<Integer> q = new LinkedList<Integer>();
		// 1. pro와 speeds를 이용하여 완료되는 일 수를 구한다.
		// (100 - pro)%speeds > 0 이면 몫+1 아니면 몫
		for(int i =0; i < progresses.length; i++) {
			progresses[i] = (100 - progresses[i]) % speeds[i] > 0 ? (100 - progresses[i]) / speeds[i] + 1 : (100 - progresses[i]) / speeds[i];
			q.offer(progresses[i]);
		}
		
		int target = q.poll();
		
		int deployValue = 1;
		
		while(!q.isEmpty()) {
			if(target >= q.peek()) {
				deployValue++;
				q.poll();
			}else{
				ar.add(deployValue);
				deployValue = 1;
				target = q.poll();
			};
		}
		ar.add(deployValue);
		
		answer = ar.stream()
                .mapToInt(i -> i)
                .toArray();
		
		for(int a : answer) {
			System.out.println(a);
		}
		// 2. 큐에 데이터를 넣는다.
		// 3. 데이터를 꺼낸다
		// 4. 다음 데이터를 확인한다.
		// 4-1 다음 데이터가 같거나 작은경우 
		//       배포값을 증가시킨다.
		//       데이터값을 꺼낸다. 4로 돌아간다.
		// 4-2 다음 데이터가 큰 경우 
		//        배포값을 쌓는다. 
		//        타겟을 바꾼다.
	
	}

}
/*
 int[] answer = {};
		
		Queue<Integer> qu = new LinkedList<>();
		ArrayList<Integer> ar = new ArrayList<>();
		for(int i = 0; i < progresses.length; i++) {
			double workday = Math.ceil((100 - progresses[i])/(double)speeds[i]);
			qu.offer((int)workday);
		}
		
		int count = 1;
		while(!qu.isEmpty()) {
			int target = qu.poll();
			if(qu.peek()!=null && target>=qu.peek()) {
				count+=1;
			}else if(qu.peek()!=null && target<qu.peek()){
				ar.add(count);
				count = 1;
			}else if(qu.peek()==null) {
				ar.add(count);
			}
		}
		answer = ar.stream().mapToInt(Integer::intValue).toArray();
		
		*/

