package androidtest;

import java.util.Scanner;

public class Oval {
	double r;
	Oval(double r) {
			this.r = r;
		}
	    double area() {
		 return 3.14 * r * r;
		}
		double arc(double a) {
		 return 3.14 *(a/360)*(r*2);
		}
		double pie(double a) {
		 return area()* (a/360);
		}
	public static void main(String[] args){
		Circle o[] = new Circle[20];
		Scanner input = new Scanner(System.in);
		while(true)
		{
			System.out.println("1)輸入半徑2)輸入橢圓編號 -1)結束)");
			int opt=input.nextInt();
			if(opt==1)
			{
				System.out.println("輸入長軸");
				double l=input.nextDouble();
				System.out.println("輸入短軸");
				double s=input.nextDouble();
				System.out.println("輸入編號");
				int count=input.nextInt();
				o[count]=new Circle(l,s);
				count=count+1;
			}
			else if(opt==2)
			{
				System.out.println("輸入橢圓編號");
				int number=input.nextInt();
				System.out.println("橢圓面積="+o[number].area()+"\t"+"橢圓周長="+o[number].length());
			}
			else if(opt==-1)
				break;
		}
		input.close();

	}		
}
class Circle extends Oval
{
    double shortedge;
    public Circle(double longedge,double shortedge) 
	{
        super(longedge);
        this.shortedge = shortedge;
    }
    double area() 
	{
		return 3.14*r*shortedge;
    }
    double length()
    {
		if(r > shortedge)
		{
			return 4*(r - shortedge)+3.14*2*shortedge ;
		}
		else if(shortedge > r)
		{
			return  4*(shortedge - r)+3.14*2*r ;
		}
		else
		{
			return 2*3.14*r;
		}
        
    }
}

