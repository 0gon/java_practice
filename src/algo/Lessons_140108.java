package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons_140108 {
	/*
	"banana"	3
	"abracadabra"	6
	"aaabbaccccabba"	3
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "banana";
		int answer = 0;
		int sCount = 1;
		int dCount = 0;
		
		// 1. 첫 글자를 지정한다. (다음글자가 없는 경우 끝낸다)
		Queue<Character> queue = new LinkedList<>();
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
		
		// 2. 같은 글자가 나올때까지 카운트를 증가시킨다.
		
		// 3. 다른 글자가 나왔을 경우 카운트를 증가 시킨다.
		
		// 4. 둘의 숫자가 같아지는 경우, answer 값을 증가시킨다.
		
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
