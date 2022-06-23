package hust.soict.hedspi.aims.utils;

public class DateUtils {
	public static boolean compare(MyDate date1, MyDate date2) {
		if((date1.getYear()<=date2.getYear()) && (date1.getMonth()<=date2.getMonth()) 
											&& (date1.getDay()<=date2.getMonth())){
			return true;
		}else {
			return false;
		}
		//return true if date1 is earlier than date2 else return false
	}
	
	public static void sortDates(MyDate[] dates) {
		for(int i=0;i<(dates.length-1);i++) {
			for(int j=i;j<dates.length;j++) {
				if(compare(dates[i], dates[j])==false) {
					MyDate tmp=dates[i];
					dates[i]=dates[j];
					dates[j]=tmp;
				}
			}
		}
	}
}
