package homework3;

import java.util.*;

public class tokestring {
	public static void main(String[] args) {
		int count=0;
		 System.out.print("Input string��");//Ҫ��ʹ�����B�mݔ���ִ�
	        Scanner input = new Scanner(System.in);
	        String line = input.nextLine();
	        line=line.toLowerCase();//���DС��
	        String[] tokens = line.split(" |\\,|\\.|\\!|\\?");//�����c��̖���_
	        Arrays.sort(tokens);//Ո���ִ���С��С��������
	        for(String a : tokens)
	        {        	
	        	try {
	        		int i = Integer.parseInt(a);
	        		count=i+count;
	        		} catch(Exception e) {
	        			Set<String> words = new HashSet<>();//��δ���F�^�Ć��ִ������
	        	        for(String b : tokens) {	        	        	
	        	            words.add(b);
	        	        }	        	        
	        	        System.out.printf("total:%d:,count:%d,%s%n",words.size(),count,words);//����Ոӡ����Ѓ��ݣ�Ո���ִ���С��С��������
	        		}
	        			
	        			
	        }
	        
       
       input.close();
   }   
}
