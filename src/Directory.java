import java.util.*;

public class Directory {

	public static void main(String[] args) {
		boolean exit = false;
		String selection;
		Scanner sc = new Scanner(System.in);
		LinkedList<Record> phoneDirectory = new LinkedList<Record>();
		System.out.println("[][][][][][] Phone Directory [][][][][][]\n\n");
		do {
			selection = null;
			showMenu();
			selection = sc.next();

			if (selection.equalsIgnoreCase("a")) {
				if (phoneDirectory.size() == 0) {
					System.out.println("Your phone directory is empty.");
				} else {
					System.out.println("First Name\t\tLast Name\t\tPhone Number");
					System.out.println("_________________________________________________________________");
					for (int i = 0; i < phoneDirectory.size(); i++) {
						System.out.println(phoneDirectory.get(i).firstName + "\t\t" + phoneDirectory.get(i).lastName + 
								"\t\t" + phoneDirectory.get(i).phoneNumber);
								
					}
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
