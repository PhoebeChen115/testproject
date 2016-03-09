package androidtest;
import java.util.Scanner;

abstract class Shapetest {
	  abstract double area();
	}
	class Cir extends Shapetest {
	  double r;
	  public Cir(double r) { 
	    this.r = r; 
	  }
	  public double area() {
	    return 3.14 * r * r;
	  }  
	}
	class Rectangle extends Shapetest {
		  double width, height;
		  public Rectangle(double w, double h) { 
		    this.width = w; 
		    this.height = h;
		  }
		  public double area() {
		    return width*height;
		  }  
		}
	class Ov extends Shapetest 
	{
		double l,s;
		public Ov(double l, double s) 
		{
			this.l = l;
			this.s = s;
		}
		public double area() 
		{
			
			return 3.14 * 2 * s + 4 * (l - s);
			
		}
	}
	class Tri extends Shapetest 
	{
		double l,s;
		public Tri(double l, double s) 
		{
			this.l = l;
			this.s = s;
		}
		public double area() 
		{
			return (l * s) / 2;
		}
	}
public class Shape {
	 public static void main(String[] args)
		{
			int sharp[] = new int[10];
			Cir circle[] = new Cir[10];
			Ov oval[] = new Ov[10];
			Rectangle rect[] = new Rectangle[10];
			Tri tri[] = new Tri[10];
			
	        Scanner input = new Scanner(System.in);
	        double num1= 0,num2 = 0;
	        int c1= 0,c2=0,c3=0,c4=0,count = 0;
			while(true)
			{
				System.out.printf("1)圓形 2)橢圓 3)矩形 4)三角型 5)全部顯示 -1)結束 :");
				int opt = input.nextInt();
				sharp[count] = opt;
				count++;
				if(opt == 1)
				{
					System.out.printf("半徑:");
					num1 = input.nextInt();
					circle[c1] = new Cir(num1);
					c1++;
				}
				else if(opt == 2)
				{
					System.out.printf("長軸:");
					num1 = input.nextDouble();
					System.out.printf("短軸:");
					num2 = input.nextDouble();
					oval[c2] = new Ov(num1,num2);
					c2++;
				}
				else if(opt == 3)
				{
					System.out.printf("長:");
					num1 = input.nextDouble();
					System.out.printf("寬:");
					num2 = input.nextDouble();
					rect[c3] = new Rectangle(num1,num2);
					c3++;
				}
				else if(opt == 4)
				{
					System.out.printf("底:");
					num1 = input.nextDouble();
					System.out.printf("高:");
					num2 = input.nextDouble();
					tri[c4] = new Tri(num1,num2);
					c4++;
				}
				else if(opt ==5)
				{
					c1= 0;c2=0;c3=0;c4=0;
					for(int i=0;i<count;i++)
					{
						if(sharp[i]==1)
						{
							System.out.println((i+1)+"圓形面積:"+circle[c1].area());
							c1++;
						}
						else if(sharp[i]==2)
						{
							System.out.println((i+1)+"橢圓面積為:"+oval[c2].area());
							c2++;
						}
						else if(sharp[i]==3)
						{
							System.out.println((i+1)+"矩形面積為:"+rect[c3].area());
							c3++;
						}
						else if(sharp[i]==4)
						{
							System.out.println((i+1)+"三角形面積為:"+tri[c4].area());
							c4++;
						}
					}
				}
				else if(opt==-1)
				{
					break;
				}
				else{
					System.out.println("錯誤!");
				}		
			}	      
			input.close();
		}
	 
}
