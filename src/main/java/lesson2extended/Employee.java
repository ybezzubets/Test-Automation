package lesson2extended;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Man{
	private String position;
    private IdCard iCard;
    private Set<Room> room = new HashSet<Room>();
    public Employee(String n, String s, String p){
        name = n;
        surname = s;
        position = p;
    }
    public void setPosition(String newPosition){
        position = newPosition;
    }
    public String getPosition(){
        return position;
    }
    public void setIdCard(IdCard c){
        iCard = c;
    }
    public IdCard getIdCard(){
        return iCard;
    }
    public void setRoom(Room newRoom){
        room.add(newRoom);
    }
    public Set<Room> getRoom(){
        return room;
    }
    public void deleteRoom(Room r){
        room.remove(r);
    }
}