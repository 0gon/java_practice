package algo;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons81301 {
	
	/*
	"one4seveneight"	1478
	"23four5six7"	    234567
	"2three45sixseven"	234567
	"123"	            123
	
0	z ero

1	o ne

2	t wo
3	t hree

4	f our
5	f ive

6	s ix
7	s even

8	e ight

9	nine
	
	
	*/
	
	public static void main(String[] args) {
		String s = "23four5six7";
		StringBuilder sb = new StringBuilder();
		
		Queue<String> que = new LinkedList<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			que.add(Character.toString(s.charAt(i)));
		}
		while(!que.isEmpty()) {
			if(que.peek().equals("1") || que.peek().equals("2") || que.peek().equals("3")
			|| que.peek().equals("4") || que.peek().equals("5") || que.peek().equals("6")	
			|| que.peek().equals("7") || que.peek().equals("8") || que.peek().equals("9")
			|| que.peek().equals("0") ) {
				sb.append(que.peek());
				que.poll();
			}else {
				if(que.peek().equals("z")) {
					sb.append("0");
					que.poll();
					que.poll();
					que.poll();
					que.poll();
				}else if(que.peek().equals("o")) {
					sb.append("1");
					que.poll();
					que.poll();
					que.poll();
				}else if(que.peek().equals("t")) { // 2,3
					que.poll();
					if(que.peek().equals("w")) {
						sb.append("2");
						que.poll();
						que.poll();
					}else if(que.peek().equals("h")) {
						sb.append("3");
						que.poll();
						que.poll();
						que.poll();
						que.poll();
					}
				}else if(que.peek().equals("f")) { // 4,5
					que.poll();
					if(que.peek().equals("o")) {
						sb.append("4");
						que.poll();
						que.poll();
						que.poll();
					}else if(que.peek().equals("i")) {
						sb.append("5");
						que.poll();
						que.poll();
						que.poll();
					}
				}else if(que.peek().equals("s")) { // 6,7
					que.poll();
					if(que.peek().equals("i")) {
						sb.append("6");
						que.poll();
						que.poll();
					}else if(que.peek().equals("e")) {
						sb.append("7");
						que.poll();
						que.poll();
						que.poll();
						que.poll();
					}
				}else if(que.peek().equals("e")) {
					sb.append("8");
					que.poll();
					que.poll();
					que.poll();
					que.poll();
					que.poll();
				}else if(que.peek().equals("n")) {
					sb.append("9");
					que.poll();
					que.poll();
					que.poll();
					que.poll();
				}
				
			}
		}
		
		
		
		
		int answer = Integer.parseInt(sb.toString());
		System.out.println(answer);
	
		
		
	}
	
    public int solution(String s) {
        int answer = 0;
        return answer;
    }
}
