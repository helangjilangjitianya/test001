package Java2;


import java.util.Scanner;
public class test3 {
	public static void main(String[] args)
	{
		Scanner apple=new Scanner(System.in);
		System.out.print("整数A：");
		int a=apple.nextInt();
		System.out.print("整数B：");
		int b=apple.nextInt();
		if(a<b)
		{
			for(int i=a;i<b;i++)
				System.out.print(i);
		}else if(a>b)
		{
			for(int g=b;g<a;g++)
				System.out.print(g);
		}
		
		
    }
}
	
	


