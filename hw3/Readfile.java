package homework3;
import java.io.*;
import java.util.*;

public class Readfile {
	 public static void main(String args[])throws Exception{
		 Scanner input=new Scanner(System.in);
		 HashMap map = new HashMap();
		 String s=" ";
		 int opt=0;
		 int count=0;
		 FileReader fr = new FileReader("D:/1.txt");
	     BufferedReader br = new BufferedReader(fr);
	     while (br.ready()) {
	    	             s=br.readLine();
	    	             map.put(s,br.readLine());
	    }
	     fr.close();
	     while(true)
	     {
	    	 System.out.println("1)Input 2)Output -1)End");
	    	 opt=input.nextInt();
	    	 if(opt==1)
	    	 {
	    		System.out.print("Input string��");//Ҫ��ʹ�����B�mݔ���ִ�
	 	        String line = input.next();
	 	        line=line.toLowerCase();//���DС��
	 	        String[] tokens = line.split(" |\\,|\\.|\\!|\\?");//�����c��̖���_
	 	        Arrays.sort(tokens);//Ո���ִ���С��С��������
	 	       for (int i = 0; i < tokens.length; i++) {
	 	    	  if(map.containsKey(tokens[i])){
	 	                Object temp=map.get(tokens[i]);
	 	                count=Integer.valueOf((String)temp)+1;
	 	                map.put(tokens[i], ++count);
	 	         }else{
	 	            map.put(tokens[i], 1);
	 	         }  
	 	    	 FileWriter fw = new FileWriter("1.txt");
		 	    	for (Object a : map.keySet())	// ��n
					{
						fw.write(a+"\n"+map.get(a)+"\n");
					}
	 	    	    fw.flush();
	 	    	    fw.close();
	 	       }
	    	 }
	    	 else if(opt==2)
	    	 {
	    		 System.out.println("Search String:");	
				 String str=input.next();
				 if(map.get(str)== null)
					 System.out.println("No results");
				 else
				  System.out.printf("%s's count:"+map.get(str),str);	
				 System.out.print("\n");
	    	 }
	    	 else
	    		 break;
	     }
	     
	}

}
