package algo;

import java.util.HashMap;

public class Lessons178871 {
	public static void main(String[] args) {
		// map put과 replace의 차이
		// 위치 바꿀때 tmp 사용하기
		// map 활용 
		
		String[] players = { "mumu", "soe", "poe", "kai", "mine" };
		String[] callings = { "kai", "kai", "mine", "mine" };


		// callings 에 해당하는 문자열을 플레이어에서 검색
		// 지우고 해당 인덱스 -1에 삽입
		
		 HashMap<String, Integer> indexMap = new HashMap<>();
		// "mumu", "soe", "poe", "kai", "mine"
		 //  0       1      2       3     4
		 
		 // "mumu", "soe", "kai" "poe", , "mine"
		 //  0       1      2       3     4
		 for (int i = 0; i < players.length; i++) {
	            indexMap.put(players[i], i);
	        }
		 
		  for (String calling : callings) {
	            int idx = indexMap.get(calling); //3
	            String tmp = players[idx]; // kai
	            players[idx] = players[idx - 1];  
	            players[idx-1] = tmp;
	            
	            indexMap.put(players[idx], idx );
	            indexMap.put(players[idx-1], idx-1);
	        }
		  
		  
		
		/*
		String[] answer = {};
		Map<String, Integer> hm = new HashMap<String, Integer>();
		Map<Integer, String> hm2 = new HashMap<Integer, String>();
		answer = new String[hm2.size()];

		for (int i = 0; i < players.length; i++) {
			hm.put(players[i], i);
			hm2.put(i, players[i]);
		}

		for (int i = 0; i < callings.length; i++) {
			int rank = hm.get(callings[i]); // 3

			hm2.put(rank, hm2.get(rank - 1));
			hm2.put(rank - 1, callings[i]);

			hm.put(callings[i], rank - 1);
			hm.put(hm2.get(rank), rank);

		}
		int i = 0;
		for (Map.Entry<Integer, String> entry : hm2.entrySet()) {
			// System.out.println(entry.getKey() + ": " + );
			answer[i++] = entry.getValue();
		}

		for (String a : answer) {
			System.out.println(a);
		}

*/
		  
		  }
		  
	}
	
 

