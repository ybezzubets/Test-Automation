package lesson2extended;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class UmlRelations{
	public static void main(String[] args){

	    Employee sysEngineer = new Employee("John", "Connor", "Manager");
	    IdCard card = new IdCard(123);
	    try {
			card.setDateExpire(new SimpleDateFormat("yyyy-MM-dd").parse("2015-12-31"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sysEngineer.setIdCard(card);
		Room room101 = new Room(101);
	    Room room321 = new Room(321);
	    sysEngineer.setRoom(room101);
	    sysEngineer.setRoom(room321);
	    System.out.println(sysEngineer.getName() +" работает в должности "+ sysEngineer.getPosition());
	    System.out.println("Удостовирение действует до " + sysEngineer.getIdCard().getDateExpire());
	    System.out.println("Может находиться в помещеньях:");
	    Iterator<Room> iter = sysEngineer.getRoom().iterator();
	    while(iter.hasNext()){
	         System.out.println( ((Room) iter.next()).getNumber());
		}
	}
}