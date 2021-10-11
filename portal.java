

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;



public class portal {
	
	


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("CoWin Portal intialized.....");
		System.out.println("-------------------------------------");
		System.out.println("1.Add Vaccine");
		System.out.println("2.Register Hospital");
		System.out.println("3.Register Citizen");
		System.out.println("4.Add Slot for Vaccination");
		System.out.println("5.Book Slot for Vaccination");
		System.out.println("6.List all slots for a hospital");
		System.out.println("7.Check Vaccination Status");
		System.out.println("8.Exit");
		System.out.println("-------------------------------------");
		int n = s.nextInt();
		
        if (n==1) {
			add_vaccine();
		}
		if (n==2) {
			register_hospital();
		}
		if (n== 3) {
			register_citizen();
		}
		if (n==4) {
			create_slot();
		}
		if (n==6) {
			list_hospital();
		}
		
		}
	public static void register_citizen() {
		Scanner s = new Scanner(System.in);

		System.out.println("Citizen Name: ");
		String name = s.next();
		System.out.println("Age: ");
		int age1 = s.nextInt();
		System.out.println("UniqueID:");
		BigInteger uniqueID1 = s.nextBigInteger();
		System.out.println("Citizen Name: " + name + ", Age: " + age1 + ", Unique ID: " + uniqueID1);
		if (age1 < 18) {
			System.out.println("Only above 18 are allowed");
			System.out.println("------------------------------------");
			main(null);

		} else {
			System.out.println("------------------------------------");
			citizen u_i = new citizen(name,age1,uniqueID1);
			main(null);
		}
	}
	public static void register_hospital() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Hospital Name: ");
		String hospi_name = s.next();
		System.out.println("PinCode: ");
		int pc= s.nextInt();
		hospital h1 =new hospital(hospi_name, pc);
		System.out.println("Hospital Name: "+hospi_name+", PinCode: "+pc+", Unique ID: "+ 555555+hospital.count );
		System.out.println("------------------------------------");
		main(null);
	}
	public static void add_vaccine() {
		Scanner s = new Scanner(System.in);

		System.out.println("Vaccine Name: ");
		String v_n = s.next();
		
		System.out.println("Number of Doses: ");
		int nofdoses = s.nextInt();
		
		System.out.println("Gap between Doses: ");
		int gapbetweendoses = s.nextInt();
		
		vaccine v1 = new vaccine(v_n, nofdoses,gapbetweendoses);
		System.out.println("Vaccine Name: "+v_n+", Number of Doses: "+nofdoses+", Gap Between Doses: "+ gapbetweendoses);
		System.out.println("------------------------------------");
		main(null);
	}	
	public static void create_slot() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Hospital ID: ");
		int id = s.nextInt();
		System.out.println("Enter number of Slots to be added: ");
		int slot = s.nextInt();
		System.out.println("Enter Day Number: ");
		int day_number = s.nextInt();
		System.out.println("Enter Quantity: ");
		int quanti = s.nextInt();
		System.out.println("Select Vaccine: ");
		System.out.println("0. Covax");
		System.out.println("1. Covi");
		int sel = s.nextInt();
		slot s1 = new slot(day_number, quanti, id, citizen.unique_array[citizen.how_many_citizen] );
		if (sel ==0) {
			System.out.println("Slot added by the Hospital "+id+ " for Day "+day_number+
					", Available Quantity: "+ quanti+" of Vaccine Covax"  );
			System.out.println("------------------------------------");
			main(null);
		}else if(sel==1) {
			System.out.println("Slot added by the Hospital "+id+ " for Day "+day_number+
					", Available Quantity: "+ quanti+" of Vaccine Covi"  );
			System.out.println("------------------------------------");
			main(null);
		}
	}
	public static void book_slot() {
		Scanner s  = new Scanner(System.in);
		System.out.println("Enter patient Unique ID: ");
		BigInteger a = s.nextBigInteger();
		System.out.println("1. Search by area");
		System.out.println("2.Search by Vaccine");
		System.out.println("3.Exit");
		System.out.println("Enter option: ");
		int x = s.nextInt();
		if(x==1) {
			System.out.println("Enter PinCode: ");
			int pinco = s.nextInt();
			System.out.println();
		}
	}
	public static void list_hospital() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Hospital ID: ");
		int hos_id = s.nextInt();
		
	}
 }


