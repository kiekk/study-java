package practice_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test01 {
	public int solution(int[] goods){
		//����� ������ ����
		int result = 0;
		//stream�� �̿��ؼ� �迭�� �ּҰ��� ���մϴ�.
		int minPrice = Arrays.stream(goods).min().getAsInt();
		//���� �ּҰ��� 50�� �Ѵ� ��� ��� ���� 50�� �ѱ� ������ ���� ����ϴ� ���� ȿ�����Դϴ�.
		if(minPrice >= 50) {
			result = Arrays.stream(goods).sum() - (10 * goods.length);
			return result;
		}
		//50�� �Ѵ� goods�� �迭�� ����ϴ�.
		int[] over50PriceGoods = Arrays.stream(goods).filter(x -> x >= 50).toArray();
		//50�� ���� �ʴ� good�� �迭�� ����ϴ�.
		int[] under50PriceGoods = Arrays.stream(goods).filter(x -> x < 50).toArray();
		//50�� �Ѵ� goods�� 10�޷��� ���ε� �������� ����մϴ�.
		for(int x : over50PriceGoods)
			result += x - 10;
		//50�� ���� �ʴ� goods���� ���� ���մϴ�.
		int under50PriceGoodsSum = Arrays.stream(under50PriceGoods).sum();
		
		result += under50PriceGoodsSum;
		//50�� ���� �ʴ� goods���� ���� 50�� �Ѵ� ��� 10�޷��� �����մϴ�.
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
