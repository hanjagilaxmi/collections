package vector;

import java.util.Vector;

public class collectionaddall {
	public static void main(String[] args)
	{
		System.out.println("****addAll(Collection c) and addAll(int index,Collection c)****)");
		Vector v=new Vector();
		v.add(26);
		v.add(0,'L');
		v.add(true);
		v.add(35.87);
		v.add(2,"Hi");
		Vector v1=new Vector();
		v1.add(28);
		v1.add(0,'D');
		v1.add(null);
		v1.add(37.87);
		v1.add(2,"Hi");
		System.out.println(v);
		System.out.println(v1);
		v.addAll(2,v1);
		System.out.println(v);
		System.out.println(v1);
		
		
	}
}
