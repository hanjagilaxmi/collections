package vector;

import java.util.Vector;

public class Contains {
	public static void main(String[] args)
	{
	Vector v=new Vector();
	v.add("Bglore");
	v.add("Vjp");
	v.add("Bgk");
	v.add("Mglore");
	v.add("Bgm");
	System.out.println(v);
	System.out.println(v.contains("Mglore"));
	System.out.println(v.size());
	}
	
}
