package practice_05;

import java.util.Arrays;

public class Test05 {
	public int solution(int[] votes){
		//내 후보를 제외한 다른 후보들의 배열
		int[] otherVotes = new int[votes.length-1];
		for(int i=0;i<votes.length-1;i++) {
			otherVotes[i] = votes[i+1]; 			
		}
		//다른 후보가 없다면
		if(votes.length == 1) return 0;
		
		//다른 후보중 최고 투표수 찾기
		int maxVoteIndex = 0;
		maxVoteIndex = getIndex(otherVotes);
		//사야할 투표수
		int buyVote = 0;
				
		while(true) {
			//내 투표수가 최고 투표수일 경우 종료
			if(votes[0] > otherVotes[maxVoteIndex]) break;
			buyVote++;	//사야할 투표수 증가
			votes[0]++;	//내 투표수 증가
			otherVotes[maxVoteIndex]--;	//최고 투표수에서 투표수 감소
			maxVoteIndex = getIndex(otherVotes);	//다시 최고 투표수 위치 찾기
		}
		//System.out.println(Arrays.toString(votes));
		//System.out.println(Arrays.toString(otherVotes));
        return buyVote;
    }
	public int getIndex(int[] otherVotes) {
		int maxVote = Arrays.stream(otherVotes).max().getAsInt();
		for(int i=0;i<otherVotes.length;i++) {
			if(otherVotes[i] == maxVote) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Test05 test = new Test05();
		int[] votes = {50,6,33,3,4,7,77,77,2};
		int result = test.solution(votes);
		System.out.println(result);
	}
}
