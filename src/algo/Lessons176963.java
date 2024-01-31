package algo;

import java.util.HashMap;
import java.util.Map;

public class Lessons176963 {

	
	/*
["may", "kein", "kain", "radi"]	
[5, 10, 1, 3]	
[["may", "kein", "kain", "radi"],["may", "kein", "brin", "deny"], ["kon", "kain", "may", "coni"]]	

[19, 15, 6]


["kali", "mari", "don"]	[11, 1, 55]	[["kali", "mari", "don"], ["pony", "tom", "teddy"], ["con", "mona", "don"]]	[67, 0, 55]
["may", "kein", "kain", "radi"]	[5, 10, 1, 3]	[["may"],["kein", "deny", "may"], ["kon", "coni"]]	[5, 15, 0]	 * 
	 */
	
	public static void main(String[] args) {
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
		
		int[] answer = {};
		answer = new int[photo.length]; // [19, 15, 6]
		
		Map<String, Integer> hm = new HashMap<String, Integer>();
		for(int i = 0; i < name.length; i++) {
			hm.put(name[i],yearning[i]);
		}
		
		for(int i = 0; i < photo.length ; i++) {
			int sum = 0;
			for(int j = 0; j < photo[i].length ; j++) {
				if(hm.containsKey(photo[i][j])) {
					sum+=hm.get(photo[i][j]);
				}
			}
			answer[i] = sum;
		}
		
		for(int a : answer) {
			System.out.println(a);
			
		}
	}
	
	
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        return answer;
    }
}
