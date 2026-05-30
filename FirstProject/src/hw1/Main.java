package hw1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Create an instance of the system
		DeliveryDataBase system = new DeliveryDataBase();

		// Create a manager by admin name, username, password
		Admin mainAdmin = new Admin("System Admin", "admin", "12345");

		System.out.println("Loading data into the system...");

		// Creating 5 Riders
		system.addRider(new Rider("123456789", "Adi Ben Shitirt", "050-1010101", "Bicycle", true));
		system.addRider(new Rider("234567890", "Moran Asraf", "052-2020202", "motorcycle", true));
		system.addRider(new Rider("345678901", "Shlomit Golan", "054-3030303", "car", true));
		system.addRider(new Rider("456789012", "Halel Saida", "053-4040404", "car", true));
		system.addRider(new Rider("567890123", "Eliya Saida", "058-5050505", "motorcycle", true));

		// Creating 10 customers
		system.addCustomer(new Customer("1", "Lian", "Saida", "Tiberias", "Hagalil", "1400000", "052-5211311",
				"lian@gmail.com", 0.0));
		system.addCustomer(
				new Customer("2", "May", "Golan", "Haifa", "Hanamal", "3303220", "050-1111111", "may@gmail.com", 0.0));
		system.addCustomer(new Customer("3", "Ron", "Levi", "Tel Aviv", "Dizengoff", "6433221", "054-2222222",
				"ron@gmail.com", 0.0));
		system.addCustomer(
				new Customer("4", "Yael", "Bar", "Acre", "Ben Ami", "9455667", "052-3333333", "yael@gmail.com", 0.0));
		system.addCustomer(new Customer("5", "Omer", "Golan", "Eilat", "Hatmarim", "8800000", "053-4444444",
				"omer@gmail.com", 0.0));
		system.addCustomer(new Customer("6", "Shir", "Bitton", "Ashdod", "Hatzyonot", "7744332", "050-5555555",
				"shir@gmail.com", 0.0));
		system.addCustomer(new Customer("7", "Amit", "Bar", "Tiberias", "Golda Meir", "3455566", "054-6666666",
				"amit@gmail.com", 0.0));
		system.addCustomer(
				new Customer("8", "Noa", "Cohen", "Haifa", "Moriya", "4222333", "052-7777777", "noa@gmail.com", 0.0));
		system.addCustomer(new Customer("9", "Itay", "Shalom", "Tiberias", "Habanim", "1411122", "053-8888888",
				"itay@gmail.com", 0.0));
		system.addCustomer(new Customer("10", "Maya", "Cohen", "Rishon LeZion", "Rotshild", "7522233", "050-9999999",
				"maya@gmail.com", 0.0));

		// Creating 10 regular restaurants
		system.addRestaurant(new Restaurant("R1", "Pizza Bella", "Italian", 4.5, true, 20.0));
		system.addRestaurant(new Restaurant("R2", "Sushi Master", "Asian", 4.2, false, 25.0));
		system.addRestaurant(new Restaurant("R3", "Napis", "Israeli", 4.0, true, 15.0));
		system.addRestaurant(new Restaurant("R4", "Cafe Greg", "Cafe", 4.3, true, 18.0));
		system.addRestaurant(new Restaurant("R5", "Landwer", "Cafe", 4.1, true, 20.0));
		system.addRestaurant(new Restaurant("R6", "Shawarma Hanasi", "Meat", 4.6, true, 15.0));
		system.addRestaurant(new Restaurant("R7", "The Pancake House", "Desserts", 4.4, false, 20.0));
		system.addRestaurant(new Restaurant("R8", "Falafel Hakikar", "Street Food", 4.8, true, 10.0));
		system.addRestaurant(new Restaurant("R9", "Salad Bar", "Healthy", 4.2, true, 15.0));
		system.addRestaurant(new Restaurant("R10", "Hummus Said", "Israeli", 4.9, true, 12.0));

		// Creating 10 fast food restaurant
		system.addRestaurant(new FastFoodRestaurant("F1", "McDonalds", "Burgers", 3.8, false, 15.0, 10, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F2", "Burger King", "Burgers", 3.9, true, 15.0, 12, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F3", "Dominos", "Pizza", 4.0, false, 12.0, 15, 6.0));
		system.addRestaurant(new FastFoodRestaurant("F4", "Pizza Hut", "Pizza", 4.1, true, 15.0, 15, 7.0));
		system.addRestaurant(new FastFoodRestaurant("F5", "Subway", "Sandwiches", 3.7, true, 10.0, 8, 4.0));
		system.addRestaurant(new FastFoodRestaurant("F6", "KFC", "Chicken", 3.5, false, 20.0, 15, 8.0));
		system.addRestaurant(new FastFoodRestaurant("F7", "Japanica", "Asian", 4.2, true, 25.0, 20, 10.0));
		system.addRestaurant(new FastFoodRestaurant("F8", "Taco Bell", "Mexican", 3.6, false, 15.0, 10, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F9", "Max Brenner", "Desserts", 4.5, true, 20.0, 15, 10.0));
		system.addRestaurant(new FastFoodRestaurant("F10", "Golda", "Ice Cream", 4.8, true, 10.0, 5, 5.0));

		// Creating 10 Premium restaurant
		system.addRestaurant(new PremiumRestaurant("P1", "Meat Bar", "Meat", 4.8, true, 30.0, 150.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P2", "Segev Art", "Chef", 4.9, false, 40.0, 200.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P3", "Machneyuda", "Chef", 4.7, false, 35.0, 180.0, 12.0));
		system.addRestaurant(new PremiumRestaurant("P4", "Hudson", "Meat", 4.9, false, 30.0, 250.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P5", "Taizu", "Asian", 4.8, false, 35.0, 200.0, 12.0));
		system.addRestaurant(new PremiumRestaurant("P6", "Popina", "Chef", 4.6, false, 30.0, 150.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P7", "Shila", "Seafood", 4.7, false, 40.0, 220.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P8", "Pastel", "French", 4.5, true, 35.0, 180.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P9", "Blue Sky", "Chef", 4.8, true, 40.0, 250.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P10", "Opa", "Vegan", 4.6, true, 30.0, 150.0, 10.0));

		// Creating 3 rest admin
		system.addRestAdmin(new RestAdmin("Yossi Cohen", "yossi_admin", "pass123"));
		system.addRestAdmin(new RestAdmin("Dana Levi", "dana_admin", "pass456"));
		system.addRestAdmin(new RestAdmin("Eli Ochana", "eli_admin", "pass789"));

		// main menu

		Scanner scanner = new Scanner(System.in);
		boolean systemRunning = true;

		while (systemRunning) {
			System.out.println("Main Menu");
			System.out.println("1. System Admin Login");
			System.out.println("2. Restaurant Manager Login");
			System.out.println("3. Rider Login");
			System.out.println("4. Customer Login");
			System.out.println("5. Exit");
			System.out.print("Select an option: ");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				adminLogin(scanner, system, mainAdmin);
			} else if (choice.equals("2")) {
				restAdminLogin(scanner, system);
			} else if (choice.equals("3")) {
				riderLogin(scanner, system);
			} else if (choice.equals("4")) {
				customerLogin(scanner, system);
			} else if (choice.equals("5")) {
				systemRunning = false;
				System.out.println("Thank you for using the system. Goodbye!");
			} else {
				System.out.println("Invalid selection. Please choose 1-5.");
			}
		}
		scanner.close();
	}

	// Login and menu for system admin
	// system admin login, sub-menu
	private static void adminLogin(Scanner scanner, DeliveryDataBase system, Admin mainAdmin) {
		System.out.print("Enter username: ");
		String inputUser = scanner.nextLine();
		System.out.print("Enter password: ");
		String inputPass = scanner.nextLine();

		if (!inputUser.equals(mainAdmin.getUsername()) || !inputPass.equals(mainAdmin.getPassword())) {
			System.out.println("Error: Incorrect username or password.");
			return;
		}

		System.out.println("Welcome, System Admin!");
		boolean adminRunning = true;

		while (adminRunning) {
			System.out.println(" System Admin Menu");
			System.out.println("1. Add Customer");
			System.out.println("2. Add Restaurant Manager");
			System.out.println("3. Assign Manager to Restaurant");
			System.out.println("4. Add Restaurant");
			System.out.println("5. Add Rider");
			System.out.println("6. Assign Rider to Order");
			System.out.println("7. View All Orders");
			System.out.println("8. Show Most Active Customer");
			System.out.println("10. Show Most Active Rider");
			System.out.println("11. Update Restaurant Status");
			System.out.println("9. Logout");
			System.out.print("Select an option: ");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				addCustomer(scanner, system);
			} else if (choice.equals("2")) {
				addRestAdmin(scanner, system);
			} else if (choice.equals("3")) {
				assignManagerToRestaurant(scanner, system);
			} else if (choice.equals("4")) {
				addRestaurant(scanner, system);
			} else if (choice.equals("5")) {
				addRider(scanner, system);
			} else if (choice.equals("6")) {
				assignRiderToOrder(scanner, system);
			} else if (choice.equals("7")) {
				viewAllOrders(system);
			} else if (choice.equals("8")) {
				showMostActiveCustomer(system);
			} else if (choice.equals("10")) {
				showMostActiveRider(system);
			} else if (choice.equals("11")) {
				updateRestaurantStatus(scanner, system);
			} else if (choice.equals("9")) {
				System.out.println("Logging out...");
				adminRunning = false;
			} else {
				System.out.println("Invalid selection.");
			}
		}
	}

	// Login and menu for restaurant manager
	// Handles restaurant manager login and sub-menu. RestAdmin
	private static void restAdminLogin(Scanner scanner, DeliveryDataBase system) {
		System.out.print("Enter username: ");
		String inputUser = scanner.nextLine();
		System.out.print("Enter password: ");
		String inputPass = scanner.nextLine();

		RestAdmin restAdmin = system.findRestAdminByCredentials(inputUser, inputPass);
		if (restAdmin == null) {
			System.out.println("Error: Incorrect username or password.");
			return;
		}

		System.out.println("Welcome, " + restAdmin.getAdminName() + "!");
		boolean menuRunning = true;

		while (menuRunning) {
			System.out.println("Restaurant Manager Menu");
			System.out.println("1. Add Customer");
			System.out.println("2. Add Order");
			System.out.println("3. Add Rider");
			System.out.println("4. Assign Rider to Order");
			System.out.println("5. View Orders by Restaurant");
			System.out.println("6. View Open Restaurants by Kitchen Type");
			System.out.println("9. Logout");
			System.out.print("Select an option: ");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				addCustomer(scanner, system);
			} else if (choice.equals("2")) {
				addOrder(scanner, system, restAdmin);
			} else if (choice.equals("3")) {
				addRider(scanner, system);
			} else if (choice.equals("4")) {
				assignRiderToOrder(scanner, system);
			} else if (choice.equals("5")) {
				printOrdersByRestaurant(scanner, system);
			} else if (choice.equals("6")) {
				printOpenRestaurantsByKitchenType(scanner, system);
			} else if (choice.equals("9")) {
				System.out.println("Logging out...");
				menuRunning = false;
			} else {
				System.out.println("Invalid selection.");
			}
		}
	}

	// Rider login and menu
	// Handles rider login and sub-menu
	private static void riderLogin(Scanner scanner, DeliveryDataBase system) {
		System.out.print("Enter your ID number (9 digits): ");
		String idInput = scanner.nextLine();

		if (!isValidId(idInput)) {
			System.out.println("Error: ID must be exactly 9 digits.");
			return;
		}

		Rider rider = system.findRiderById(idInput);
		if (rider == null) {
			System.out.println("Error: Rider not found in the system.");
			return;
		}

		System.out.println("Welcome, " + rider.getFullName() + "!");
		boolean menuRunning = true;

		while (menuRunning) {
			System.out.println(" Rider Menu");
			System.out.println("1. Update Order Status");
			System.out.println("2. View All My Orders");
			System.out.println("9. Logout");
			System.out.print("Select an option: ");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				updateOrderStatus(scanner, system, rider);
			} else if (choice.equals("2")) {
				printRiderOrders(rider);
			} else if (choice.equals("9")) {
				System.out.println("Logging out...");
				menuRunning = false;
			} else {
				System.out.println("Invalid selection.");
			}
		}
	}

	// Customer login and menu
	// Handles customer login and sub-menu.
	private static void customerLogin(Scanner scanner, DeliveryDataBase system) {
		System.out.print("Enter your customer code: ");
		String codeInput = scanner.nextLine();

		if (!isNonEmpty(codeInput)) {
			System.out.println("Error: Customer code cannot be empty.");
			return;
		}

		Customer customer = system.findCustomerById(codeInput);
		if (customer == null) {
			System.out.println("Error: Customer not found. Please ask a manager to add you first.");
			return;
		}

		System.out.println("Welcome, " + customer.getFirstName() + " " + customer.getLastName() + "!");
		boolean menuRunning = true;

		while (menuRunning) {
			System.out.println("Customer Menu");
			System.out.println("1. Place New Order");
			System.out.println("2. View All My Orders");
			System.out.println("3. Update Personal Info (address/phone)");
			System.out.println("4. View Restaurant Details by Code");
			System.out.println("9. Logout");
			System.out.print("Select an option: ");

			String choice = scanner.nextLine();

			if (choice.equals("1")) {
				placeOrder(scanner, system, customer);
			} else if (choice.equals("2")) {
				printCustomerOrders(system, customer);
			} else if (choice.equals("3")) {
				updateCustomerInfo(scanner, customer);
			} else if (choice.equals("4")) {
				viewRestaurantByCode(scanner, system);
			} else if (choice.equals("9")) {
				System.out.println("Logging out...");
				menuRunning = false;
			} else {
				System.out.println("Invalid selection.");
			}
		}
	}

	// Shared action methods
	// Adds a new customer to the system
	private static void addCustomer(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Add Customer");

		// Customer code - loop until valid and unique
		String code;
		while (true) {
			System.out.print("Enter customer code (number only, e.g. 11): ");
			code = scanner.nextLine();
			if (!isNonEmpty(code)) {
				System.out.println("Error: Customer code cannot be empty.");
			} else if (system.findCustomerById(code) != null) {
				System.out.println("Error: A customer with this code already exists.");
			} else {
				break;
			}
		}

		// First name - letters only, no digits
		String firstName;
		while (true) {
			System.out.print("Enter first name (letters only): ");
			firstName = scanner.nextLine();
			if (isLettersOnly(firstName))
				break;
			System.out.println("Error: First name must contain letters only, no digits or special characters.");
		}

		// Last name - letters and spaces allowed (compound names)
		String lastName;
		while (true) {
			System.out.print("Enter last name (letters only, spaces allowed): ");
			lastName = scanner.nextLine();
			if (isLettersAndSpaces(lastName))
				break;
			System.out.println("Error: Last name must contain letters only.");
		}

		// City - letters and spaces only
		String city;
		while (true) {
			System.out.print("Enter city (letters only): ");
			city = scanner.nextLine();
			if (isLettersAndSpaces(city))
				break;
			System.out.println("Error: City must contain letters only.");
		}

		// Street - letters, numbers and spaces allowed
		String street;
		while (true) {
			System.out.print("Enter street address (e.g. Herzl 10): ");
			street = scanner.nextLine();
			if (isNonEmpty(street))
				break;
			System.out.println("Error: Street address cannot be empty.");
		}

		// Zipcode - digits only, 5-7 digits
		String zipcode;
		while (true) {
			System.out.print("Enter zipcode (5-7 digits): ");
			zipcode = scanner.nextLine();
			if (isValidZipcode(zipcode))
				break;
			System.out.println("Error: Zipcode must be 5-7 digits only.");
		}

		// Phone - 10 digits, dash after 3rd digit optional
		String phone;
		while (true) {
			System.out.print("Enter phone (e.g. 0501234567 or 050-1234567): ");
			phone = scanner.nextLine();
			if (isValidPhone(phone))
				break;
			System.out.println("Error: Phone must be 10 digits (e.g. 0501234567 or 050-1234567).");
		}

		// Email validation
		String email;
		while (true) {
			System.out.print("Enter email: ");
			email = scanner.nextLine();
			if (isValidEmail(email))
				break;
			System.out.println(
					"Error: Invalid email. Must contain exactly one '@', a dot after '@', not at start or end.");
		}

		// Credit balance - non-negative double
		double creditBalance;
		while (true) {
			System.out.print("Enter credit balance (e.g. 0.0): ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Credit balance must be a number.");
				scanner.nextLine();
				continue;
			}
			creditBalance = scanner.nextDouble();
			scanner.nextLine();
			if (creditBalance < 0) {
				System.out.println("Error: Credit balance cannot be negative.");
			} else {
				break;
			}
		}

		Customer newCustomer = new Customer(code, firstName, lastName, city, street, zipcode, phone, email,
				creditBalance);
		boolean added = system.addCustomer(newCustomer);
		if (added) {
			System.out.println("Customer added successfully! Code: " + code);
		} else {
			System.out.println("Error: Could not add customer.");
		}
	}

	// Adds a new RestAdmin to the system.
	private static void addRestAdmin(Scanner scanner, DeliveryDataBase system) {
		System.out.println(" Add Restaurant Manager");

		// Manager full name
		String name;
		while (true) {
			System.out.print("Enter manager full name: ");
			name = scanner.nextLine();
			if (isNonEmpty(name))
				break;
			System.out.println("Error: Name cannot be empty.");
		}

		// Username - must be unique
		String username;
		while (true) {
			System.out.print("Enter username: ");
			username = scanner.nextLine();
			if (!isNonEmpty(username)) {
				System.out.println("Error: Username cannot be empty.");
			} else if (system.findRestAdminByUsername(username) != null) {
				System.out.println("Error: A manager with this username already exists.");
			} else {
				break;
			}
		}

		// Password
		String password;
		while (true) {
			System.out.print("Enter password: ");
			password = scanner.nextLine();
			if (isNonEmpty(password))
				break;
			System.out.println("Error: Password cannot be empty.");
		}

		RestAdmin newAdmin = new RestAdmin(name, username, password);
		boolean added = system.addRestAdmin(newAdmin);
		if (added) {
			System.out.println("Restaurant manager added successfully! Username: " + username);
		} else {
			System.out.println("Error: Could not add manager.");
		}
	}

	// Assigns an existing restaurant manager to an existing restaurant
	private static void assignManagerToRestaurant(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Assign Manager to Restaurant");

		// Manager username - loop until found
		String username;
		RestAdmin admin;
		while (true) {
			System.out.print("Enter manager username: ");
			username = scanner.nextLine();
			if (!isNonEmpty(username)) {
				System.out.println("Error: Username cannot be empty.");
				continue;
			}
			admin = system.findRestAdminByUsername(username);
			if (admin == null) {
				System.out.println("Error: Manager not found.");
			} else {
				break;
			}
		}

		// Restaurant code - loop until found
		String restCode;
		Restaurant restaurant;
		while (true) {
			System.out.print("Enter restaurant code: ");
			restCode = scanner.nextLine();
			if (!isNonEmpty(restCode)) {
				System.out.println("Error: Restaurant code cannot be empty.");
				continue;
			}
			restaurant = system.findRestaurantById(restCode);
			if (restaurant == null) {
				System.out.println("Error: Restaurant not found.");
			} else {
				break;
			}
		}

		boolean assigned = admin.addRestaurant(restaurant);
		if (assigned) {
			System.out.println("Restaurant '" + restaurant.getRestaurantName() + "' assigned to " + admin.getAdminName()
					+ " successfully.");
		} else {
			System.out.println("Error: Could not assign (manager's restaurant list may be full).");
		}
	}

	// Adds a new restaurant to the system
	private static void addRestaurant(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Add Restaurant");

		// Restaurant type - loop until valid selection
		String typeChoice;
		while (true) {
			System.out.println("Choose restaurant type:");
			System.out.println("1. Regular Restaurant");
			System.out.println("2. Fast Food Restaurant");
			System.out.println("3. Premium Restaurant");
			System.out.print("Select: ");
			typeChoice = scanner.nextLine();
			if (typeChoice.equals("1") || typeChoice.equals("2") || typeChoice.equals("3"))
				break;
			System.out.println("Error: Invalid selection. Please choose 1, 2, or 3.");
		}

		// Restaurant code - unique
		String code;
		while (true) {
			System.out.print("Enter restaurant code (e.g. R11): ");
			code = scanner.nextLine();
			if (!isNonEmpty(code)) {
				System.out.println("Error: Code cannot be empty.");
			} else if (system.findRestaurantById(code) != null) {
				System.out.println("Error: A restaurant with this code already exists.");
			} else {
				break;
			}
		}

		// Restaurant name
		String name;
		while (true) {
			System.out.print("Enter restaurant name: ");
			name = scanner.nextLine();
			if (isNonEmpty(name))
				break;
			System.out.println("Error: Name cannot be empty.");
		}

		// Kitchen type
		String kitchenType;
		while (true) {
			System.out.print("Enter kitchen type (e.g. Italian, Asian): ");
			kitchenType = scanner.nextLine();
			if (isNonEmpty(kitchenType))
				break;
			System.out.println("Error: Kitchen type cannot be empty.");
		}

		// Rating 0.0-5.0
		double rating;
		while (true) {
			System.out.print("Enter rating (0.0 - 5.0): ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Rating must be a number.");
				scanner.nextLine();
				continue;
			}
			rating = scanner.nextDouble();
			scanner.nextLine();
			if (rating < 0 || rating > 5) {
				System.out.println("Error: Rating must be between 0.0 and 5.0.");
			} else {
				break;
			}
		}

		// Is open - true/false
		boolean isOpen;
		while (true) {
			System.out.print("Is the restaurant open? (true/false): ");
			String openStr = scanner.nextLine();
			if (openStr.equals("true")) {
				isOpen = true;
				break;
			}
			if (openStr.equals("false")) {
				isOpen = false;
				break;
			}
			System.out.println("Error: Please enter 'true' or 'false'.");
		}

		// Basic delivery fee
		double deliveryFee;
		while (true) {
			System.out.print("Enter basic delivery fee: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Delivery fee must be a number.");
				scanner.nextLine();
				continue;
			}
			deliveryFee = scanner.nextDouble();
			scanner.nextLine();
			if (deliveryFee < 0) {
				System.out.println("Error: Delivery fee cannot be negative.");
			} else {
				break;
			}
		}

		if (typeChoice.equals("1")) {
			system.addRestaurant(new Restaurant(code, name, kitchenType, rating, isOpen, deliveryFee));
			System.out.println("Regular restaurant added successfully! Code: " + code);

		} else if (typeChoice.equals("2")) {
			int prepTime = readPositiveInt(scanner);
			if (prepTime == -1)
				return;

			// Fast delivery extra cost
			double fastExtra;
			while (true) {
				System.out.print("Enter fast delivery extra cost: ");
				if (!scanner.hasNextDouble()) {
					System.out.println("Error: Extra cost must be a number.");
					scanner.nextLine();
					continue;
				}
				fastExtra = scanner.nextDouble();
				scanner.nextLine();
				if (fastExtra < 0) {
					System.out.println("Error: Extra cost cannot be negative.");
				} else {
					break;
				}
			}
			system.addRestaurant(
					new FastFoodRestaurant(code, name, kitchenType, rating, isOpen, deliveryFee, prepTime, fastExtra));
			System.out.println("Fast food restaurant added successfully! Code: " + code);

		} else {
			// Minimum order cost
			double minCost;
			while (true) {
				System.out.print("Enter minimum order cost: ");
				if (!scanner.hasNextDouble()) {
					System.out.println("Error: Minimum cost must be a number.");
					scanner.nextLine();
					continue;
				}
				minCost = scanner.nextDouble();
				scanner.nextLine();
				if (minCost < 0) {
					System.out.println("Error: Minimum cost cannot be negative.");
				} else {
					break;
				}
			}

			// Extra commission
			double commission;
			while (true) {
				System.out.print("Enter extra commission percentage: ");
				if (!scanner.hasNextDouble()) {
					System.out.println("Error: Commission must be a number.");
					scanner.nextLine();
					continue;
				}
				commission = scanner.nextDouble();
				scanner.nextLine();
				if (commission < 0) {
					System.out.println("Error: Commission cannot be negative.");
				} else {
					break;
				}
			}
			system.addRestaurant(
					new PremiumRestaurant(code, name, kitchenType, rating, isOpen, deliveryFee, minCost, commission));
			System.out.println("Premium restaurant added successfully! Code: " + code);
		}
	}

	// Adds a new rider to the system.
	private static void addRider(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Add Rider");

		// Rider ID - exactly 9 digits and unique
		String id;
		while (true) {
			System.out.print("Enter rider ID number (exactly 9 digits): ");
			id = scanner.nextLine();
			if (!isValidId(id)) {
				System.out.println("Error: ID must be exactly 9 digits.");
			} else if (system.findRiderById(id) != null) {
				System.out.println("Error: A rider with this ID already exists.");
			} else {
				break;
			}
		}

		// Full name
		String fullName;
		while (true) {
			System.out.print("Enter full name: ");
			fullName = scanner.nextLine();
			if (isNonEmpty(fullName))
				break;
			System.out.println("Error: Name cannot be empty.");
		}

		// Phone
		String phone;
		while (true) {
			System.out.print("Enter phone (e.g. 0501234567 or 050-1234567): ");
			phone = scanner.nextLine();
			if (isValidPhone(phone))
				break;
			System.out.println("Error: Phone must be 10 digits (e.g. 0501234567 or 050-1234567).");
		}

		// Vehicle type
		String vehicle;
		while (true) {
			System.out.print("Enter vehicle type (e.g. Bicycle, Scooter, Car): ");
			vehicle = scanner.nextLine();
			if (isNonEmpty(vehicle))
				break;
			System.out.println("Error: Vehicle type cannot be empty.");
		}

		Rider newRider = new Rider(id, fullName, phone, vehicle, true);
		boolean added = system.addRider(newRider);
		if (added) {
			System.out.println("Rider added successfully! ID: " + id);
		} else {
			System.out.println("Error: Could not add rider.");
		}
	}

	// Assigns an available rider to an existing order.
	private static void assignRiderToOrder(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Assign Rider to Order");

		// Rider ID - must exist and be available
		String riderId;
		Rider rider;
		while (true) {
			System.out.print("Enter rider ID: ");
			riderId = scanner.nextLine();
			if (!isNonEmpty(riderId)) {
				System.out.println("Error: Rider ID cannot be empty.");
				continue;
			}
			rider = system.findRiderById(riderId);
			if (rider == null) {
				System.out.println("Error: Rider not found.");
			} else if (!rider.isIsAvailable()) {
				System.out.println("Error: Rider is not available.");
			} else {
				break;
			}
		}

		// Order code - must exist and have no rider yet
		String orderId;
		Order order;
		while (true) {
			System.out.print("Enter order code: ");
			orderId = scanner.nextLine();
			if (!isNonEmpty(orderId)) {
				System.out.println("Error: Order code cannot be empty.");
				continue;
			}
			order = system.findOrderById(orderId);
			if (order == null) {
				System.out.println("Error: Order not found.");
			} else if (order.getRiderId() != null) {
				System.out.println("Error: This order already has a rider assigned.");
			} else {
				break;
			}
		}

		order.setRiderId(riderId);
		rider.addOrderToRider(order);
		rider.setIsAvailable(false);
		order.setStatus("Sent");
		System.out.println("Rider " + rider.getFullName() + " assigned to order " + orderId + " successfully.");
	}

	// Creates a new order for a RestAdmin.
	private static void addOrder(Scanner scanner, DeliveryDataBase system, RestAdmin restAdmin) {
		System.out.println("Add Order");

		// Customer code - must exist
		String customerId;
		Customer orderCustomer;
		while (true) {
			System.out.print("Enter customer code: ");
			customerId = scanner.nextLine();
			if (!isNonEmpty(customerId)) {
				System.out.println("Error: Customer code cannot be empty.");
			} else if (system.findCustomerById(customerId) == null) {
				System.out.println("Error: Customer not found in the system.");
			} else {
				break;
			}
		}
		orderCustomer = system.findCustomerById(customerId);

		// Restaurant code - must exist and manager must be responsible for it
		String restCode;
		Restaurant restaurant;
		while (true) {
			System.out.print("Enter restaurant code: ");
			restCode = scanner.nextLine();
			if (!isNonEmpty(restCode)) {
				System.out.println("Error: Restaurant code cannot be empty.");
				continue;
			}
			restaurant = system.findRestaurantById(restCode);
			if (restaurant == null) {
				System.out.println("Error: Restaurant not found.");
			} else if (!restAdmin.managesRestaurant(restCode)) {
				System.out.println("Error: You are not responsible for this restaurant.");
			} else {
				break;
			}
		}

		// Base order amount - positive, respects premium minimum
		double baseAmount;
		while (true) {
			System.out.print("Enter base order amount: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Amount must be a number.");
				scanner.nextLine();
				continue;
			}
			baseAmount = scanner.nextDouble();
			scanner.nextLine();
			if (baseAmount <= 0) {
				System.out.println("Error: Amount must be positive.");
				continue;
			}
			if (restaurant instanceof PremiumRestaurant) {
				PremiumRestaurant pr = (PremiumRestaurant) restaurant;
				if (baseAmount < pr.getMinOrderCost()) {
					System.out.println("Error: Amount " + baseAmount + " is below the minimum of "
							+ pr.getMinOrderCost() + " for this restaurant.");
					continue;
				}
			}
			break;
		}

		// Calculate final price
		double finalPrice = restaurant.calculateFinalPrice(baseAmount);

		// Check that the customer has enough credit balance
		if (orderCustomer.getCreditBalance() < finalPrice) {
			System.out.println("Error: Customer does not have enough credit balance. Balance: "
					+ orderCustomer.getCreditBalance() + " | Required: " + finalPrice);
			return;
		}

		// Order date
		System.out.print("Enter order day (1-31): ");
		int day = readIntInRange(scanner, 1, 31);
		if (day == -1)
			return;
		System.out.print("Enter order month (1-12): ");
		int month = readIntInRange(scanner, 1, 12);
		if (month == -1)
			return;
		System.out.print("Enter order year (e.g. 2026): ");
		int year = readIntInRange(scanner, 2000, 2100);
		if (year == -1)
			return;

		// Generate order ID automatically
		String orderId = "ORD" + (system.getOrdersCount() + 1);

		Order newOrder = new Order(orderId, customerId, restaurant, restCode, null, day, month, year, 0, 0, 0,
				baseAmount, finalPrice, "Sent");

		boolean added = system.addOrder(newOrder);
		if (added) {
			int customerCodeInt = Integer.parseInt(customerId);

			// Update HashMap of orders by customer
			system.addOrderToCustomerMap(customerCodeInt, newOrder);

			// Update Hashtable of restaurants by customer
			if (!system.getRestaurantsByCustomer().containsKey(customerCodeInt)) {
				system.getRestaurantsByCustomer().put(customerCodeInt, new java.util.ArrayList<>());
			}
			if (!system.getRestaurantsByCustomer().get(customerCodeInt).contains(restaurant)) {
				system.getRestaurantsByCustomer().get(customerCodeInt).add(restaurant);
			}

			// Update HashMap of total payments by customer
			if (!system.getTotalPaymentsByCustomer().containsKey(customerCodeInt)) {
				system.getTotalPaymentsByCustomer().put(customerCodeInt, 0.0);
			}
			system.getTotalPaymentsByCustomer().put(customerCodeInt,
					system.getTotalPaymentsByCustomer().get(customerCodeInt) + finalPrice);

			// Deduct from customer credit balance
			orderCustomer.setCreditBalance(orderCustomer.getCreditBalance() - finalPrice);

			System.out.println("Order added successfully! Code: " + orderId + " | Final price: " + finalPrice);
		} else {
			System.out.println("Error: Could not add order.");
		}
	}

	// Customer places a new order.
	private static void placeOrder(Scanner scanner, DeliveryDataBase system, Customer customer) {
		System.out.println("Place New Order");

		// Restaurant code - must exist
		String restCode;
		Restaurant restaurant;
		while (true) {
			System.out.print("Enter restaurant code: ");
			restCode = scanner.nextLine();
			if (!isNonEmpty(restCode)) {
				System.out.println("Error: Restaurant code cannot be empty.");
				continue;
			}
			restaurant = system.findRestaurantById(restCode);
			if (restaurant == null) {
				System.out.println("Error: Restaurant not found.");
			} else {
				break;
			}
		}

		// Base order amount - positive, respects premium minimum
		double baseAmount;
		while (true) {
			System.out.print("Enter base order amount: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Amount must be a number.");
				scanner.nextLine();
				continue;
			}
			baseAmount = scanner.nextDouble();
			scanner.nextLine();
			if (baseAmount <= 0) {
				System.out.println("Error: Amount must be positive.");
				continue;
			}
			if (restaurant instanceof PremiumRestaurant) {
				PremiumRestaurant pr = (PremiumRestaurant) restaurant;
				if (baseAmount < pr.getMinOrderCost()) {
					System.out.println("Error: Amount " + baseAmount + " is below the minimum of "
							+ pr.getMinOrderCost() + " for this restaurant.");
					continue;
				}
			}
			break;
		}

		// Order date
		System.out.print("Enter order day (1-31): ");
		int day = readIntInRange(scanner, 1, 31);
		if (day == -1)
			return;
		System.out.print("Enter order month (1-12): ");
		int month = readIntInRange(scanner, 1, 12);
		if (month == -1)
			return;
		System.out.print("Enter order year (e.g. 2026): ");
		int year = readIntInRange(scanner, 2000, 2100);
		if (year == -1)
			return;

		String orderId = "ORD" + (system.getOrdersCount() + 1);
		double finalPrice = restaurant.calculateFinalPrice(baseAmount);

		Order newOrder = new Order(orderId, customer.getCustomerCode(), restaurant, restCode, null, day, month, year, 0,
				0, 0, baseAmount, finalPrice, "Sent");

		boolean added = system.addOrder(newOrder);
		if (added) {
			System.out.println("Order placed successfully! Code: " + orderId + " | Final price: " + finalPrice);
		} else {
			System.out.println("Error: Could not place order.");
		}
	}

	// Rider updates the status of one of their assigned orders.
	private static void updateOrderStatus(Scanner scanner, DeliveryDataBase system, Rider rider) {
		System.out.println("Update Order Status");

		System.out.print("Enter order code: ");
		String orderId = scanner.nextLine();
		if (!isNonEmpty(orderId)) {
			System.out.println("Error: Order code cannot be empty.");
			return;
		}

		Order order = system.findOrderById(orderId);
		if (order == null) {
			System.out.println("Error: Order not found.");
			return;
		}

		// Check that the order is assigned to this rider
		if (order.getRiderId() == null || !order.getRiderId().equals(rider.getId())) {
			System.out.println("Error: This order is not assigned to you.");
			return;
		}

		System.out.println("Current status: " + order.getStatus());
		System.out.println("1. On the way");
		System.out.println("2. Delivered");
		System.out.print("Select new status: ");
		String statusChoice = scanner.nextLine();

		if (statusChoice.equals("1")) {
			order.setStatus("On the way");
			System.out.println("Status updated to: On the way");

		} else if (statusChoice.equals("2")) {
			order.setStatus("Delivered");
			System.out.print("Enter delivery day (1-31): ");
			int day = readIntInRange(scanner, 1, 31);
			if (day == -1)
				return;
			System.out.print("Enter delivery month (1-12): ");
			int month = readIntInRange(scanner, 1, 12);
			if (month == -1)
				return;
			System.out.print("Enter delivery year: ");
			int year = readIntInRange(scanner, 2000, 2100);
			if (year == -1)
				return;
			order.setDeliveryDay(day);
			order.setDeliveryMonth(month);
			order.setDeliveryYear(year);
			rider.setIsAvailable(true);
			System.out.println("Status updated to: Delivered | Date: " + day + "/" + month + "/" + year);

		} else {
			System.out.println("Invalid selection.");
		}
	}

	// Prints all orders assigned to the given rider.
	private static void printRiderOrders(Rider rider) {
		System.out.println("Orders for Rider: " + rider.getFullName() + " ");
		ArrayList<Order> orders = rider.getCompletedOrders();
		if (orders.isEmpty()) {
			System.out.println("No orders found.");
			return;
		}
		for (Order order : orders) {
			System.out.println(order.toString());
		}
	}

	// Prints all orders placed by the given customer
	private static void printCustomerOrders(DeliveryDataBase system, Customer customer) {
		System.out.println(" Orders for: " + customer.getFirstName() + " " + customer.getLastName() + " ");
		ArrayList<Order> allOrders = system.getOrders();
		boolean found = false;
		for (Order o : allOrders) {
			if (o.getCustomerId().equals(customer.getCustomerCode())) {
				System.out.println(o.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No orders found.");
		}
	}

	// Allows a customer to update street address and/or phone only
	private static void updateCustomerInfo(Scanner scanner, Customer customer) {
		System.out.println(" Update Personal Info");

		System.out
				.print("Enter new street address (press Enter to keep current: " + customer.getStreetAddress() + "): ");
		String newStreet = scanner.nextLine();
		if (isNonEmpty(newStreet)) {
			customer.setStreetAddress(newStreet);
			System.out.println("Street address updated successfully.");
		}

		// Phone - loop until valid or left empty (Enter to keep current)
		while (true) {
			System.out.print("Enter new phone (press Enter to keep current: " + customer.getPhone() + "): ");
			String newPhone = scanner.nextLine();
			if (!isNonEmpty(newPhone))
				break; // keep current phone
			if (!isValidPhone(newPhone)) {
				System.out.println("Error: Invalid phone format. Phone was not updated.");
			} else {
				customer.setPhone(newPhone);
				System.out.println("Phone updated successfully.");
				break;
			}
		}
	}

	// Displays full details of a restaurant found by code.
	private static void viewRestaurantByCode(Scanner scanner, DeliveryDataBase system) {
		System.out.print("Enter restaurant code: ");
		String code = scanner.nextLine();
		if (!isNonEmpty(code)) {
			System.out.println("Error: Restaurant code cannot be empty.");
			return;
		}
		Restaurant restaurant = system.findRestaurantById(code);
		if (restaurant == null) {
			System.out.println("Error: Restaurant not found.");
		} else {
			System.out.println(restaurant.toString());
		}
	}

	// Displays all orders in the system (admin only)
	private static void viewAllOrders(DeliveryDataBase system) {
		System.out.println("All Orders in the System");
		ArrayList<Order> allOrders = system.getOrders();
		if (allOrders.isEmpty()) {
			System.out.println("No orders found.");
			return;
		}
		for (Order o : allOrders) {
			System.out.println(o.toString());
		}
	}

	// Displays the customer with the most orders (admin only)
	private static void showMostActiveCustomer(DeliveryDataBase system) {
		Customer top = system.getMostActiveCustomer();
		if (top == null) {
			System.out.println("No orders in the system yet.");
		} else {
			System.out.println("Most Active Customer: " + top.toString());
		}
	}

	// Displays the rider with the most deliveries (admin only)
	private static void showMostActiveRider(DeliveryDataBase system) {
		Rider top = system.getMostActiveRider();
		if (top == null) {
			System.out.println("No deliveries in the system yet.");
		} else {
			System.out.println("Most Active Rider: " + top.toString());
		}
	}

	// Opens or closes a restaurant (admin only)
	private static void updateRestaurantStatus(Scanner scanner, DeliveryDataBase system) {
		System.out.println("Update Restaurant Status");

		// Restaurant code - must exist
		String restCode;
		Restaurant restaurant;
		while (true) {
			System.out.print("Enter restaurant code: ");
			restCode = scanner.nextLine();
			if (!isNonEmpty(restCode)) {
				System.out.println("Error: Restaurant code cannot be empty.");
				continue;
			}
			restaurant = system.findRestaurantById(restCode);
			if (restaurant == null) {
				System.out.println("Error: Restaurant not found.");
			} else {
				break;
			}
		}

		System.out.println("Current status: " + (restaurant.isIsOpen() ? "Open" : "Closed"));
		boolean newStatus = false;
		while (true) {
			System.out.print("Set status - open or closed? (open/closed): ");
			String statusInput = scanner.nextLine();
			if (statusInput.equals("open")) {
				newStatus = true;
				break;
			} else if (statusInput.equals("closed")) {
				newStatus = false;
				break;
			} else {
				System.out.println("Error: Please enter 'open' or 'closed'.");
			}
		}

		restaurant.setIsOpen(newStatus);
		System.out.println(
				"Restaurant '" + restaurant.getRestaurantName() + "' is now " + (newStatus ? "Open" : "Closed") + ".");
	}

	// Displays all orders for a specific restaurant 
	private static void printOrdersByRestaurant(Scanner scanner, DeliveryDataBase system) {
		System.out.println("View Orders by Restaurant");

		String restCode;
		while (true) {
			System.out.print("Enter restaurant code: ");
			restCode = scanner.nextLine();
			if (!isNonEmpty(restCode)) {
				System.out.println("Error: Restaurant code cannot be empty.");
				continue;
			}
			if (system.findRestaurantById(restCode) == null) {
				System.out.println("Error: Restaurant not found.");
			} else {
				break;
			}
		}

		boolean found = false;
		for (Order o : system.getOrders()) {
			if (o.getRestaurantId().equals(restCode)) {
				System.out.println(o.toString());
				found = true;
			}
		}
		if (!found) {
			System.out.println("No orders found for this restaurant.");
		}
	}

	// Displays all open restaurants by kitchen type 
	private static void printOpenRestaurantsByKitchenType(Scanner scanner, DeliveryDataBase system) {
		System.out.println("View Open Restaurants by Kitchen Type");

		String kitchenType;
		while (true) {
			System.out.print("Enter kitchen type (e.g. Italian, Asian): ");
			kitchenType = scanner.nextLine();
			if (isNonEmpty(kitchenType))
				break;
			System.out.println("Error: Kitchen type cannot be empty.");
		}

		ArrayList<Restaurant> result = system.getOpenRestaurantsByKitchenType(kitchenType);
		if (result.isEmpty()) {
			System.out.println("No open restaurants found for kitchen type: " + kitchenType);
		} else {
			System.out.println("Open restaurants of type '" + kitchenType + "':");
			for (Restaurant r : result) {
				System.out.println(r.toString());
			}
		}
	}

	// Input validation helper methods
	// Checks that the string is not null, not empty, and not only spaces
	private static boolean isNonEmpty(String s) {
		if (s == null)
			return false;
		if (s.length() == 0)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				return true;
		}
		return false;
	}

	// Checks that the string contains letters only
	private static boolean isLettersOnly(String s) {
		if (!isNonEmpty(s))
			return false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isLetter(c))
				return false;
		}
		return true;
	}

	// Checks that the string contains letters and spaces only
	private static boolean isLettersAndSpaces(String s) {
		if (!isNonEmpty(s))
			return false;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!Character.isLetter(c) && c != ' ')
				return false;
		}
		return true;
	}

	// Validates ID: exactly 9 digits
	private static boolean isValidId(String s) {
		if (!isNonEmpty(s))
			return false;
		if (s.length() != 9)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	// Validates a zipcode: digits only, 5-7 digits
	private static boolean isValidZipcode(String s) {
		if (!isNonEmpty(s))
			return false;
		if (s.length() < 5 || s.length() > 7)
			return false;
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isDigit(s.charAt(i)))
				return false;
		}
		return true;
	}

	// Validates a phone number: 10 digits, or 3 digits + dash + 7 digits
	private static boolean isValidPhone(String s) {
		if (!isNonEmpty(s))
			return false;
		// Option 1: exactly 10 digits
		if (s.length() == 10) {
			for (int i = 0; i < s.length(); i++) {
				if (!Character.isDigit(s.charAt(i)))
					return false;
			}
			return true;
		}
		// Option 2(11 chars, dash at position 3)
		if (s.length() == 11 && s.charAt(3) == '-') {
			for (int i = 0; i < s.length(); i++) {
				if (i == 3)
					continue;
				if (!Character.isDigit(s.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}

	// Validates an email address
	private static boolean isValidEmail(String email) {
		if (!isNonEmpty(email))
			return false;
		int atIndex = email.indexOf('@');
		if (atIndex <= 0 || atIndex == email.length() - 1)
			return false;
		if (email.indexOf('@', atIndex + 1) != -1)
			return false;
		String afterAt = email.substring(atIndex + 1);
		int dotIndex = afterAt.indexOf('.');
		if (dotIndex <= 0)
			return false;
		if (dotIndex == afterAt.length() - 1)
			return false;
		return true;
	}

	// Reads an integer from the user within the range [min, max].
	private static int readIntInRange(Scanner scanner, int min, int max) {
		if (!scanner.hasNextInt()) {
			System.out.println("Error: Must be a whole number.");
			scanner.nextLine();
			return -1;
		}
		int value = scanner.nextInt();
		scanner.nextLine();
		if (value < min || value > max) {
			System.out.println("Error: Value must be between " + min + " and " + max + ".");
			return -1;
		}
		return value;
	}

	// Reads a positive integer (greater than 0) from the user.
	private static int readPositiveInt(Scanner scanner) {
		if (!scanner.hasNextInt()) {
			System.out.println("Error: Must be a whole number.");
			scanner.nextLine();
			return -1;
		}
		int value = scanner.nextInt();
		scanner.nextLine();
		if (value <= 0) {
			System.out.println("Error: Value must be a positive number.");
			return -1;
		}
		return value;
	}
}