import java.math.BigInteger;
import java.util.Scanner;

public class citizen {
	String Name;
	int age;
	BigInteger uniqueID;
	int how_many_citizen = 0;
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

	public static void register_citizen(String Name, int age, BigInteger uniqueID) {
		Scanner s = new Scanner(System.in);

		System.out.println("Citizen Name: ");
		String name = s.next();
		System.out.println("Age: ");
		int age1 = s.nextInt();
		System.out.println("UniqueID:");
		long uniqueID1 = s.nextLong();
		System.out.println("Citizen Name: " + name + ", Age: " + age1 + ", Unique ID: " + uniqueID1);
		if (age1 < 18) {
			System.out.println("Only above 18 are allowed");
			System.out.println("------------------------------------");

		} else {
			System.out.println("------------------------------------");

		}
	}

}
