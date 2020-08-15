package com.nghianv.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class Main {
	public static void main(String[] args) {
		long miliSeconds = 1595665691277L;
		Date date2 = new Date(miliSeconds);
		System.out.println(date2);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println("1.Theo gio UTC");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
		String strDate = simpleDateFormat.format(miliSeconds);
		System.out.println("\t" + strDate);
		//
		System.out.println("2.Theo gio Japan");
		simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Japan"));
		strDate = simpleDateFormat.format(miliSeconds);
		System.out.println("\t" + strDate);
	}
}
