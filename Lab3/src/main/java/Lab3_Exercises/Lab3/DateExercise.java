package Lab3_Exercises.Lab3;
import java.time.*;
import java.util.*;
/**
 * 
 * @author Y.K.Sai Ramya
 * To convert string into system date format
 *
 */
public class DateExercise {

		private static String date(String date)
		{
			StringBuilder sb = new StringBuilder("");
			String []words=date.split(" ");
			String dt=date.substring(0,2);
			int d=Integer.parseInt(dt);
			String month=words[1];
			String year=words[2];
			int mn=0;
			if(month.equals("January"))
				mn=1;
			else if(month.equals("February"))
				mn=2;
			else if(month.equals("March"))
				mn=3;
			else if(month.equals("April"))
				mn=4;
			else if(month.equals("May"))
				mn=5;
			else if(month.equals("June"))
				mn=6;
			else if(month.equals("July"))
				mn=7;
			else if(month.equals("August"))
				mn=8;
			else if(month.equals("September"))
				mn=9;
			else if(month.equals("October"))
				mn=10;
			else if(month.equals("November"))
				mn=11;
			else if(month.equals("December"))
				mn=12;
			dt=d+"/"+mn+"/"+year;
			return dt.toString();
		}

		public static void main(String[] args) {

		    String date="24th September 1998";
		    System.out.print(date(date));
			}
}
		