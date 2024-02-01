package algo;

import java.util.ArrayList;
import java.util.List;

public class Lessons147355 {
/*
 * 
 * 
"3141592"	    "271"	2
"500220839878"	"7"	    8
"10203"	        "15"	3
1 ≤ p의 길이 ≤ 18
p의 길이 ≤ t의 길이 ≤ 10,000
t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.



 */
	public static void main(String[] args) {
		String t = "3141592";  //  7  - 2 5번
		String p = "271";
		int answer = 0;
		//  2 147 483 647
		Long trnsP = Long.parseLong(p);
		
		int splitLength = p.length();
		List<String> lt = new ArrayList<String>();
		for(int i = 0 ; i < t.length() ; i ++) {
			if(i + splitLength <= t.length()) {
				lt.add(t.substring(i, i + splitLength));
			}
		}
		
		for(String a : lt) {
			System.out.println(a);
		}
		
		for(int i = 0; i < lt.size(); i++) {
			Long target = Long.parseLong(lt.get(i));
			if(target <= trnsP) answer ++;
		}
		
		// System.out.println(answer);
		

	}
	  public int solution(String t, String p) {
	        int answer = 0;
	        return answer;
	    }
}
