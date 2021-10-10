import java.util.HashMap;
import java.util.Scanner;



public class portal {
	HashMap<Integer,hospital> map = new HashMap<Integer,hospital>();
	
	public void register_hospital(String hospi_name, int pode ) {
		
		hospital h1 = new hospital(hospi_name, pode );
		
		
		map.put(h1.unique_id,h1);


}	




	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n!=8) {
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
		}
	  }
}	
	
