package ch06.apps;

import java.util.Iterator;

import ch06.lists.ABList;

public class ABmain implements Cloneable
{

	public static void main(String[] args) 
	{
	/*	ABList<String> indList = new ABList<String>(7);
		indList.add("A");
		indList.add("B");
		indList.add("C");
		indList.add("D");
		indList.add("E");
		indList.add("F");
		indList.add("G");
		
		System.out.println(indList.size() + "\n");
		System.out.println(indList.toString() + "\n");
		
		System.out.println("Test");
		ABList<String> ind1 = (ABList<String>) indList.clone(); System.out.println(ind1.toString());
		ABList<String> ind2 = (ABList<String>) indList.clone(); System.out.println(ind2.toString());
		ABList<String> ind3 = (ABList<String>) indList.clone(); System.out.println(ind3.toString());
		ABList<String> ind4 = (ABList<String>) indList.clone(); System.out.println(ind4.toString());
		ABList<String> ind5 = (ABList<String>) indList.clone(); System.out.println(ind5.toString());
		ABList<String> ind6 = (ABList<String>) indList.clone(); System.out.println(ind6.toString());
		ABList<String> ind7 = (ABList<String>) indList.clone(); System.out.println(ind7.toString());
		ABList<String> ind8 = (ABList<String>) indList.clone(); System.out.println(ind8.toString());
		ABList<String> ind9 = (ABList<String>) indList.clone(); System.out.println(ind9.toString()+ "\n");
		
		//a.
		System.out.println("a.");
		ind1.add(6, "H");
		System.out.println(ind1.size());
		System.out.println(ind1.toString() + "\n");
		
		//b.
		System.out.println("b.");
		ind2.add (7, "H"); 
		System.out.println(ind2.size());
		System.out.println(ind2.toString() + "\n");
		
		//c.
		System.out.println("c.");
		ind3.add (8, "H");
		System.out.println(ind3.size());
		System.out.println(ind3.toString() + "\n");
		
		//d.
		System.out.println("d.");
		ind4.add (6, "H");
		System.out.println(ind4.size());
		System.out.println(ind4.toString() + "\n");
		
		//e.
		System.out.println("e.");
		ind5.add (7, "H"); 
		System.out.println(ind5.size());
		System.out.println(ind5.toString() + "\n");
		
		//f.
		System.out.println("f.");
		ind6.remove ("H"); 
		System.out.println(ind6.size());
		System.out.println(ind6.toString() + "\n");
		
		//g.
		System.out.println("g.");
		ind7.get ("H"); 
		System.out.println(ind7.size());
		System.out.println(ind7.toString() + "\n");
		
		//h.
		System.out.println("h.");
		ind8.remove (-1); 
		System.out.println(ind8.size());
		System.out.println(ind8.toString() + "\n");
		
		//i.
		System.out.println("i.");
		ind9.remove (0); 
		System.out.println(ind9.size());
		System.out.println(ind9.toString() + "\n");
	
		
		ABList<String> strings=new ABList<String> (5);//creating list of strings
		Iterator<String> itr=strings.iterator();//creating iterator
		
		strings.add("Hello");//adding strings to list
		strings.add("my");
		strings.add("name");
		strings.add("is");
		strings.add("alex");
		//for each loop
		for (String hold: strings)
		{
			System.out.println(hold); 
		}
		    
		System.out.println();
		//while loop
		while(itr.hasNext())//iterating using iterator object
		{
			String hold=itr.next();
			System.out.println(hold);
		}
	
		ABList<String> strings=new ABList<String> (5);
		
		strings.add(0, "alpha"); strings.add (0, "gamma"); 
		System.out.println(strings.toString() + "\n");
		strings.add(1, "delta"); strings.add (1, "beta"); 
		System.out.println(strings.toString() + "\n");
		strings.add(1, "alpha"); strings.add (3, "omega");
		System.out.println(strings.toString() + "\n");
		strings.add(2, "pi"); strings.add (1, "comma"); 
		System.out.println(strings.toString() + "\n");
		strings.remove(3);
		System.out.println(strings.toString() + "\n");
		for (String hold: strings) 
	    System.out.println(hold); 
	 */	
		
		ABList<String> sample = new ABList<String>(5);
		
		System.out.println("sample.add(A);");
		sample.add("A"); 
		System.out.println("elements " + sample.toString() + "\n");
		
		System.out.println("sample.add(0,C)");
		sample.add(0,"C"); 
		System.out.println("elements " + sample.toString() + "\n");
		
		System.out.println("sample.add(D)");
		sample.add("D"); 
		System.out.println("elements " + sample.toString() + "\n");
		
		System.out.println("sample.add(A)");
		sample.add("A"); 
		System.out.println("elements " + sample.toString() + "\n");
		
		System.out.println("sample.contains(D)");
		sample.contains("D"); 
		System.out.println("elements " + sample.toString() + "\n");
		
		System.out.println("sample.remove(C)");
		sample.remove("C");
		System.out.println("elements " + sample.toString() + "\n");
		
	
	}

}
