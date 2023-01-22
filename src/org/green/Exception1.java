package org.green;

public class Exception1 {
		public static void main(String[] args)
    {
			String s="hi";
			int a[]=new int[2];
	try
  {
        
        System.out.println(s.charAt(5));
        a[0]=10;
		a[1]=12;
		a[2]=3;
		a[3]=5;
  }
  catch(ArrayIndexOutOfBoundsException e1)
  {
	  System.out.println(e1.getMessage());
  }
  catch(StringIndexOutOfBoundsException e2)
  {
	  System.out.println(e2);
  }
   catch(Exception e)
  {
		  System.out.println(e.getMessage());

  }
  finally
  {
     System.out.printf(s);
  }
}
}
