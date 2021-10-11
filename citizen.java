import java.math.BigInteger;
public class citizen {
	String Name;
	int age;
	BigInteger uniqueID;
	public static int how_many_citizen = 0;
	public static String[] name_array = new String[50];
	public static BigInteger[] unique_array = new BigInteger[50];
	public static int[] age_array = new int[50];
	public citizen(String Name, int age, BigInteger uniqueID) {
		this.Name = Name;
		this.age = age;
		this.uniqueID = uniqueID;
		name_array[how_many_citizen] = Name;
		unique_array[how_many_citizen] = uniqueID;
		age_array[how_many_citizen] = age;
		how_many_citizen++;
	}
}

