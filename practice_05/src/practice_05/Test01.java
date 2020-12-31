package practice_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public int solution(int[] goods){
		//결과를 저장할 변수
		int result = 0;
		//stream을 이용해서 배열의 최소값을 구합니다.
		int minPrice = Arrays.stream(goods).min().getAsInt();
		//구한 최소값이 50이 넘는 경우 모든 값이 50이 넘기 때문에 각자 계산하는 것이 효율적입니다.
		if(minPrice >= 50) {
			result = Arrays.stream(goods).sum() - (10 * goods.length);
			return result;
		}
		//50이 넘는 goods를 배열에 담습니다.
		int[] over50PriceGoods = Arrays.stream(goods).filter(x -> x >= 50).toArray();
		//50이 넘지 않는 good를 배열에 담습니다.
		int[] under50PriceGoods = Arrays.stream(goods).filter(x -> x < 50).toArray();
		//50이 넘는 goods는 10달러씩 할인된 가격으로 계산합니다.
		for(int x : over50PriceGoods)
			result += x - 10;
		//50이 넘지 않는 goods들의 합을 구합니다.
		int under50PriceGoodsSum = Arrays.stream(under50PriceGoods).sum();
		
		result += under50PriceGoodsSum;
		//50이 넘지 않는 goods들의 합이 50이 넘는 경우 10달러를 할인합니다.
		if(under50PriceGoodsSum >= 50) 
			result -= 10;
		
        return result;
    }
	public static void main(String[] args) {
		Test01 test = new Test01();
		int[] goods = {5,3,15};
		int result = test.solution(goods);
		System.out.println(result);
	}
}
