/**
 * 
 */
package com.myproject.examples.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author shiva koduri
 *
 */
public class Java7AndJava8SortCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> names1 = new ArrayList<String>();
	      names1.add("Australia ");
	      names1.add("USA ");
	      names1.add("London ");
	      names1.add("Canada ");
	      names1.add("Dublin ");
			
	      List<String> names2 = new ArrayList<String>();
	      names2.add("Australia ");
	      names2.add("USA ");
	      names2.add("London ");
	      names2.add("Canada ");
	      names2.add("Dublin ");
			
	      Java7AndJava8SortCompare tester = new Java7AndJava8SortCompare();
	      System.out.println("Sort using Java 7 syntax: ");
			
	      tester.sortUsingJava7(names1);
	      System.out.println(names1);
	      System.out.println("Sort using Java 8 syntax: ");
			
	      tester.sortUsingJava8(names2);
	      System.out.println(names2);
	   }
	   
	   //sort using java 7
	   private void sortUsingJava7(List<String> names){   
	      Collections.sort(names, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
	   }
	   
	   //sort using java 8
	   private void sortUsingJava8(List<String> names){
	      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	   }
		
	   /**
	    *  Output
	    * 
	    * Sort using Java 7 syntax: 
[Australia , Canada , Dublin , London , USA ]
Sort using Java 8 syntax: 
[Australia , Canada , Dublin , London , USA ]
	    */
}
