package packStr;

public class StringReverse {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Ashish Pohekar";
		String revStr="",fname="";
		char ch;
		String splitStr[]=name.split("\\s");
		
		System.out.println(splitStr[0]);
		System.out.println("**********************"+splitStr[1]);
		System.out.println("**********************"+splitStr.length);
			for(int i=splitStr.length-1;i>=0;i--)
			{{
					int len=splitStr[i].length();
					System.out.println("Length :  "+len+"======"+splitStr[i]);
				for(int j=0;j<len;j++)
				{
					ch=splitStr[i].charAt(j);
				
					fname=ch+fname;
				}
				fname=" "+fname;
			}
		}
		System.out.println("Reveresed: "+fname);

	}

}
