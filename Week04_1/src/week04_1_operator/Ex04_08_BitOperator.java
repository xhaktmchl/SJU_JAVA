package week04_1_operator;

public class Ex04_08_BitOperator {

	public static void main(String[] args) {
		// ��Ʈ ������
		
		// ��Ʈ ���� 04_08
		System.out.printf("10 & 7 = %d\n",10&7);
		System.out.printf(" 123 & 456 = %d\n",123&456);
		System.out.printf(" 0xFFFF & 0000 = %d\n",0xFFFF&0000); // 16���� ��Ʈ ����
		
		// ��Ʈ ���� 04_09
		System.out.printf("10 | 7 = %d\n",10|7);
		System.out.printf(" 123 | 456 = %d\n",123|456);
		System.out.printf(" 0xFFFF | 0000 = %d\n",0xFFFF|0000); // 16���� ��Ʈ ����
		
		//��Ÿ�� ��Ʈ ���� 04_10
		System.out.printf("10 ^ 7 = %d\n",10^7);
		System.out.printf(" 123 ^ 456 = %d\n",123^456);
		System.out.printf(" 0xFFFF ^ 0000 = %d\n",0xFFFF^0000); // 16���� ��Ÿ�� ��Ʈ ����
		
		// ��Ʈ������ ����ũ 04_11
		// ����ũ�� ���͸� ����
		byte a='A',b;
		byte mask = 0x0F; // ��Ʈ�� 0000 1111
		
		System.out.printf("%X & %X = %X\n",a,mask,a&mask); // 'A'�� 16������ 41, 41&0F = 1 
		System.out.printf("%X | %X = %X\n",a,mask,a|mask); // 'A'�� 16������ 41, 41|0F = 4F
		
		mask = 'a' - 'A';
		b = (byte)('A' ^ mask);
		System.out.printf("%c ^ %d = %c\n",a,mask,b);
		
		b = (byte)('a' ^ mask);
		System.out.printf("%c ^ %d = %c\n",'a',mask,a);
		
		
		// ��Ʈ ���� 04_12
		int num=1234;
		System.out.printf("~1234 = %d\n",~num+1); // ��Ʈ�������� 1234�� ������ ���
		// 1�� ���� +1 = ���� ��
		
		// ��Ʈ ���� ����Ʈ 04_13
		int n= 10;
		System.out.printf("10�� ���� 1�� ����Ʈ = %d\n",n<<1); // n�� ����Ʈ 2^n ��
		System.out.printf("10�� ���� 2�� ����Ʈ = %d\n",n<<2);
		System.out.printf("10�� ���� 3�� ����Ʈ = %d\n",n<<3);
		
		// ��Ʈ ������ ����Ʈ 04_14
		n= 10;
		System.out.printf("10�� ������ 1�� ����Ʈ = %d\n",n>>1); // n�� ����Ʈ 2^n ������
		System.out.printf("10�� ������ 2�� ����Ʈ = %d\n",n>>2);
		System.out.printf("10�� ������ 3�� ����Ʈ = %d\n",n>>3);
		

		
		
	}

}
