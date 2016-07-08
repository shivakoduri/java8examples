/**
 * 
 */
package com.myproject.examples.java8.dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author shiva koduri
 *
 */
public class ZonedDateTimeExample1 {

	/**
	 * @param args
	 */
	public static void main(String args[]){
	      ZonedDateTimeExample1 ZonedDateTimeExample1 = new ZonedDateTimeExample1();
	      ZonedDateTimeExample1.testZonedDateTime();
	   }
		
	   public void testZonedDateTime(){
		
	      // Get the current date and time
	      ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
	      System.out.println("date1: " + date1);
			
	      ZoneId id = ZoneId.of("Europe/Paris");
	      System.out.println("ZoneId: " + id);
			
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
	   }
	}