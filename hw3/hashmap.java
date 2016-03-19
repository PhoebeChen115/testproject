package homework3;

import java.util.*;

public class hashmap {
	
	public static void main(String[] args){
		HashMap map = new HashMap();
		String name=" ";
		int grade=0;
		int count=0;		
		int choice=0;
		while(true)
		{			
			Scanner input=new Scanner(System.in);
			System.out.println("1)Input 2)Search -1)End:");			
			choice=input.nextInt();
			if(choice==1)
			{
				System.out.println("Input student name:");			
				name=input.next();
				System.out.printf("Input student %s grade:",name);
				grade=input.nextInt();		
				
				count=count+1;					
			}
			else if(choice==2)
			{			
				map.put(name, grade);
				System.out.println("Input student name:");	
				String name2=input.next();
				System.out.print(map);
				System.out.print("\n");
				System.out.printf("%s's graade:"+map.get(name2),name2);	
				System.out.print("\n");

			}
			else
				break;
		}	
		
	}
}
