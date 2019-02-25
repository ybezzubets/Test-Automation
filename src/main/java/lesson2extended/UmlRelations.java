package lesson2extended;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Iterator;

public class UmlRelations{
	public static void main(String[] args){

	    Employee sysEngineer = new Employee("John", "Connor", "Manager");
	    Employee director = new Employee("Федор", "Дубов", "Директор");
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
	    Department programmersDepartment = new Department("Программисты");
	    programmersDepartment.addEmployee(sysEngineer);
	    sysEngineer.setPosition("Сторож");
	    // смотрим ранее занимаемые должности:
	    System.out.println("В прошлом работал как:");
	    Iterator<PastPosition> iter = sysEngineer.getPastPosition().iterator();
	    while(iter.hasNext()){
	    System.out.println( ((PastPosition) iter.next()).getName());
	 }
	    System.out.println("Относится к отделу "+sysEngineer.getDepartment().getName());
	    System.out.println(sysEngineer.getName() +" работает в должности "+ sysEngineer.getPosition());
	    System.out.println("Удостовирение действует до " + sysEngineer.getIdCard().getDateExpire());
	    System.out.println("Может находиться в помещеньях:");
	    Iterator<Room> iter1 = sysEngineer.getRoom().iterator();
	    while(iter1.hasNext()){
	    System.out.println( ((Room) iter1.next()).getNumber());
		}
	    Employee employees[] = new Employee[10];
	    employees[0]= sysEngineer;
	    employees[1] = director;
	    Menu.showEmployees(employees);
	}
}