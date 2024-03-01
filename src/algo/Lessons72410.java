package algo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lessons72410 {
/*
	예1	"...!@BaT#*..y.abcdefghijklm"	"bat.y.abcdefghi"
	예2	"z-+.^."	                    "z--"
	예3	"=.="	                        "aaa"
	예4	"123_.def"	                    "123_.def"
	예5	"abcdefghijklmn.p"	            "abcdefghijklmn"
	
1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
	



	*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String new_id = "=.="; // bat.y.abcdefghi
		String answer = "";
		
		String regex = "[^a-z0-9_\\-\\.]";
		
		// 1 단계
		answer = new_id.toLowerCase();
		
		// 2 단계
		// "...!@bat#*..y.abcdefghijklm" → "...bat..y.abcdefghijklm"
		Matcher matcher =  Pattern.compile(regex).matcher(answer);
		answer = matcher.replaceAll("");

		// 3 단계
	     // 변경된 문자열을 저장할 StringBuilder 생성
        StringBuilder sb = new StringBuilder();

        // 연속된 마침표를 하나의 마침표로 변경
        int count = 0;
        for (char c : answer.toCharArray()) {
            if (c == '.') {
                count++;
                if (count < 2) {
                    sb.append(c);
                }
            } else {
                sb.append(c);
                count = 0;
            }
        }
        // 4단계
        if(sb.charAt(0)=='.') {
        	sb.deleteCharAt(0);
        }
        if(sb.length()>0 &&sb.charAt(sb.length()-1)=='.') {
        	sb.deleteCharAt(sb.length() - 1);
        }
        //5 단계
        if(sb.toString().equals("")) {
        	sb = new StringBuilder("a");
        }
        // 6단계
        
        if(sb.length() > 15) {
        	sb.delete(15, sb.length());
        }
        if(sb.length()>0 &&sb.charAt(sb.length()-1)=='.') {
        	sb.deleteCharAt(sb.length() - 1);
        }
        // 7단계  길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        if(sb.length()>0 &&sb.length() <= 2) {
        	while(sb.length() < 3) {
        		sb.append(sb.charAt(sb.length()-1));
        	}
        }
        answer = sb.toString();
        
        
	}
	
    public String solution(String new_id) {
        String answer = "";
        return answer;
    }

}
/*
class Solution {
    public String solution(String new_id) {

        String s = new KAKAOID(new_id)
                .replaceToLowerCase()
                .filter()
                .toSingleDot()
                .noStartEndDot()
                .noBlank()
                .noGreaterThan16()
                .noLessThan2()
                .getResult();


        return s;
    }

    private static class KAKAOID {
        private String s;

        KAKAOID(String s) {
            this.s = s;
        }

        private KAKAOID replaceToLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KAKAOID filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KAKAOID toSingleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KAKAOID noStartEndDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KAKAOID noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KAKAOID noGreaterThan16() {
            if (s.length() >= 16) {
                s = s.substring(0, 15);
            }
            s = s.replaceAll("[.]$", "");
            return this;
        }

        private KAKAOID noLessThan2() {
            StringBuilder sBuilder = new StringBuilder(s);
            while (sBuilder.length() <= 2) {
                sBuilder.append(sBuilder.charAt(sBuilder.length() - 1));
            }
            s = sBuilder.toString();
            return this;
        }

        private String getResult() {
            return s;
        }
    }
}
*/
