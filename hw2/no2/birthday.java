package androidtest;

import java.util.*;

public class birthday {
	public static void main(String[] args)  {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name1 = scanner.nextLine();
		System.out.println("Enter your Birthday Year(AD):");
		String Birthdayyear = scanner.nextLine();
		System.out.println("Enter your Birthday month(AD):");
		String Birthdaymonth = scanner.nextLine();
		System.out.println("Enter your Birthday date(AD):");
		String Birthdaydate = scanner.nextLine();
        System.out.println("Name:"+name1+"\n");
        System.out.println("Birthday(Republic of China):"+(Integer.parseInt(Birthdayyear)-1911)+"/"+Birthdaymonth+"/"+Birthdaydate);
        scanner.close();
	}

}
