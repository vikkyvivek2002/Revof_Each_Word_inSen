import  java.util.*;
public class Revof_Each_Word_inSen
 {
  
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a String :");
		String a = s.nextLine();
		String w[] =a.split("\\s");
		String rev = "";
		for(int i =0;i < w.length;i++)
		{
			String wo = w[i];
			String r = "";
			for(int j = wo.length()-1; j>=0 ; j--)
			{
				r = r+ wo.charAt(j);
			}
			
			rev = rev + r +" ";
		}
	System.out.println(rev);
	}
	
	
}
