package androidtest;

import java.util.Scanner;


public class Leap_year {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Input Year(AD):");
		int year = input.nextInt();

		for(int i=0;i<=year;i++)
		{

			
			if(i % 400 == 0)
			{
				System.out.print(i + "\t");
			}
			else if(i % 4 == 0 && i % 100 != 0)
			{
				System.out.print(i + "\t");
			}			

			
		}
		input.close();
	}
}
