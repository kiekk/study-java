package practice_05;

import java.util.Arrays;

public class Test05 {
	public int solution(int[] votes){
		//�� �ĺ��� ������ �ٸ� �ĺ����� �迭
		int[] otherVotes = new int[votes.length-1];
		for(int i=0;i<votes.length-1;i++) {
			otherVotes[i] = votes[i+1]; 			
		}
		//�ٸ� �ĺ��� ���ٸ�
		if(votes.length == 1) return 0;
		
		//�ٸ� �ĺ��� �ְ� ��ǥ�� ã��
		int maxVoteIndex = 0;
		maxVoteIndex = getIndex(otherVotes);
		//����� ��ǥ��
		int buyVote = 0;
				
		while(true) {
			//�� ��ǥ���� �ְ� ��ǥ���� ��� ����
			if(votes[0] > otherVotes[maxVoteIndex]) break;
			buyVote++;	//����� ��ǥ�� ����
			votes[0]++;	//�� ��ǥ�� ����
			otherVotes[maxVoteIndex]--;	//�ְ� ��ǥ������ ��ǥ�� ����
			maxVoteIndex = getIndex(otherVotes);	//�ٽ� �ְ� ��ǥ�� ��ġ ã��
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
