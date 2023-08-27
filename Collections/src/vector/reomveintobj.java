package vector;

import java.util.Vector;

public class reomveintobj {
	public static void main(String[] args)
	{
		System.out.println("***************add(Object obj) and add(int index,Object obj***************)");
		Vector v=new Vector();
		v.add("Bglore");
		v.add("Vjp");
		v.add("Bgk");
		v.add("Mglore");
		v.add("Bgm");
		System.out.println(v);
		v.remove("Mglore");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		
		
	}

}
