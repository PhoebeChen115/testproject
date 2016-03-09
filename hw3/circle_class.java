package androidtest;
import java.util.*;

public class circle_class {
	double r;
	circle_class(double r) {
		    this.r = r;
	}
	double r()
	{
		return r;
	}
	double area() {
	  return 3.14 * r * r;
	}
	double Arc(double a) {
	  return 3.14 *(a/360)*(r*2);
	}
	double Pie(double a) {
	 return (r*r*3.14)* (a/360);
	}
	
	public static void main(String[] args) {
		circle_class c[] = new circle_class[20];
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("1)輸入半徑2)輸入圓形編號 -1)結束)");
			int opt=input.nextInt();
			if(opt==1)
			{
				System.out.println("輸入半徑");
				double r=input.nextDouble();
				System.out.println("輸入編號");
				int count=input.nextInt();
				c[count]=new circle_class(r);
				count=count+1;
			}
			else if(opt==2)
			{
				System.out.println("輸入圓形編號");
				int number=input.nextInt();
				System.out.println("輸入圓形角度");
				double angle=input.nextDouble();
				System.out.println("半徑"+c[number].r+"\t"+"c.area()="+c[number].area()+"\t"+"c.Arc()="+c[number].Arc(angle));
			}
			else if(opt==-1)
				break;
		}
		input.close();

	}		
}
