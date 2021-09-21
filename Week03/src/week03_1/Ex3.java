package week03_1;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 출력 형식 , 출력 자릿수 조절
		System.out.println("안녕하세요");
		System.out.println("자바 입니다.");
		
		System.out.print("안녕하세요");
		System.out.print("자바 입니다.");
		
		System.out.printf("%d\n",123);
		System.out.printf("%5d\n",123);
		System.out.printf("%05d\n",123);
		System.out.printf("%f\n",123.45);
		System.out.printf("%.2f\n",123.45);
		System.out.printf("%7.2f\n",123.45);
		System.out.printf("%s\n","hi java");
		System.out.printf("%10s\n","hi java");
		
		// 서식
		System.out.printf("\n줄바꿈\n");
		System.out.printf("\t탭키\n");
		System.out.printf("\r홈키\n");
		System.out.printf(" \" 큰 따옴표 출력\n");
		System.out.printf(" \\ 역 슬래시 출력\n");
		
		// 변수
		int a =1;
		float b = 111.1f; // float실수형은 f 를 붙여야 함
		double c= 111.1,d=111.1;
		
		System.out.println(b+c);
		System.out.println(d+c);
	}

}
