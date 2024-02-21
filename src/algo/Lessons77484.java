package algo;

import java.util.ArrayList;

public class Lessons77484 {
/*
			[44, 1, 0, 0, 31, 25]	[31, 10, 45, 1, 6, 19]	[3, 5]
			[0, 0, 0, 0, 0, 0]	[38, 19, 20, 40, 15, 25]	[1, 6]
			[45, 4, 35, 20, 3, 9]	[20, 9, 3, 45, 4, 35]	[1, 1]
			
1	6개 번호가 모두 일치
2	5개 번호가 일치
3	4개 번호가 일치
4	3개 번호가 일치
5	2개 번호가 일치
6   그 외

*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		
		int[] answer = {};
		answer = new int[2];
		
		int sameVal = 0;
		int zeroVal = 0;
		// 1. 당첨번호에서 로또번호와 같은 개수를 구한다.
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int a : win_nums) ar.add(a);
		
		for(int i=0; i < lottos.length; i++) {
			if(lottos[i] == 0) zeroVal++;
			if(ar.contains(lottos[i])) sameVal++;

		}
		// 2. 로또번호의 0의 개수를 더한다
		// 3. 나온 숫자 기준으로 등수를 매긴다. 3, 5
		//3	4개 번호가 일치
		//5	2개 번호가 일치
		if(sameVal == zeroVal) answer[1] = 6;
		answer[0] = 7 - (sameVal+zeroVal);
		answer[1] = 7 - sameVal;
		answer[1] = answer[1]> 6 ? 6 : answer[1];
		//  44, 31, 25, 1,  0, 0
		//  45, 31, 19, 10, 6, 1
		//  최대 4개, 최소 2개
		//  4개 -> 같은 개수 + 0의 개수
		//  2개 -> 같은 개수
		
		for(int a : answer) {
			System.out.println(a);
		}
		
		
		
		
	}
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {};
        return answer;
    }
}
