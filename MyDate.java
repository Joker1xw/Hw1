public class MyDate{
	private int my_date_;

	public MyDate(int date) {
		SetMyDate(date);
	}
	
	public MyDate(String date) {
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
	}

	public int GetMyDate() {
		return my_date_;
	}

	public String GetMyDateString() {
		//please return a date string in the format yyyymmdd
		System.out.println("Hello World");
		return String.valueOf(my_date_);
	}

	public String GetMyDateString1() {
		//please return a date string in the format of mm/dd/yyyy
		return "";
	}

	public String GetMyDateString2() {
		//please return a date string in the format of dd/mm/yyyy
		return "";
	}

	public boolean IsLeapYear(int year) {
		//please return true if the year is a leap year
		//return false if the year is not a leap year		
		
		boolean isALeapYear;
		
	     // divisible by 4
		isALeapYear = (year % 4 == 0);
        
        return isALeapYear;
	}


}
