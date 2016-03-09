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
			System.out.println("1)ݔ��돽2)ݔ��E�A��̖ -1)�Y��)");
			int opt=input.nextInt();
			if(opt==1)
			{
				System.out.println("ݔ���L�S");
				double l=input.nextDouble();
				System.out.println("ݔ����S");
				double s=input.nextDouble();
				System.out.println("ݔ�뾎̖");
				int count=input.nextInt();
				o[count]=new Circle(l,s);
				count=count+1;
			}
			else if(opt==2)
			{
				System.out.println("ݔ��E�A��̖");
				int number=input.nextInt();
				System.out.println("�E�A��e="+o[number].area()+"\t"+"�E�A���L="+o[number].length());
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

