package com.corporate.deliver.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import org.hibernate.Query;

public class XX {
	public static void main(String[] args) throws ParseException {
		
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		String dayOfWeek =new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		System.out.println("dayOfWeek:"+dayOfWeek);
		System.out.println("dayOfWeek:"+dayOfWeek.toLowerCase());
		
		/*//get Today date
		Calendar calendar = Calendar.getInstance();//This method is used with calendar object to get the instance of calendar according to current time zone set by java runtime environment
		calendar.getTimeZone();
		Date date = calendar.getTime();	
		System.out.println("Today:"+date);
		
		System.out.println(date.getHours()+date.getMinutes()+date.getSeconds());
		
		System.out.println(calendar.getTimeZone());
		
		//get day name
		String dayOfWeek =new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		System.out.println("dayOfWeek:" + dayOfWeek);
		
		//get yesterday date
		calendar.add(Calendar.DATE, -1);
		System.out.println("Yesterday:"+calendar.getTime());
		
		//get yesterday date
		calendar.add(Calendar.DATE, +1);
		System.out.println("tomorrow :"+calendar.getTime());*/
		
		//Date date = new Date() ;
		/*String dayOfWeek;
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println("date:"+date);
		System.out.println("calender:"+calendar.getTime());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm") ;
		dateFormat.format(date);
		
		System.out.println(dateFormat.format(date));

		if(dateFormat.parse(dateFormat.format(date)).after(dateFormat.parse("14:53"))){
			
			calendar.add(Calendar.DATE, +1);
			date = calendar.getTime();
			System.out.println("First block date:"+date);
			dayOfWeek =new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		    System.out.println("Current time is greater than 14.53 " + dayOfWeek);
		    
		}else{
			System.out.println("Else block date:"+date);
			dayOfWeek =new SimpleDateFormat("EE", Locale.ENGLISH).format(date.getTime());
		    System.out.println("Current time is less than 14.53 " + dayOfWeek);
		}
		
		System.out.println(dayOfWeek+" dayOfWeek");
		*/
	}

}
