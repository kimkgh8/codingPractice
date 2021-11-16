package personal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class practice_BigDecimal {

	public static void main(String[] args) throws Exception {

		// 가산
		BigDecimal b_add1 = new BigDecimal("3.1415");
		BigDecimal b_add2 = new BigDecimal("9.9");
		BigDecimal b_add3 = b_add1.add(b_add2);

		System.out.println("가산결과 : " + b_add3);

		// 감산
		BigDecimal b_subtract1 = new BigDecimal("3.1415");
		BigDecimal b_subtract2 = new BigDecimal("9.9");
		BigDecimal b_subtract3 = b_subtract1.subtract(b_subtract2);
		

		System.out.println("감산결과 : " + b_subtract3);

		// 곱셈
		BigDecimal b_multiply1 = new BigDecimal("3.1415");
		BigDecimal b_multiply2 = new BigDecimal("9.9");
		BigDecimal b_multiply3 = b_multiply1.multiply(b_multiply2);

		System.out.println("곱셈결과 : " + b_multiply3);

		// 나눗셈
		BigDecimal b_divide1 = new BigDecimal("3.1415");
		BigDecimal b_divide2 = new BigDecimal("9.9");
		// 반올림
		BigDecimal b_divide3 = b_divide1.divide(b_divide2, RoundingMode.HALF_UP);

		System.out.println("나눗셈결과 : " + b_divide3);
		
		// 지수표현
		BigDecimal b_divide4 = new BigDecimal("2.564E6");
		System.out.println("지수표현:" + b_divide4.toString());
		System.out.println("지수표현제거:" + b_divide4.toPlainString());

	}
}
