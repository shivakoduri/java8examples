/**
 * 
 */
package com.myproject.examples.java8.methodRef;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shiva koduri
 *
 */
public class MethodRefDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List names = new ArrayList();
			
	      names.add("Australia");
	      names.add("USA");
	      names.add("London");
	      names.add("Canada");
	      names.add("Dublin");
	      
			// passed System.out::println method as a static method reference.
	      names.forEach(System.out::println); 
	}

}
