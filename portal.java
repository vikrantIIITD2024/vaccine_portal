
import java.util.Scanner;

//class add_vaccine{
//	public static void a_c(){
//		String 
//	}
//}
public class portal {

	public static void main(String[] args) {

//		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
//		System.out.println("CoWin Portal intialized.....");
//		System.out.println("-------------------------------------");
//		System.out.println(arr[0] + ".Add Vaccine");
//		System.out.println(arr[1] + ".Register Hospital");
//		System.out.println(arr[2] + ".Register Citizen");
//		System.out.println(arr[3] + ".Add Slot for Vaccination");
//		System.out.println(arr[4] + ".Book Slot for Vaccination");
//		System.out.println(arr[5] + ".List all slots for a hospital");
//		System.out.println(arr[6] + ".Check Vaccination Status");
//		System.out.println(arr[7] + ".Exit");
//		System.out.println("-------------------------------------");
		menu();

	}

	public static void menu() {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("CoWin Portal intialized.....");
		System.out.println("-------------------------------------");
		System.out.println(arr[0] + ".Add Vaccine");
		System.out.println(arr[1] + ".Register Hospital");
		System.out.println(arr[2] + ".Register Citizen");
		System.out.println(arr[3] + ".Add Slot for Vaccination");
		System.out.println(arr[4] + ".Book Slot for Vaccination");
		System.out.println(arr[5] + ".List all slots for a hospital");
		System.out.println(arr[6] + ".Check Vaccination Status");
		System.out.println(arr[7] + ".Exit");
		System.out.println("-------------------------------------");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		if (n == 2) {
			register_hospital();
		}

	}

	public static void add_vaccine() {
		Scanner s = new Scanner(System.in);
		System.out.println("Name of the Vaccine: ");
		String Name = s.next();
		System.out.println("Number of total doses required: ");
		int total_doses_req = s.nextInt();
		System.out.println("Gap Between Doses: ");
		int gap_btw_doses = s.nextInt();
		System.out.println("Added Vaccine: " + Name + " Required Doses: " + total_doses_req + " Gap Between Doses: "
				+ gap_btw_doses);

	}

	public static void register_hospital() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Medical Institutes that you want to register");
		int n_m_i = s.nextInt();
		for (int i = 0; i < n_m_i; i++) {

			System.out.println("Medical Institute Name: ");
			String institute_name = s.next();
			System.out.println("Enter PinCode: ");
			int pincode = s.nextInt();
			int unique = (int) (Math.random() * (999999 - 100000 + 1) + 100000);
			System.out.println(
					"Medical Institute Added " + institute_name + ", PinCode: " + pincode + ", Unique ID: " + unique);
			System.out.println("-------------------------------------");
		
			int j;
			int pc[] = new int[n_m_i];
			int uni_id[] = new int[n_m_i];
			String h_name[] = new String[n_m_i];
			for (j = 0; j < n_m_i; j++) {
				pc[j] = pincode;
				uni_id[j] = unique;
				h_name[j] = institute_name;


			}
			System.out.println("Medical Institute: " + h_name[j] + ", Pincode: " + pc[j] + ", Unique ID: " + uni_id[j]);
		}	
			
		
		

	}

}
