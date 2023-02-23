package bikeshowroomPackage2;
import java.util.*;
import java.util.Calendar;
import java.util.Formatter;
import java.util.Scanner;

import bikeshowroomPackage1.dd;
import bikeshowroomPackage2.*;

public class Servicecls implements dd {

	public void print() {
		
		
		Formatter fmt=new Formatter();
		
		Calendar cal=Calendar.getInstance();
		
		
		fmt.format("%tc %tp", cal,cal);
		System.out.println("The Current Date and Time :");
		
		System.out.println(fmt+"\n");
		
		
		
		
		

		System.out.println("Service impoted");

		System.out.println("LOCATION - ALAGENDRAN AUTOS YAMAHHA DEALERS MADURAI, KOCHADAI");

		System.out.println("1, For Maintenance " + "\n" + "2, For Milleage");

		Scanner serv = new Scanner(System.in);

		int allow = serv.nextInt();

		if (allow == 1) {
			System.out.println("Maintenance");

		}

	}

	public void Maintenance() {

		try {

			System.out.println("Opens - Monday to Saturday ( 8.AM To 7.PM )");

			System.out.println("SERVICES FOR TWO WHEELER ");

			String name[] = { "* YamahaR15", "* Yamaha MT15", "* Yamaha Fascino", "* Yamaha FZ", "* Aerox 155" };

			for (int i = 0; i < name.length; i++) {
				System.out.println(name[i]);
			}

		}

		catch (Exception e) {
			System.out.println("excption " + e);

		}
	}

	public void serviceuser() {

		System.out.println("Customer Details for Service is mandatory");

		Scanner user = new Scanner(System.in);

		System.out.println("Name :");

		String bike = user.nextLine();

		String fullname = bike;

		System.out.println("Contact");

		int bikee = user.nextInt();

		// ------------------------------

		System.out.println("Bike Model");

		String bikeee = user.nextLine();
		// ------------------------------

		System.out.println("Timming For Schedule");

		String bikeeee = user.nextLine();
		// ------------------------------

		System.out.println("Name   :" + bike + "\n" + ", Contact  : " + bikee + "\n" + " Bike Model   :" + bikeee + "\n"
				+ " Timming" + bikeeee);

		System.out.println("Hi.." + fullname + " Do you Need Help...??");

	}

	@Override
	public void help() {

		System.out.println("What Kind of Issue are you Facing RightNow");

		StringBuffer helpp = new StringBuffer();

		helpp.append("1, Cannot able to Select");

		helpp.append("2, Not Userfriendly");

		helpp.append("3, Not Working Properly");
		
		
		System.out.println("helpp");
		
		
		
		}
		
		
		



	
	public void about() {
		// TODO Auto-generated method stub
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
