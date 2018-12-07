package exercice4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reservation {
	private Date date;
	private int num;
	
	public Reservation(int num, String date) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
		this.date = f.parse(date);
		this.num = num;
	}
	
	public void setReservation(int num, String date) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
		this.date = f.parse(date);
		this.num = num;
	}
	
	public void setDate(String date) throws ParseException {
		SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy"); 
		this.date = f.parse(date);
	}
	
	public void setNum(int num){
		this.num = num;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int getNum() {
		return num;
	}
	
}
