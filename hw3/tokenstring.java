package homework3;

import java.util.*;

public class tokestring {
	public static void main(String[] args) {
		int count=0;
		 System.out.print("Input string：");//要求使用者連續輸入字串
	        Scanner input = new Scanner(System.in);
	        String line = input.nextLine();
	        line=line.toLowerCase();//大寫轉小寫
	        String[] tokens = line.split(" |\\,|\\.|\\!|\\?");//依標點符號隔開
	        Arrays.sort(tokens);//請依字串大小由小到大排列
	        for(String a : tokens)
	        {        	
	        	try {
	        		int i = Integer.parseInt(a);
	        		count=i+count;
	        		} catch(Exception e) {
	        			Set<String> words = new HashSet<>();//將未出現過的單字存入陣列
	        	        for(String b : tokens) {	        	        	
	        	            words.add(b);
	        	        }	        	        
	        	        System.out.printf("total:%d:,count:%d,%s%n",words.size(),count,words);//最後請印出陣列內容，請依字串大小由小到大排列
	        		}
	        			
	        			
	        }
	        
       
       input.close();
   }   
}
