package algo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Lessons135808 {
/*
 *  3	4	[1, 2, 3, 1, 2, 3, 1]	8
	4	3	[4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2]	33
 * 
 * 
 */
	/*
	 [1, 2, 3, 1, 2, 3, 1]
	 [3, 3, 2, 2, 1, 1, 1 ]
	 [ 2, 3, 2, 3] 2 X 4 X 1 => 최저점수 X 사과개수 X 1
	
	3, 3, 2, 2, 
	1, 1, 1
	=> 2 X 4 X 1 
	
	4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2
	
	4, 4, [4],  4, 4, [4], 	2, 2, [2],  	2, 1, [1]
	0              1            2               3
    2              5            8              11

	*/
	/*  k = 4와 m = 3인 경우, 몫이 4
			[1, 1, 2]	1 x 3 = 3
			[2, 2, 2]	2 x 3 = 6
			[4, 4, 4]	4 x 3 = 12
			[4, 4, 4]	4 x 3 = 12
			
			*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 4;
		int m = 13;
		int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
	    int answer = 0;
	    // k = 3,4,5,6,7,8,9
	    
	    // 1. 내림차순 정렬을 한다.
	    score = IntStream.of(score)
	    		.boxed() // int를 Integer로 변환
	    		.sorted((a, b) -> b - a) // 내림차순 정렬
	    		.mapToInt(Integer::intValue) // Integer를 다시 int로 변환
	    		.toArray();
	    // 2. m의 갯수만큼 영역을 나눈다. 단, 남은 사이즈의 나머지가 1이상인 경우 종료한다.
	    for(int i = 0 ; i < score.length / m ; i++) {
	    	answer += score[i*m + m-1] * m ;
	    }
	    
	    
	    
	}
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        return answer;
    }
}
