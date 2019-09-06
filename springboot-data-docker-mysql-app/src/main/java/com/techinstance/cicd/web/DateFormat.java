package com.techinstance.cicd.web;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateFormat {

	public static void main(String[] args) {
		 SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		   
		        String s = new String("20190102");
		        Long l = Long.parseLong(s);
		        System.out.println(l);
		   
	}

}
