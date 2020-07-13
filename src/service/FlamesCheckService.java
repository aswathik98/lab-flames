package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value
public class FlamesCheckService{
	public char findFlames(String name1, String name2) {
		StringBuffer s1=new StringBuffer(name1);
		StringBuffer s2=new StringBuffer(name2);
		int len1=s1.length();
		int len2=s2.length();
		for(int i=0;i<len1;i++)
		{
			char inS1=s1.charAt(i);
		
			for(int j=0;j<len2;j++)
			{
				char inS2=s2.charAt(j);
				if(inS1==inS2)
				{
					 
					 s1.deleteCharAt(i);
					 s2.deleteCharAt(j);
					
					 len1=s1.length();
					
					 len2=s2.length();
					 i=0;
					 j=0;
					// continue label;
				}
			}

		}
		int len3=len1+len2;
		StringBuffer s3=new StringBuffer("flames");
		String s4=new String();
		for(int i=0;i<5;i++)
		{int n=-1,l=0,p=0;
			for(int j=0;j<len3;j++)
			{
			n++;
			l++;
			
			if(n>s3.length()-1)
				{
//				char e=s3.charAt(p);
				if(l==len3)
					{
					s3.deleteCharAt(p);
					
					s4=s3.substring(p,s3.length());
					
					s3.delete(p,s3.length());
					
					s3.insert(0,s4);
					
					break;
					}
					else{ p++;
					     if(p==s3.length())
					     p=0;
					     
                        }
				}
			else
				{
//				char e=s3.charAt(n);
				if(l==len3)
					{
					s3.deleteCharAt(n);

					s4=s3.substring(n,s3.length());
				
					s3.delete(n,s3.length());
			    	
					s3.insert(0,s4);
				
			    	break;
					}
				
	    		}

    		}
   		 }
	  
	  
	  char result=s3.charAt(0);
	  return result;
	    
	
	}
}