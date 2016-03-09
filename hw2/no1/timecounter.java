package androidtest;
import java.util.Scanner;

public class timecounter {
	public static void main(String[] args)  {
		Scanner input  = new Scanner(System.in);
        System.out.println("Enter start time in the format hh:mm:ss");
        String hms1 = input.nextLine();
        System.out.println("Enter end time in the format hh:mm:ss");
        String hms2 = input.nextLine();
        String[] arrStr1 = hms1.split(":");
        String[] arrStr2 = hms2.split(":");
        input.close();
        System.out.println("Hour:" + (Integer.parseInt(arrStr2[0])-Integer.parseInt(arrStr1[0])) + " Minute:"+ (Integer.parseInt(arrStr2[1])-Integer.parseInt(arrStr1[1])) + " second:"+ (Integer.parseInt(arrStr2[2])-Integer.parseInt(arrStr1[2])));
        System.out.println("Total seconds:"+ ( (Integer.parseInt(arrStr2[0])-Integer.parseInt(arrStr1[0])) * 3600+(Integer.parseInt(arrStr2[1])-Integer.parseInt(arrStr1[1]))* 60 + (Integer.parseInt(arrStr2[2])-Integer.parseInt(arrStr1[2])) ));
        
	}
}
