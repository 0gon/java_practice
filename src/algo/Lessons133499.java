package algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lessons133499 {
/*
	"aya", "ye", "woo", "ma" 
	
	["aya", "yee", "u", "maa"]	1
	["ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"]	2

*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
		int answer = 0;
		String regex = "(.)\\1";
		
		// 1. 매칭되는 대문자로 변환한다.
		for(int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replaceAll("aya", "A");
			babbling[i] = babbling[i].replaceAll("ye", "B");
			babbling[i] = babbling[i].replaceAll("woo", "C");
			babbling[i] = babbling[i].replaceAll("ma", "D");
			if(babbling[i].equals(babbling[i].toUpperCase())){
			        // 정규표현식 패턴과 문자열 매칭
			        Matcher matcher = Pattern.compile(regex).matcher(babbling[i]);
			        // 연속된 같은 문자열이 있는지 확인
			        boolean hasConsecutive = matcher.find();
			        if (!hasConsecutive) answer++;
			}
		}
		
		
	}

	public int solution(String[] babbling) {
		int answer = 0;
		return answer;
	}
}
