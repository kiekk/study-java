package arrayEx;

import java.util.Scanner;

/*
	���� 6
	���� �߱�����
	cpu : ���� ���� 3�� �Է¹޽��ϴ�.
		  ���� ���� 1~9���� �� �ڸ���

		  cpu ���� ���ڿ� ������ �θ� ������ ��ġ�� ������ Strike
		  	  ���ڴ� �����ϴµ�, ��ġ�� �ٸ��� ball
		  	  �θ� �����ϰ� cpu�� ���ڰ� ��ġ���� ������ out
		  ��)	cpu ���� : 581
		  		���� �θ��� : 490 	->out
		  					: 182   ->1 strike, 1 ball
		  		��ȸ���� ���� �� �ִ��� ī��Ʈ �մϴ�.
		  		2���� ���� cpu�� ����ؼ� ī��Ʈ ���� ���� ����� �̱�ϴ�.
 */
public class array05_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []baseNum = new int[3];
		int []playerNum = new int[2];
		for(int k = 0;k<playerNum.length;k++) {
			//���� 3�� ����
			for(int i = 0; i<baseNum.length;i++) {
				baseNum[i] =((int)(Math.random()*9)+1);
				for(int j = 0;j<i;j++) {
					if(baseNum[i] == baseNum[j]) {
						i--;
						break;
					}//end if
				}//end for(j)
			}//end for(i)
			System.out.print("CPU ���� : ");
			for(int i = 0;i<baseNum.length;i++) {
				System.out.print(baseNum[i] + " ");	
			}//end for
			System.out.println(); 					//�ٹٲ�
			//���� �Է��ϱ�
			int checkNum = 0;
			int []arCheckNum = new int[3];
			int count = 1;
			String result = "";
			String checkResult = "";
			while(true) {
				for(;true;) {
					checkResult += result;
					result = "";
					System.out.println(checkResult);
					System.out.print(count+"��° ���ڸ� �Է����ּ��� : "); checkNum = sc.nextInt(); 
					if(checkNum < 100 || checkNum > 999) {
						System.out.println("3�ڸ� ������ �Է����ּ���.");
						continue;
					}//end if
					if(checkNum/100 == checkNum%100/10 || checkNum/100 == checkNum%10 ||checkNum%100/10 == checkNum%10) {
						System.out.println("���� �ٸ� ���ڸ� �Է����ּ���.");
						continue;
					}else 
						break;
				}//end for

				//�Է¹������� �� �迭�� ���ڸ��� ����
				arCheckNum[0] = checkNum/100;
				arCheckNum[1] = checkNum%100/10;
				arCheckNum[2] = checkNum%10;
				System.out.print("�Է��� ���� : ");	result += "Ȯ���� ���� : ";
				for(int i = 0;i<arCheckNum.length;i++) {
					System.out.print(arCheckNum[i]+" ");
					result += arCheckNum[i];
				}
				System.out.println();
				int strike = 0, ball = 0, out = 0;
				for(int i = 0;i<baseNum.length;i++) {
					if(baseNum[i] == arCheckNum[i]) {
						strike++;
						continue;
					}//end if
					for(int j = 0;j<baseNum.length;j++) {
						if(baseNum[i] == arCheckNum[j]) {
							ball++;
						}
					}//end for(j)
				}//end for(i)
				if(strike == 0 && ball == 0) out++;

				result += "\n";
				if(strike >= 1) result += strike+ " strike\n";
				if(ball >= 1) result += ball+" ball\n";
				if(out == 1) result += "out\n";

				System.out.println(result);
				if(strike == 3) {
					System.out.println("�����Դϴ�.");
					break;
				}//end if
				count++;
				playerNum[k] += count;
			}//end while
		}//end for(k)
		if(playerNum[0] > playerNum[1]) {
			System.out.println("1�� player : "+playerNum[0]+"ȸ\n2�� player : "+playerNum[1]+"ȸ");
			System.out.println("2�� player�� �¸��Ͽ����ϴ�.");
		}
	}//end main
}//end class
