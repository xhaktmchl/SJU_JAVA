package week04_1_operator;

import java.util.Scanner;

public class Ch04_Problem_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int year;
		
		System.out.printf("연도를 입력:");
		year = s.nextInt();
		
		if(((year %4 == 0) && (year %100 == 0)) || (year %400 == 0)) {
			System.out.printf("%d는 윤년입니다.",year);
		}
		else {
			System.out.printf("%d는 윤년이 아닙니다.",year);
		}
		

	}

}
