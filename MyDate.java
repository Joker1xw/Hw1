public class MyDate {
	
	private int my_date_;
	private String my_date;
	
	public MyDate(String date) {
		
		String formatted = date.substring(6,10) + "" + date.substring(3,6) + "" + date.substring(0,3);
		int integer_date = Integer.valueOf(formatted.replace("/", ""));
		
		SetMyDate(integer_date);
		SetMyDate(date);
	}

	public void SetMyDate(int date) {
		//assume that the date will be in the format yyyymmdd
		//date is an integer
		my_date_ = date;
	}
	
	public void SetMyDate(String date) {
		//assume that the date will be in the format mm/dd/yyyy
		String month = date.substring(0, 2);
		String day = date.substring(3, 5);
		String year = date.substring(6, 10);
		String date_ymd = year + month + day;
		my_date_ = Integer.valueOf(date_ymd);
		my_date = date;
	}

	public int GetMyDate() {
		return my_date_;
	}
	
	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd		
		String formatted = my_date.substring(6,10) + "" + my_date.substring(0,3) + "" + my_date.substring(3,6);		
		return formatted.replace("/", "");
	}
	
	public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy 
		String formatted = my_date.substring(0,3)+ "" + my_date.substring(3,6) + "" + my_date.substring(6,10) ;
		return formatted;
	}
	
	public String GetMyDateString2() {
		//please return a date string in the format of dd/mm/yyyy
		String formatted = my_date.substring(3,6)+ "" + my_date.substring(0,3)+ "" + my_date.substring(6,10) ;
		return formatted;

	}
	
	public boolean IsLeapYear(int year) {
		//please return true if the year is a leap year
		//return false if the year is not a leap year
        if (year % 400 == 0){
        	return true;
        }else if (year % 4 == 0) {
        	return true;
        }else {
        	return false;
        }

	}
}
