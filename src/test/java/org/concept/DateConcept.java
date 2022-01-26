package org.concept;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConcept {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-YY");
		String format = sdf.format(date);
		System.out.println(format);
		
	}

}
