package algo;

import java.util.ArrayList;
import java.util.Collections;

public class Lessons138477 {
	
	
	// 우선순위 큐 
	/*
	3	[10, 100, 20, 150, 1, 100, 200]              	[10, 10, 10, 20, 20, 100, 100]
    4	[0, 300, 40, 300, 20, 70, 150, 50, 500, 1000]	[0, 0, 0, 0, 20, 40, 70, 70, 150, 300]
    
    */
	/*
	10  | 10
	100 10 | 10
	100 20 10 |  10  //     5 -> 10  | 15 -> 15, 25 -> 20 , 150 -> 20 
	150 100 20 | 20
	150 100 20 | 20
	200 150 100 | 100
	
	1 10 20 100 100 150 200
	
	
	
	*/
	public static void main(String[] args) {
		int k = 3; 
		int[] score = {10, 100, 20, 150, 1, 100, 200};
		
		int[] answer = {};
		answer = new int[score.length];
		
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		/*
		for(int i = 0; i < k ; i++) {
			ar.add(score[i]);
		}
		
		Collections.sort(ar);
		for(int i = 0; i < k ; i++) {
			answer[i] = ar.get(0);
		}
		
		for(int i = k; i < score.length; i++) {
			if(score[i] > ar.get(0)) {
				ar.add(score[i]);
				Collections.sort(ar);
				ar.remove(0);
			}
			answer[i] = ar.get(0);
			//System.out.println("dd:"+ answer[i]);
		}
		*/
		
		/*
		10  | 10
		100 10 | 10
		100 20 10 |  10  //     5 -> 10  | 15 -> 15, 25 -> 20 , 150 -> 20 
		150 100 20 | 20
		150 100 20 | 20
		200 150 100 | 100
		
		1 10 20 100 100 150 200
		
		10 20 100 150
		
		*/
//		3	[10, 100, 20, 150, 1, 100, 200]              	[10, 10, 10, 20, 20, 100, 100]
		for(int i = 0; i < score.length; i++) {
			ar.add(score[i]);
			Collections.sort(ar);
			if(i >= k) {
				ar.remove(0);
			}
			answer[i] = ar.get(0);
		}
		
		
		
	
		
		for(int a : answer) {
			 System.out.println(a);
		}
		

	}
	
	
	  public int[] solution(int k, int[] score) {
	        int[] answer = {};
	        return answer;
	    }

}
