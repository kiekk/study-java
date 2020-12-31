package arrayEx;

import java.util.Scanner;

/*
	문제 6
	숫자 야구게임
	cpu : 난수 정수 3개 입력받습니다.
		  난수 정수 1~9까지 각 자리값

		  cpu 난수 숫자와 상대방이 부른 숫자의 위치가 같으면 Strike
		  	  숫자는 존재하는데, 위치가 다르면 ball
		  	  부른 숫자하고 cpu의 숫자가 일치하지 않으면 out
		  예)	cpu 난수 : 581
		  		숫자 부르기 : 490 	->out
		  					: 182   ->1 strike, 1 ball
		  		몇회만에 맞출 수 있는지 카운트 합니다.
		  		2명이 각각 cpu와 대결해서 카운트 값이 적은 사람이 이깁니다.
 */
public class array05_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int []baseNum = new int[3];
		int []playerNum = new int[2];
		for(int k = 0;k<playerNum.length;k++) {
			//숫자 3개 생성
			for(int i = 0; i<baseNum.length;i++) {
				baseNum[i] =((int)(Math.random()*9)+1);
				for(int j = 0;j<i;j++) {
					if(baseNum[i] == baseNum[j]) {
						i--;
						break;
					}//end if
				}//end for(j)
			}//end for(i)
			System.out.print("CPU 숫자 : ");
			for(int i = 0;i<baseNum.length;i++) {
				System.out.print(baseNum[i] + " ");	
			}//end for
			System.out.println(); 					//줄바꿈
			//숫자 입력하기
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
					System.out.print(count+"번째 숫자를 입력해주세요 : "); checkNum = sc.nextInt(); 
					if(checkNum < 100 || checkNum > 999) {
						System.out.println("3자리 정수로 입력해주세요.");
						continue;
					}//end if
					if(checkNum/100 == checkNum%100/10 || checkNum/100 == checkNum%10 ||checkNum%100/10 == checkNum%10) {
						System.out.println("서로 다른 숫자를 입력해주세요.");
						continue;
					}else 
						break;
				}//end for

				//입력받은수를 각 배열에 한자리씩 저장
				arCheckNum[0] = checkNum/100;
				arCheckNum[1] = checkNum%100/10;
				arCheckNum[2] = checkNum%10;
				System.out.print("입력한 숫자 : ");	result += "확인한 숫자 : ";
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
					System.out.println("정답입니다.");
					break;
				}//end if
				count++;
				playerNum[k] += count;
			}//end while
		}//end for(k)
		if(playerNum[0] > playerNum[1]) {
			System.out.println("1번 player : "+playerNum[0]+"회\n2번 player : "+playerNum[1]+"회");
			System.out.println("2번 player가 승리하였습니다.");
		}
	}//end main
}//end class
