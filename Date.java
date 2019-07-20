
import java.util.InputMismatchException;
import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;

	public Date(int month, int day, int year) {
		setYear(year);
		setMonth(month);
		setDay(day, month, year);
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		boolean good = true; // flag to exit loop
		Scanner input = new Scanner(System.in);

		do {
			do {
				good = false;
				try {
					System.out.println("Date of Birth \nmonth: ");
					month = input.nextInt();
					if (month < 1 || month > 12) {
						System.out.println("Invalid month! Enter an integer between 1 and 12");
						good = true;
					} // end if
				} catch (InputMismatchException x) { // prevents user from entering a letter
					System.out.println("Invalid input! Enter an integer between 1 and 12");
					good = true;
				} catch (NumberFormatException ne) {
					System.out.println("Incorrect Input!");
					good = true;
				}//end try catch
			} while (good);
		} while (month < 1 && month > 12);
		this.month = month;
	}// end setMonth

	public int getDay() {
		return day;
	}// end getDate

	public void setDay(int day, int month, int year) {
		boolean good = true;
		boolean isLeapYear = false;
		Scanner input = new Scanner(System.in);
		
		// checking for leap year
		isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)); 
		do {
			try {
				good = false;
				System.out.println("Date of Birth \nday: ");
				day = input.nextInt();
				// checking for months with 31 days
				if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) { 
					if (day < 1 || day > 31) {
						System.out.println("Invalid day! This month has 31 days");
						good = true;
					} // end if
				} // end if
				// checking for months with 30 days
				if (month == 4 || month == 6 || month == 9 || month == 11) { 
					if (day < 1 || day > 30) {
						System.out.println("Invalid day! This month has 30 days");
						good = true;
					} // end inner if
				} // end if
				// checks if month is February
				if (month == 2 && !isLeapYear) { 
					if (day < 1 || day > 28) {
						System.out.println("Invalid day! This month has 28 days");
						good = true;
					} // end inner if
				} // end if
				// checks if month is February during leap year
				if (month == 2 && isLeapYear) { 
					if (day < 1 || day > 29) {
						System.out.println("Invalid day! This month has 29 days, " + year + " is a leap year");
						good = true;
					} // end inner if
				} // end if
			} catch (InputMismatchException x) { // prevents user from inputing a letter
				System.out.println("Invalid input! Enter a digit ");
				good = true;
			} catch (NumberFormatException ne) {
				System.out.println("Incorrect Input!");
				good = true;
			}//end try catch
		} while (good);//end do while
		this.day = day;
	}// end setDay

	public int getYear() {
		return year;
	}// end getYear

	public void setYear(int year) {
		boolean good = true; // flag for do while, in case user's input is incorrect 
		Scanner input = new Scanner(System.in);
		do {
			do {
				try { // Exception for character input
					int count = 0;
					int checkYear = 0;
					good = false;
					System.out.println("Date of Birth \nyear: ");
					year = input.nextInt();

					checkYear = year;

					while (checkYear > 0) { // Makes sure the user enter 4 numeric digits
						checkYear = checkYear / 10;
						count = count + 1;
					}//end while

					if (count != 4) { // If more than or less than 4 digits have been entered
						if (count < 4) {
						System.out.println(
								"You have entered too few digits! Use 1234 as year format");
						}else {
							System.out.println(
									"You have entered too many digits! Use 1234 as year format");
						}//end if else
						good = true;
					}else if (year > 2019) { 
						System.out.println("Please, enter a value between 1900 - 2019");
						good = true;
					}else if (year < 1900) {
						System.out.println("Please enter a value between 1900 - 2019");
						good = true;
					} // end else if
				} catch (InputMismatchException x) {
					System.out.println("Invalid input! use 1234 as year format");
					good = true;
				} catch (NumberFormatException ne) {
					System.out.println("Incorrect Input!");
					good = true;
				}//end try catch
				// input.nextLine(); // flush
			} while (good);
		} while (year > 2019 && year < 1900);
		this.year = year;
	}// end setYear

	public String toString() {
		String result;
		result = month + "/" + day + "/" + year;
		return result;
	}// end toString

}// end Date Class
