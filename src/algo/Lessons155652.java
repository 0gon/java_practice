package algo;

public class Lessons155652 {

	/*
	 * 
s	skip	index	result
"aukks"	"wbqd"	5	"happy"
	 * a
	 */
	
	// a : a <b> c <d> e f g [h] i j k 
	// u : u v w x y z a b c d e 
	// k : k l m n o p q r s t u
	// s : s t u v w x y z
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aukks";
		String skip ="abcdefghijklmn";
		int index = 20;
		
        String answer = "";
        int plusValue = 0;
        StringBuilder sb = new StringBuilder();
        
     // 1. s를 입력 받는다.
        for(int i = 0 ; i < s.length(); i ++) {
        	char target = s.charAt(i);
        	for(int j = 0; j < index; j++) {
        		target += 1;
        		if(target > 'z') target -= 26;
        		if(skip.contains(String.valueOf(target))) j--;
        	}
        	sb.append(target);
        }
        answer = sb.toString();
        // 2. 값마다 비교한다.
        // 3. index 값 까지 증가시킨다.
        
        // 97~122 150 =>
        
        // 3-1 증가시키면서 비교값이 skip에 해당하면 결과 인덱스를 늘린다.
        
        
        

	}
    public String solution(String s, String skip, int index) {
        String answer = "";
        return answer;
    }
}
