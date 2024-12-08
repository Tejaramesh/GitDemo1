package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "Ramesh N V");
		hm.put(1, "Yashoda R");
		hm.put(2, "Kiran R");
		hm.put(3, "Teja Ramesh");
		
		//System.out.println(hm.get(3));
		Set sn=hm.entrySet();
		
		Iterator it=sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry) it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		
		
	}

}
