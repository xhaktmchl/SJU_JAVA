package week03_2;

public class Ex03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자형 변수 사용
		int a,b;
		char c,d;
		
		a= 0xF90A; // 16진수 수
		b = 0x50;
		
		System.out.printf("%c\n",a);
		
		c= (char)b;
		System.out.printf("%c\n",c);
		System.out.printf("%d\n",b);
		System.out.printf("%x\n",b);
	}

}
