package SelfEvalutionlab2;

import java.util.Scanner;

//wap to ask a number and print sum and count and average  of digits .
public class sumavg
{	
	
		
		
		public static void main(String[] args) 
	{
			int Sum=0;
			int num=12345;
	
			int count=0;
			int avg=0;
			
			while(num>0)
			{
				Sum+=num%10;
				num/=10;
				count++;
			}
			System.out.println("sum:"+Sum);
			System.out.println("count:"+count);
			System.out.println("avg:"+Sum/count);	
		
		

	}

}
