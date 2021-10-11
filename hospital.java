public class hospital {
	int unique_id;
	int PinCode;
	public static int count= 0;
	String Name;
	public static String[] name_hospital = new String[50];
	public static int[] pincode = new int[50];
	public hospital(String Name, int PinCode){
		unique_id= 555555+1;
		this.PinCode= PinCode;
		this.Name = Name;
		name_hospital[count] = Name; 
		pincode[count] = PinCode;		
	}
}
