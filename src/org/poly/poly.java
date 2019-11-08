package org.poly;

public class poly {
	
	public void ug (String dept)
	
	{
		System.out.println("name of the dept is " +dept);
	}
	
	
  public void pg ()
  {
	  System.out.println("name of the dept is MCA ");
  }
  
  public static void main(String[] args) {
	
	  poly p= new poly();
	  p.pg();
	  p.ug("EEE");
}
}
