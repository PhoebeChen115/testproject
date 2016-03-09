package androidtest;

public class sumcounter {
	public static void main (String[] args)
			{
				double a[]={1,2,3,4,5};
				double sum =0.0;
				double average =0.0;
				for(double x:a)
				{
					sum+=x;
				}
				average =sum/a.length;
				System.out.println("Totle:"+sum+"Average"+average);
			}

}
