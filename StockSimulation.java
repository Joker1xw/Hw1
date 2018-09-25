public class StockSimulation{
	public static void main(String[] args) {
		MyDate date = new MyDate("02/01/2018");
		
		int year = 2018;
		
		if(date.IsLeapYear(year)) {
			System.out.println(year + " is a leap year");
		}else {
			System.out.println(year + " is not a leap year");
		}
		
		Stock s = new Stock("Facebook", "FB", 178.33, date);
		
		//please check that every get method in the MyDate class is correct
		
		s.getMyDate();
		s.getName();
		s.getSymbol();
		s.getCurrentPrice();
		
	}
}
