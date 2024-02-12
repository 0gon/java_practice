package algo;

public class Lessons12950 {
	/*
	[[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
	[[1],[2]]	[[3],[4]]	[[4],[6]]
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] answer = {};
		
		answer = new int[arr1.length][arr1[0].length];

		
		for(int i = 0 ; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		System.out.println(arr1);
	}
	
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        return answer;
    }

}
