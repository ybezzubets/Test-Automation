package lesson2extended;

public class Employee extends Man{
	private String position;
	public Employee(String n, String s, String p){
		name =n;
		surname = s;
		position =p;
	}
	
	public void setPosition(String newProfession){
		position = newProfession;
	}
	
	public String getPosition(){
		return position;
	}
}