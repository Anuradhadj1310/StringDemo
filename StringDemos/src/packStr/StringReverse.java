package packStr;

public class StringReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ashish Pohekar";
		//input : Ashish Pohekar
		//output must be: shihsA rakehoP
		String strFName="Is",strLName="Friend";
		String revStr="",fname="";
		char ch;
		String splitStr[]=name.split("\\s");
		
		System.out.println(splitStr[0]);
		System.out.println("**********************"+splitStr[1]);
		
		for(int i=0;i<splitStr.length;i++)
			//for(int i=splitStr.length;i>=0;i--)
		{
			for(int j=0;j<splitStr[i].length();j++)
			{
				ch=splitStr[i].charAt(j);
			
				fname=ch+fname;
			}
			fname=" "+fname;
		}
		//String fname,lname;
		/*
		for(int i=0;i<strFName.length();i++)
		{
			ch=strFName.charAt(i);
			fname=ch+fname; 
			//net disconnected
			
		}
		*/
		System.out.println("Original :"+strFName+" "+strLName);
		System.out.println("Reveresed: "+fname);

	}

}
