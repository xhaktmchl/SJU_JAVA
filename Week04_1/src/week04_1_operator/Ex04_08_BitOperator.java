package week04_1_operator;

public class Ex04_08_BitOperator {

	public static void main(String[] args) {
		// 비트 연산자
		
		// 비트 논리곱 04_08
		System.out.printf("10 & 7 = %d\n",10&7);
		System.out.printf(" 123 & 456 = %d\n",123&456);
		System.out.printf(" 0xFFFF & 0000 = %d\n",0xFFFF&0000); // 16진수 비트 논리곱
		
		// 비트 논리합 04_09
		System.out.printf("10 | 7 = %d\n",10|7);
		System.out.printf(" 123 | 456 = %d\n",123|456);
		System.out.printf(" 0xFFFF | 0000 = %d\n",0xFFFF|0000); // 16진수 비트 논리곱
		
		//배타적 비트 논리합 04_10
		System.out.printf("10 ^ 7 = %d\n",10^7);
		System.out.printf(" 123 ^ 456 = %d\n",123^456);
		System.out.printf(" 0xFFFF ^ 0000 = %d\n",0xFFFF^0000); // 16진수 배타적 비트 논리곱
		
		// 비트연산자 마스크 04_11
		// 마스크는 필터링 역할
		byte a='A',b;
		byte mask = 0x0F; // 비트로 0000 1111
		
		System.out.printf("%X & %X = %X\n",a,mask,a&mask); // 'A'는 16진수로 41, 41&0F = 1 
		System.out.printf("%X | %X = %X\n",a,mask,a|mask); // 'A'는 16진수로 41, 41|0F = 4F
		
		mask = 'a' - 'A';
		b = (byte)('A' ^ mask);
		System.out.printf("%c ^ %d = %c\n",a,mask,b);
		
		b = (byte)('a' ^ mask);
		System.out.printf("%c ^ %d = %c\n",'a',mask,a);
		
		
		// 비트 부정 04_12
		int num=1234;
		System.out.printf("~1234 = %d\n",~num+1); // 비트부정으로 1234의 음수값 출력
		// 1의 보수 +1 = 음수 값
		
		// 비트 왼쪽 시프트 04_13
		int n= 10;
		System.out.printf("10을 왼쪽 1번 시프트 = %d\n",n<<1); // n번 시프트 2^n 배
		System.out.printf("10을 왼쪽 2번 시프트 = %d\n",n<<2);
		System.out.printf("10을 왼쪽 3번 시프트 = %d\n",n<<3);
		
		// 비트 오른쪽 시프트 04_14
		n= 10;
		System.out.printf("10을 오른쪽 1번 시프트 = %d\n",n>>1); // n번 시프트 2^n 나누기
		System.out.printf("10을 오른쪽 2번 시프트 = %d\n",n>>2);
		System.out.printf("10을 오른쪽 3번 시프트 = %d\n",n>>3);
		

		
		
	}

}
