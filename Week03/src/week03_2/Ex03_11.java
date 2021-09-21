package week03_2;

import java.math.BigDecimal;

public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 0.1231231231231231231231231f;
		double b = 0.1231231231231231231231231;
		
		
		BigDecimal bd = new BigDecimal("0.1231231231231231231231231");
		// 숫자가 자료형 범위를 벗어나면 다른 값이 나옴
		System.out.printf("%30.25f\n",a);
		System.out.printf("%30.25f\n",b);
		System.out.printf("%30.25f\n",bd);

	}

}
