package utils;

import java.sql.Date;

public class commonUtils {
	
	public static final int IMPLICIY_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=15;
	public static final int IMPLICIT_WAIT_BASIC_TIME=30;

	public static String getEmailWithTimeStamp() {
		Date date=new Date(0);
		return "pvenka"+date.toString().replace(" ","_").replace(":","_")+"@gmail.com";
	}
}
