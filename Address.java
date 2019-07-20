import java.util.InputMismatchException;
import java.util.Scanner;

public class Address extends State {
	private int streetNumber;//house or business number
	private String streetName;
	private String streetType;
	private String city;
	private int zipCode;
	
	
	// Constructor
public Address(String stateCode, String stateDescription, int streetNumber, String streetName, String streetType, String city,
			int zipCode) {
		super(stateCode, stateDescription);
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setStreetType(streetType);
		setCity(city);
		setZipCode(zipCode);
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		int length = String.valueOf(zipCode).length();
		if (length <= 5) {
			this.streetNumber = streetNumber;
		}
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		streetName = streetName.toLowerCase();
		streetName = Character.toUpperCase(streetName.charAt(0)) + streetName.substring(1);
		this.streetName = streetName;
	}

	public String getStreetType() {
		return streetType;
	}

	public void setStreetType(String streetType) {
		streetType = Character.toUpperCase(streetType.charAt(0)) + streetType.substring(1);
		this.streetType = streetType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		city = Character.toUpperCase(city.charAt(0)) + city.substring(1);
		this.city = city;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		Scanner input = new Scanner(System.in);
		int length = 0;//makes zipCode a String and gets its length
		boolean good = false;
		do {
			try {
				System.out.print("Zip code: ");
				zipCode = input.nextInt();
			length = String.valueOf(zipCode).length();
		if (length == 5) {
			good = true;
			
		}else{
			System.out.println("Check the zip code. ");
			good = false;
		}//end if else
			}catch(InputMismatchException i) {
			System.out.println("Invalid Input! Use numbers only.");	
			}catch (NumberFormatException n) {
				System.out.println("Incorrect Input!");
			}//end try catch
		}while(!good);
		this.zipCode = zipCode;
	}
	
		@Override
	public String toString() {
		return "Address: \n" + streetNumber + " " + streetName + " " + streetType
				+ "\n" + city + ", " + super.toString() +  zipCode + "\n";
	}
	
	// add equals method after implementing state
}