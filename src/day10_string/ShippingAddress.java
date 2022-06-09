package day10_string;
import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Full Name");
        String full_name = input.nextLine();

        System.out.println("Enter your building Number:");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your Street Name;");
        String streetName =input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state name;");
        String stateName = input.nextLine();

        System.out.println("Enter your zip code;");
        String zipCode = input.next();




        System.out.println("full_mane = " + full_name);
        System.out.println("buildingNumber=" + buildingNumber);
        System.out.println(" streetName =" + streetName);
        System.out.println("cityName =" + cityName);
        System.out.println(" stateName =" + stateName);
        System.out.println(" zipCode =" + zipCode);


    }





}
/*    1. Create a class named ShippingAddress and ask the user to:
			1.1 Enter your full name ( nextLine() )
			1.2 Enter your building number ( next() )
			1.3 Enter your Street name ( nextLine() )
			1.4 Enter your city name ( nextLine() )
			1.5 Enter your state ( nextLine() )
			1.6 Enter your zip code ( next() )
	        1.1 Enter your full name ( nextLine() )
	        1.2 Enter your building number ( next() )
	        1.3 Enter your Street name ( nextLine() )
	        1.4 Enter your city name ( nextLine() )
	        1.5 Enter your state ( nextLine() )
	        1.6 Enter your zip code ( next() )

			1.7 Display the shipping address
					Ex:
						Your shipping address is:
							John Smith
							7925 Jones Branch Dr
							McLean, VA 22012
	        1.7 Display the shipping address
	                Ex:
	                    Your shipping address is:
	                        John Smith
	                        7925 Jones Branch Dr
	                        McLean, VA 22012


	2. Create a class named EmployeeInfo and Ask the user to:
			2.1 Enter your full name
			2.2 Enter your age
			2.3 Enter your gender
			2.4 Enter your company name
			2.5 Enter your job title
			2.6 Enter your salary
	        2.1 Enter your full name
	        2.2 Enter your age
	        2.3 Enter your gender
	        2.4 Enter your company name
	        2.5 Enter your job title
	        2.6 Enter your salary

	        Display:
	            Employee's name
	            Employee's age
	            Employee's gender
	            Company name
	            Employee's job title
	            Employee's salary
                                    */