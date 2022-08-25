package pack_Median;

import java.util.Arrays;

public class Median {
	int cnt;
	int[] nums;
	
	public Median(int cnt, int[] nums) {
		this.cnt = cnt;
		this.nums = nums;
	}

	public void mtdMed(int cnt, int[] nums) {
		Arrays.sort(nums);
		System.out.println("오름차순 정렬결과 : " + Arrays.toString(nums));
		
		if ((cnt%2)!=0) {
			int medO = (cnt/2);		// medO : 홀수개수 중앙값 인덱스번호
			System.out.println("중위수(홀수 개수) : " + nums[medO]);
			
		} else if((cnt%2)==0) {
			int medE1 = (cnt/2)-1;	// medE1: 짝수개수 중앙값1 인덱스번호
			int medE2 = (cnt/2);	// medE2 : 짝수개수 중앙값2 인덱스번호
			double medAvg = ((double)nums[medE1] + (double)nums[medE2]) / 2;
			System.out.printf("중위수(짝수 개수) : %.1f", medAvg);
		}
	}
}

