package practice;

public class NumberToDate {

	public static void main (String [] args) {
		System.out.println(getDate(32));
	}
	
	public static String getDate (int num) {
		String month;
		Integer day = 0;
		String dayString;
		if (num <= 31) {
			month = "January";
			day = num;
		} else if (num <= 59) {
			month = "February";
			day = num - 31;
		} else if (num <= 90) {
			month = "March";
			day = num - 59;
		} else if (num <= 120) {
			month = "April";
			day = num - 90;
		} else if (num <= 151) {
			month = "May";
			day = num - 120;
		} else if (num <= 181) {
			month = "June";
			day = num - 151;
		} else if (num <= 212) {
			month = "July";
			day = num - 181;
		} else if (num <= 243) {
			month = "August";
			day = num - 212;
		} else if (num <= 273) {
			month = "September";
			day = num - 243;
		} else if (num <= 304) {
			month = "October";
			day = num - 273;
		} else if (num <= 334) {
			month = "November";
			day = num - 304;
		} else {
			month = "December";
			day = num - 334;
		}
		dayString = day.toString();
		String [] result = new String [] {month, dayString};
		return result[0] + " " + result[1];
	}
}

