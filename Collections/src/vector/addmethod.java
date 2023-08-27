package vector;

import java.util.Vector;

public class addmethod {
	public static void main(String[] args)
	{
		System.out.println("***************add(Object obj) and add(int index,Object obj***************)");
		Vector v=new Vector();
		v.add(26);
		v.add(0,'L');
		v.add(true);
		v.add(35.87);
		v.add(2,"Hi");
		System.out.println(v);
		System.out.println(v.capacity());
		
	}

}
