package bikeshowroomPackage1;

import java.util.Scanner;

public class userdetails extends bikesandTax implements dd {

	private String username;

	private String address;

	private long contact;

	public String getUsername() {
		return username;

	}

	public void setUsername(String username) {

		this.username = username;

		System.out.println();
	}

	public String getAddress() {

		System.out.println();
		return address;
	}

	public void setAddress(String address) {
		this.address = address;

	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public void help() {

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------");
		System.out.println("If you need help click Enter");

		System.out.println("Type your queries ");

		Scanner queries = new Scanner(System.in);

		String userfeedbackString = queries.nextLine();
		
		
		if(userfeedbackString.isEmpty())
		{
			
			System.out.println("Field is Blank. Type Something");
		}
		
		else
		{

		String store = userfeedbackString;

		System.out.println("User Queries :" + "\n " + store.toUpperCase() + "\n "
				+ "We Will Check and Let You Know -- Thank you.");

	}
	}

	public void about() {

		System.out.println("If We Want To Know About Our Terms & Policy..?? --- About as ");

	}

	@Override
	public void close() {
		System.out.println("Thankyou for te visit");
		
	}

}
