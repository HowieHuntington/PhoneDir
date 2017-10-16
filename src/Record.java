/*new program*/
import java.util.*;
public class Record {
	String firstName;
	String lastName;
	String phoneNumber;
	
	public Record(){
		
	}
	
	public Record(String firstName, String lastName, String phoneNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setPhoneNumber(String phoneNumber){
		this.phoneNumber = phoneNumber;
	}
	
	public String toString(){
		return firstName + " " + lastName + " " + phoneNumber;
	}
	
	/*public int compareTo(Record r){
		if(r.lastName.compareTo(this.lastName))
	}*/
	
	

}
