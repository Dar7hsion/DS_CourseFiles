package ch08.apps;

import ch08.maps.ArrayListMap;
import ch08.maps.MapEntry;
import ch08.maps.MapInterface;

public class testHW8 {

	public static void main(String[] args) 
	{
		MapInterface<String, String> birthList = new ArrayListMap<String, String>();

		System.out.println(birthList.isEmpty());

		System.out.println(birthList.size());

		System.out.println(birthList.put("Arun","27Mar1994"));

		System.out.println(birthList.put("Karan","27Apr1999"));

		System.out.println(birthList.put("Arun","17May2000"));

		System.out.println(birthList.put("Arunima","29Sep1993"));

		System.out.println(birthList.put("Manisha","08Mar1997"));

		System.out.println(birthList.isEmpty());

		System.out.println(birthList.size());

		System.out.println(birthList.contains("Arunima"));

		System.out.println(birthList.get("Karan"));

		for (MapEntry<String, String> m: birthList)

		System.out.println(m.getValue() + "\t");
		
		System.out.println();
		
		MapInterface<String, Integer> popList = new ArrayListMap<String, Integer>();

		System.out.println(popList.isEmpty());

		System.out.println(popList.size());

		System.out.println(popList.put("India",1326801576));

		System.out.println(popList.put("China", 1382332323));

		System.out.println(popList.put("US",324118787));

		System.out.println(popList.put("Brazil",209587816));

		System.out.println(popList.put("Bangladesh",162285652));

		System.out.println(popList.isEmpty());

		System.out.println(popList.size());

		System.out.println(popList.contains("China"));

		System.out.println(popList.get("India"));

		for (MapEntry<String, Integer> m: popList)

		System.out.println(m.getValue() + "\t");
		System.out.println();
		MapInterface<Integer, String> polyList = new ArrayListMap<Integer, String>();

		System.out.println(polyList.isEmpty());

		System.out.println(polyList.size());

		System.out.println(polyList.put(1,"Triangle"));

		System.out.println(polyList.put(6,"Hexagon"));

		System.out.println(polyList.put(5,"Pentagon"));

		System.out.println(polyList.put(8,"Octagon"));

		System.out.println(polyList.put(4,"Quadrilateral"));

		System.out.println(polyList.isEmpty());

		System.out.println(polyList.size());

		System.out.println(polyList.contains(6));

		System.out.println(polyList.get(5));

		for (MapEntry<Integer, String> m: polyList)

		System.out.println(m.getValue() + "\t");

	}

}
