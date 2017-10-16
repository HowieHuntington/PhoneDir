import java.util.*;

public class Directory {
	private static LinkedList<Record> phoneDirectory = new LinkedList<Record>();

	public static void main(String[] args) {
		boolean exit = false;
		String selection;
		String first;
		String last;
		String phone;
		String updateFirstName;
		String updateLastName;
		String updatePhoneNumber;
		int count = -1;
		Scanner sc = new Scanner(System.in);
		// LinkedList<Record> phoneDirectory = new LinkedList<Record>();

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
						System.out.println(phoneDirectory.get(i).firstName + ", " + phoneDirectory.get(i).lastName
								+ ", " + phoneDirectory.get(i).phoneNumber);

					}
				}
			}

			else if (selection.equalsIgnoreCase("d")) {
				if (phoneDirectory.size() == 0) {
					System.out.println("\n\nYour phone directory is empty.\n");

				} else {
					phoneDirectory.remove(count);
					count = -1;
				}

			}

			else if (selection.equalsIgnoreCase("f")) {
				if (count < 0) {
					System.out.println("\n\nPlease Select a Record\n");
				} else {
					System.out.println("Enter the new 'First Name' field.");
					updateFirstName = sc.next();
					phoneDirectory.get(count - 1).setFirstName(updateFirstName);
				}
			}

			else if (selection.equalsIgnoreCase("l")) {
				if (count < 0) {
					System.out.println("\n\nPlease Select a Record.\n");
				} else {
					System.out.println("Enter the new 'Last Name' field.");
					updateLastName = sc.next();
					phoneDirectory.get(count - 1).setLastName(updateLastName);
				}
			}

			else if (selection.equalsIgnoreCase("n")) {
				Record rec = new Record();
				System.out.println("\nNew Record\n\nFirst Name: ");
				first = sc.next();
				rec.setFirstName(first);
				System.out.println("Last Name: ");
				last = sc.next();
				rec.setLastName(last);
				System.out.println("Phone Number: ");
				phone = sc.next();
				rec.setPhoneNumber(phone);
				phoneDirectory.add(rec);
				count = phoneDirectory.size() - 1;
			}

			else if (selection.equalsIgnoreCase("p")) {
				if (count < 0) {
					System.out.println("\n\nPlease Select a Record.\n");
				} else {
					System.out.println("Enter the new 'Last Name' field.");
					updatePhoneNumber = sc.next();
					phoneDirectory.get(count - 1).setPhoneNumber(updatePhoneNumber);
				}

			}

			else if (selection.equalsIgnoreCase("q")) {
				System.out.println("GoodBye!");
				exit = true;
			}

			else if (selection.equalsIgnoreCase("s")) {

				count = search(phoneDirectory);

			}
			System.out.println(count);
		} while (exit == false);

	}

	public static int search(LinkedList<Record> l) {
		Scanner sc = new Scanner(System.in);
		String searchFirst;
		String searchLast;
		int testCount = 0;

		System.out.println("Enter First Name: ");
		searchFirst = sc.next();
		System.out.println("Enter Last Name: ");
		searchLast = sc.next();

		for (int i = 0; i < l.size(); i++) {
			if (l.get(i).getFirstName().equals(searchFirst) && l.get(i).getLastName().equals(searchLast)) {
				// testCount = i;
				// break;
				testCount = i;
			} else {
				testCount = -1;
			}

		}
		return testCount;
		// return testCount;
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

}
