import java.util.*;

public class Directory {

	public static void main(String[] args) {
		boolean exit = false;
		String selection;
		String first;
		String last;
		String phone;
		int count = -1;
		Scanner sc = new Scanner(System.in);
		LinkedList<Record> phoneDirectory = new LinkedList<Record>();
		
		
		System.out.println("[][][][][][] Phone Directory [][][][][][]");
		do {
			selection = null;
			System.out.println();
			showMenu();
			System.out.println("\n");
			selection = sc.next();

			if (selection.equalsIgnoreCase("a")) {
				if (phoneDirectory.size() == 0) {
					System.out.println("\n\nYour phone directory is empty.\n");
				} else {
					System.out.println("Current Records:");
					System.out.println();
					for (int i = 0; i < phoneDirectory.size(); i++) {
						System.out.println(phoneDirectory.get(i).firstName + ", " + phoneDirectory.get(i).lastName + 
								", " + phoneDirectory.get(i).phoneNumber);
								
					}
				}
			}
			
			else if(selection.equalsIgnoreCase("d")){
				if(phoneDirectory.size()==0){
					System.out.println("\n\nYour phone directory is empty.\n");
					
				}else{
					phoneDirectory.remove(count);
					count = -1;
				}
				
			}
			
			else if(selection.equalsIgnoreCase("f")){
				if(count<0){
					System.out.println("\n\nPlease Select a Record\n");
				}else{
					System.out.println("Enter the new 'First Name' field.");
					String updateFirstName = sc.next();
					phoneDirectory.get(count).setFirstName(updateFirstName);
				}
			}
			
			else if(selection.equalsIgnoreCase("l")){
				if(count<0){
					System.out.println("\n\nPlease Select a Record.\n");
				}else{
					System.out.println("Enter the new 'Last Name' field.");
					String updateLastName = sc.next();
					phoneDirectory.get(count).setLastName(updateLastName);
				}
			}
			
			else if(selection.equalsIgnoreCase("n")){
				Record rec = new Record();				
				System.out.println("\nNew Record\n\nFirst Name: " );
				first = sc.next();
				rec.setFirstName(first);
				System.out.println("Last Name: ");
				last = sc.next();
				rec.setLastName(last);
				System.out.println("Phone Number: ");
				phone = sc.next();
				rec.setPhoneNumber(phone);
				phoneDirectory.add(rec);
				count= phoneDirectory.size()-1;
			}
			
			else if(selection.equalsIgnoreCase("p")){
				if(count<0){
					System.out.println("\n\nPlease Select a Record.\n");
				}
				
			}

		} while (exit == false);

	}

	public static void showMenu() {
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

	/*
	 * public Directory(){
	 * 
	 * }
	 * 
	 * public void showAllRecords(){
	 * System.out.println("First Name\t\tLast Name\t\tPhone Number");
	 * System.out.println(
	 * "_________________________________________________________________");
	 * for(int i = 0; i < this.list.size(); i ++){
	 * System.out.println(this.list.get(i).firstName + "\t\t" +
	 * this.list.get(i).lastName + "\t\t" + this.list.get(i).phoneNumber); } }
	 * 
	 * public void deletCurrentRecord(){
	 * 
	 * }
	 * 
	 * public void firstNameChange(){
	 * 
	 * }
	 * 
	 * public void lastNameChange(){
	 * 
	 * }
	 * 
	 * public void addNewRecord(String firstName, String lastName, String
	 * phoneNumber){ Record record = new Record(firstName, lastName,
	 * phoneNumber); this.list.add(record); }
	 * 
	 * public void phoneNumberChange(){
	 * 
	 * }
	 * 
	 * public void quit(){
	 * 
	 * }
	 * 
	 * public void changeCurrentRecord(){
	 * 
	 * }
	 * 
	 */

}
