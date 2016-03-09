package androidtest;
import java.util.*;

public class date {
	int y,m,d;
	 date(int y, int m, int d){
		this.y=y;
		this.m=m;
		this.d=d;
	 }
	public boolean Check(){
		if(y<=1000){
			System.out.println("YEAR ERROR");
			return false;
		}
		if(m<=0||m>12){
			System.out.println("Month ERROR");
			return false;
		}
		if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d>0&&d<32))
			return true;
		else if((m==4||m==6||m==9||m==11)&&(d>0&&d<31))
			return true;
		else if(m==2&&d>0){
			if(((y%400==0) || (y%4==0&&y%100!=0)) && d<=29)
				return true;
			else if(d<=28)
				return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		try{
			int y,m,d;
			System.out.print("YEAR:");
			y=input.nextInt(); 
			System.out.print("MONTH:");
			m=input.nextInt();
			System.out.print("DATE:");
			d=input.nextInt();
			date day=new date(y,m,d);
			if(day.Check()==true){
				System.out.println(y+","+m+","+d+"RIGHT!");
			}
			else{
				System.out.println(y+","+m+","+d+"ERROR!");
			}
		}catch(Exception e){
			System.out.println("ERROR");
		}
		input.close();
	}
}
