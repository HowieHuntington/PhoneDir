import java.util.*;
public class Directory {
	
	public static void main(String[]args){
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		LinkedList<Record> PhoneDirectory = new LinkedList<Record>();
		System.out.println("[][][][][][] Phone Directory [][][][][][]\n\n");
		//while(exit == false){
			char selection = 0;
			showMenu();
			
			
			
			
			
			
	//	}
		
	}
	
	public static void showMenu(){
		System.out.println("Please enter a selection and press return key ('q' to quit)\n");
		System.out.println("(a)\tShow all records");
		System.out.println("(d)\tDelete current record");
		System.out.println("(f)\tChange first name in current record");
		System.out.println("(l)\tChange last name in current record");
		System.out.println("(n)\tAdd new record");
		System.out.println("(p)\tChange phone number in current record");
		System.out.println("(q)\tQuit");
		System.out.println("(s)\tSelect an existing record");
	}
	
	/*public Directory(){
		
	}
	
	public void showAllRecords(){
		System.out.println("First Name\t\tLast Name\t\tPhone Number");
		System.out.println("_________________________________________________________________");
		for(int i = 0; i < this.list.size(); i ++){
			System.out.println(this.list.get(i).firstName + "\t\t" + this.list.get(i).lastName + "\t\t" + this.list.get(i).phoneNumber);
		}
	}
	
	public void deletCurrentRecord(){
		
	}
	
	public void firstNameChange(){
		
	}
	
	public void lastNameChange(){
		
	}
	
	public void addNewRecord(String firstName, String lastName, String phoneNumber){
		Record record = new Record(firstName, lastName, phoneNumber);
		this.list.add(record);
	}
	
	public void phoneNumberChange(){
		
	}
	
	public void quit(){
		
	}
	
	public void changeCurrentRecord(){
		
	}
	
	*/
	
	
	

}
