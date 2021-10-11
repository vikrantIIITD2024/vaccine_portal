import java.util.Scanner;

public class vaccine {
	String Name;
	int number_of_doses;
	int gap;
	int counter = 0;
	public static String[] name = new String[50];
	public static int[] name_of_doses = new int[50];
	public static int[] number_doses = new int[50];
	public static int[] gap_between = new int[50];

	public vaccine(String Name, int number_of_doses, int gap) {
		this.Name = Name;
		this.number_of_doses = number_of_doses;
		this.gap = gap;
		name[counter] = Name;
		name_of_doses[counter] = number_of_doses;
		gap_between[counter] = gap;

	}

	

}
