package bikeshowroomPackage1;

import java.util.Scanner;

import bikeshowroomPackage2.*;


public class welcomePage {

	public String welcome = "Welcome To Our WebSite, Our Website helps you to Explore and Ensure the Products Quality and Details";

	public void Welcome() {

		System.out.println(welcome);

	}

	public void bikes() {
		System.out.println("For Booking Enter : 1");

		System.out.println("For Service Enter : 2");

		Scanner serviceoption=new Scanner(System.in);


		int ok=serviceoption.nextInt();

		if(ok==1)
		{



			System.out.println("\n"+"Yes for WithGear /"+"No For Without Gear");

			Scanner gear=new Scanner(System.in);

			String use=gear.nextLine();

			String s="yes";

			String n="no";
			
			String usee=use.toLowerCase().trim();
			
			


			if(usee.equals(s))
			{

				System.out.println("RightNow we are selling YamahaR15 & YamahaMT15.");

				System.out.println("ENTER 1 For YamahaR15");

				System.out.println("ENTER 2 ForYamahaMT15");

				Scanner userin = new Scanner(System.in);

				int op = userin.nextInt();

				System.out.println(op);

				if (op == 1) {

					bikesandTax cl2 = new bikesandTax();

					cl2.r15taxes();

				} else {


					bikesandTax cl3 = new bikesandTax();

					cl3.mt15taxes();

				}
			}

			else if(usee.equals(n))

			{

				System.out.println("RightNow we are selling Yamaha Aerox 155.");

				bikesandTax cl4 = new bikesandTax();

				cl4.AeroxTax();
			}

			else
			{

				System.out.println("Please Enter Yes (or) No");
			}

	
	}
	else
	{
		
		Servicecls redy=new Servicecls();
		
		redy.print();
		
	}

}


	}
