package lesson2extended;

public class Man{
	protected String name;
	protected String surname;
	public void setName(String newName){
		name = newName;
	}

	public String getName(){
		return name;
	}

	public void setSurname(String newSurname){
		surname = newSurname;
	}

	public String getSurname(){
		return surname;
	}
}