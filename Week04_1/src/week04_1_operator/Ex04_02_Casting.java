package week04_1_operator;

public class Ex04_02_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2,b=3,c=4;
		int ret1,mok,namugi;
		float ret2;
		
		ret1 = a+b-c;
		System.out.printf("%d + %d - %d = %d \n",a,b,c,ret1);
		
		ret2 = (a*b)/(float)c;
		System.out.printf("%d * %d / %d = %f \n",a,b,c,ret2);

	}

}
