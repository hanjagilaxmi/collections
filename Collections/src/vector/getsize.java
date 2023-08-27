package vector;

import java.util.Vector;

public class getsize {
	public static void main(String[] args)
	{
	Vector v=new Vector();
	v.add("Bglore");
	v.add("Vjp");
	v.add("Bgk");
	v.add("Mglore");
	v.add("Bgm");
	System.out.println(v);
	for(int i=0;i<v.size();i++)
	{
		System.out.println(v.get(i));
	}
	}
}
