package Java2;
//大小比较，进行数值中转,引进中间变量
import java.util.Scanner;
public class test2 
{
	public static void main(String[]args)
	{
		Scanner apple =new Scanner(System.in);
		System.out.print("整数a：");
		int a=apple.nextInt();
		System.out.print("整数b:");
		int b=apple.nextInt();
		System.out.print("整数c：");
		int c=apple.nextInt();
		int max=a;
		if (max<b) max=b;
		if(max<c) max=c;
	}
	
	

}
