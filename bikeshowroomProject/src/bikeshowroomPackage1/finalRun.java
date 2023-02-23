package bikeshowroomPackage1;

import bikeshowroomPackage2.Servicecls;

public class finalRun extends userdetails {

	public static void main(String[] args) {
		welcomePage cl1 = new welcomePage();

		cl1.Welcome();
		cl1.bikes();

		Servicecls redy = new Servicecls();

		
		
		redy.Maintenance();
		redy.serviceuser();
		redy.help();

		
	}

}
