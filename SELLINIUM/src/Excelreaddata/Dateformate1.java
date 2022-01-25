package Excelreaddata;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//import org.apache.poi.ss.util.DateFormatConverter;
import org.testng.annotations.Test;

public class Dateformate1 {
	@Test
	public void getformate() {
		System.out.println("dateformate first==" + getdatefomate("dd/MM/YYYY"));
		System.out.println("dateformate first==" + getdatefomate("YYYY-MM-dd"));
		System.out.println("*****************888");
		System.out.println("after five day date =="+getPastOrFutureDate(5));
		System.out.println("before five day date =="+getPastOrFutureDate(-5));

		comparedate(getdatefomate("dd MM yyyy"),getPastOrFutureDate(0));
	}
	
//	String getPastOrFutureDate(int daysNumber){
//
//	Calendar cal  = Calendar.getInstance();
//    //subtracting or addition a day
//    cal.add(Calendar.DATE, daysNumber);
//
//    SimpleDateFormat s = new SimpleDateFormat("dd MM yyyy");
//    return s.format(new Date(cal.getTimeInMillis()));
//    
//}
	String getPastOrFutureDate(int daysNumber) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, daysNumber);
		SimpleDateFormat s1 = new SimpleDateFormat("dd MM YYYY");

		return s1.format(new Date(cal.getTimeInMillis()));

	}
	
	void comparedate(String date1,String date2) {

	String currentdate=date1;
	String datetobecompared=date2;
	System.out.println("current date=="+date1);
	System.out.println("2nd pas of future compare date  date=="+date2);
if(currentdate.compareTo(datetobecompared)<0) {
	System.out.println("current date occured after date tobe caompared");
}
else if(currentdate.compareTo(datetobecompared)>0) {
	System.out.println("current date occured before date tobe caompared");
}else if(currentdate.compareTo(datetobecompared)==0) {
	System.out.println("current date and date to be compared both are same ");
}	else {
	System.out.println("current date and date to be compared both are not same given formate is invalid ");
}
	}
	String getdatefomate(String format) {

		Date dateobj = new Date();
		System.out.println("default date formate " + dateobj);
		String formats = format;
		SimpleDateFormat dateformate = new SimpleDateFormat(formats);

		return dateformate.format(dateobj);

	}
}
