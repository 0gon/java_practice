package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons_140108 {
	/*
	"banana"	3
	"abracadabra"	6
	"aaabbacc cc ab ba"	3
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "banana";
		Queue<Character> queue = new LinkedList<>();
		for(char a : s.toCharArray()) queue.offer(a);
		int answer = 1;
		int sCount = 1;
		int dCount = 0;
		char firstChar = queue.poll();
		// 1-2 다음 글자가 없을 경우 종료
		
		while(!queue.isEmpty()) {
			
			if(queue.poll() == firstChar) {
				sCount++;
			}else{
				dCount++;
			};
			
			if(sCount == dCount) {
				if(queue.isEmpty()) break;
				firstChar = queue.poll();
				answer++;
				sCount = 1;
				dCount = 0;
			}
		}
		System.out.println(answer);
		
		// 3. 다음 글자를 꺼낸다.
		// 3-1 첫글자와 같은 경우
		//		같은 글자수값을 1 증가 시킨다.
		// 3-2 첫글자와 다른 경우
		//		다른 글자수 값을 1 증가시킨다.
		
		
		// 4. 같은 글자수 값과 다른 글자수 값을 비교한다.
		// 4-1 두 값이 같은 경우 answer값 증가
		// 4-1-2 첫글자에 꺼낸값으로 초기화한다
		// 4-1-3 같은 글자수값과 다른 글자수 값도 초기화한다.
		
		// 4-2 두값이 다른 경우 3으로 돌아간다.
		
		
		
	
		// aaabbaccccabba
		// aaa bbaccccaba
		//  3
		// aaa bb accccaba
		//      2
		// aaa bb accccaba
		//        4       
		// aaa bb acc ccaba
		//          4 
		
		// abracadabra
		// ab
		// ra
		// ca
		// da
		// br
		// a
		

	}
    public int solution(String s) {
        int answer = 0;
        return answer;
    }
}

/*
for(char a : s.toCharArray()) queue.offer(a);
char firstChar = queue.poll();

while(!queue.isEmpty()) {
	if(queue.poll() == firstChar) {
		sCount++;
	}else {
		dCount++;
	}
	if(sCount == dCount) {
		answer++;
		if(!queue.isEmpty()) {
			firstChar = queue.poll();
			if(queue.isEmpty()) answer++;
			sCount = 1;
			dCount = 0;
		}
	}else {
		queue.poll();
	}
}
System.out.println(answer);
*/