package androidtest;
//Ո׫��һ����ʽ���B�mҪ��ʹ����ݔ���Y�ϣ������W�������c��ɿ�
//ݔ������ʹ���߿����Mһ��ݔ�뾎̖���ҳ������ČW���Y�ϣ�
//���ʹ������ݔ��ɿ��rݔ�벻�ǺϷ��Ĕ����ִ���
//�t��ʽ��횿���ӡ���e�`ӍϢ���Ծ���(��ʾ��NumberFormatException)��
import java.util.Scanner;
public class student_data {
	public static void main (String[] args){
		Scanner input  = new Scanner(System.in);
		int count=0;
		String []name=new String[100];
		int []sroce=new int[100];
		int []id=new int[100];
		while(true)
			{
				System.out.println("1)enter student data 2)search -1)end:");
				int opt = input.nextInt();
				if(opt==1)
				{
					try{
						 System.out.println("Enter student id:");
					        id[count] = input.nextInt();
						 	System.out.println("Enter student name:");
					        name[count] = input.next();
					        System.out.println("Enter student sroce:");
					        sroce[count] = input.nextInt();
					       
					}     
			        catch(Exception e)
					{
						System.out.println("Error:NumberFormatException("+e+")");
					}
			        count=count+1;
				}
				else if(opt==2)
				{
					System.out.println("Enter student id whose you want search:");
					int id2 = input.nextInt();
					for(int a=0;a<count;a++)
					{
						if(id2 ==id[a] )
						{
							System.out.println("No." + id[a] +"\t"+ "Name:" + name[a] +"\t"+ "Sroce:" + sroce[a]);
						}
						else
						{
							System.out.println("ERROR!");
						}
					}
					
				}
				else if(opt==-1)
					break;
				else
					System.out.println("ERROR!");
			}
		input.close();
		}
		

}
