
public class hospital {
	int unique_id;
	int PinCode;
	String Name;
	public hospital(String Name, int PinCode){
		unique_id= (int) (Math.random() * (999999 - 100000 + 1) + 100000);
		this.PinCode= PinCode;
		this.Name = Name;
	}
	

}
