package androidtest;

import java.util.Scanner;

public class inputfloat {
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.println("Input float1:");
		float num1 = input.nextFloat();
		System.out.println("Input float2:");
		float num2 = input.nextFloat();
		System.out.println("Input your choice: 1)+ 2)- 3) * 4)/:");
		int choice =input.nextInt();
		if (choice == 1){
			switch(choice) {
			case 1:
			System.out.print((num1+num2));
			}
		}
		if (choice == 2){
			switch(choice) {
			case 2:
			System.out.print("2-1£º"+(num2-num1)+"\n");
			System.out.print("1-2£º"+(num1-num2)+"\n");
			}
		}
		if (choice == 3){
			switch(choice) {
			case 3:
			System.out.print((num1*num2));
			}
		}
		if (choice == 4){
			switch(choice) {
			case 4:
				if(num2==0)
					System.out.println("float2 can't be zero");
				else
					System.out.print(("1/2£º"+num1/num2));
			}
		}
		input.close();

}
}
