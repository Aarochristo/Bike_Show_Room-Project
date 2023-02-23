package bikeshowroomPackage1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class bikesandTax extends welcomePage {

	public final int r15taxe = 170000;

	public final int mt15taxe = 160000;

	public final int aerox155 = 130000;

	public void r15taxes()

	{

		System.out.println("YOU HAVE CHOOSEN R15");
		System.out.println();
		System.out.println("SPECIFICATION FOR R15 :"+"\n");

		HashMap<String, String> map = new HashMap<String, String>();

		map.put("Mileage       --> ", "55");

		map.put("Emission Type --> ", "BS6");

		map.put("Kerb Weight   --> ", "142");

		/*
		 * Iterator<Entry<String,String>>it =map.entrySet().iterator();
		 * 
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */

		for (Entry<String, String> fo : map.entrySet())

		{
			System.out.println(fo.getKey() + fo.getValue());

		}
		System.out.println("-------------------------------------------------------------------------------------------------------");

		System.out.println("TAX :"+"\n");

		int gstvalue = r15taxe * 2 / 100;

		int roadtaxr15 = 3000;

		System.out.println("R15 Prize Without Tax = " + r15taxe);

		System.out.println("GST For R15 Bike      = 2%" + "\n" + "Roadtax For R15       = 3000");

		int TotalAmountr15 = r15taxe + gstvalue + roadtaxr15;

		System.out.println("Total value after gst and road tax = " + TotalAmountr15);

		userdetails cl2=new userdetails();

		cl2.setUsername("mani  ");

		cl2.setAddress("kochadai,madurai ");


		cl2.setContact(90806344655l);   

		System.err.println("UserData  : ");
		System.out.println(cl2.getUsername()+cl2.getAddress()+cl2.getContact());

		cl2.help();

	}

	public void mt15taxes() {

		System.out.println("YOU HAVE CHOOSEN MT15");
		System.out.println();
		System.out.println("SPECIFICATION FOR MT15" + "\n");

		HashMap<String, String> maps = new HashMap<String, String>();

		maps.put("Mileage       ", "50");

		maps.put("Emission Type ", "BS6");

		maps.put("Kerb Weight   ", "150");

		Iterator<Entry<String, String>> iter = maps.entrySet().iterator();

		while (iter.hasNext()) {

			System.out.println(iter.next());

		}



		System.err.println("TAX" + "\n");

		int gstvalue = mt15taxe * 3 / 100;
		int roadtaxr15 = 3000;
		System.out.println("RoadTax                = 3000");

		System.out.println("MT15 Prize Without Tax = " + mt15taxe);
		System.out.println("GST For MT15           = 3%" + "\n" + "Roadtax For mt15          = 2000.");

		int TotalAmountr15 = r15taxe + gstvalue + roadtaxr15;

		System.out.println("Total Value After Gst & Road Tax = " + TotalAmountr15);


		userdetails cl2=new userdetails();
		

		cl2.setUsername("kewin  ");
		
		

		cl2.setAddress("kalavasal,madurai ");
		

		cl2.setContact(90806344655l);   

		System.err.println("UserData  : ");
		System.out.println("Name :"+cl2.getUsername()+",  Place :"+cl2.getAddress()+"Contact :"+cl2.getContact());
		cl2.help();

	}

	public void AeroxTax() {

		System.out.println("YOU HAVE CHOOSEN Aerox 155");
		System.out.println();
		System.out.println("SPECIFICATION FOR Aerox 155" + "\n");

		HashMap<String, String> mapss = new HashMap<String, String>();

		mapss.put("Engine Type -->", "Liquid Cooled");

		mapss.put("Rear Brake  -->", "Drum");

		mapss.put("Milleage    -->", "48");

		mapss.forEach((k, v) -> System.out.println(k + "" + v + "\n"));

		System.out.println(
				"--------------------------------------------------------------------------------------------------");

		System.err.println("\n" + "TAX");


		int gstvalue = mt15taxe * 4 / 100;
		int roadtaxr15 = 3000;


		System.out.println("Your RoadTax Amount          = 2000");

		System.out.println("Aerox 155 Prize Without Tax  = " + aerox155);
		System.out.println("GST For Aerox 155            = 4%" + "\n" + "Roadtax For Aerox 155        = 2000.");

		int TotalAmountr15 = aerox155 + gstvalue + roadtaxr15;

		System.out.println("Total Value After Gst & Road Tax = " + TotalAmountr15);

		userdetails cl2=new userdetails();

		cl2.setUsername("anand  ");

		cl2.setAddress("periyar,madurai ");


		cl2.setContact(90806344655l);   

		System.err.println("UserData  : ");
		System.out.println(cl2.getUsername()+cl2.getAddress()+cl2.getContact());
		cl2.help();


	}

}
