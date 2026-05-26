package hw1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Create an instance of the system
		DeliverySystem system = new DeliverySystem();

		// Create a manager by admin name, username, password
		Admin mainAdmin = new Admin("System Admin", "admin", "12345");

		System.out.println("Loading data into the system...");

		// Creating 5 Riders
		system.addRider(new Rider("123456789", "משה ישראלי", "050-1010101", "אופניים", true, new Order[50], 0));
		system.addRider(new Rider("234567890", "אורן לבנה", "052-2020202", "קטנוע", true, new Order[50], 0));
		system.addRider(new Rider("345678901", "עדן שמש", "054-3030303", "מכונית", true, new Order[50], 0));
		system.addRider(new Rider("456789012", "ליאל ים", "053-4040404", "אופניים", true, new Order[50], 0));
		system.addRider(new Rider("567890123", "רון אור", "058-5050505", "קטנוע", true, new Order[50], 0));

		// Creating 10 customers
		system.addCustomer(new Customer("C1", "ליאן", "סיידה", "טבריה", "הגליל 1", "1400000", "052-5211311",
				"lian@gmail.com", 0.0));
		system.addCustomer(
				new Customer("C2", "דני", "כהן", "חיפה", "הנמל 10", "3303220", "050-1111111", "dani@gmail.com", 0.0));
		system.addCustomer(new Customer("C3", "רונית", "לוי", "תל אביב", "דיזנגוף 50", "6433221", "054-2222222",
				"ronit@gmail.com", 0.0));
		system.addCustomer(
				new Customer("C4", "יעל", "בר", "ירושלים", "יפו 30", "9455667", "052-3333333", "yael@gmail.com", 0.0));
		system.addCustomer(new Customer("C5", "עומר", "גולן", "אילת", "התמרים 5", "8800000", "053-4444444",
				"omer@gmail.com", 0.0));
		system.addCustomer(new Customer("C6", "שיר", "ביטון", "אשדוד", "הציונות 12", "7744332", "050-5555555",
				"shir@gmail.com", 0.0));
		system.addCustomer(new Customer("C7", "עמית", "קדוש", "חיפה", "מוריה 15", "3455566", "054-6666666",
				"amit@gmail.com", 0.0));
		system.addCustomer(
				new Customer("C8", "נועה", "רוזן", "נתניה", "הרצל 8", "4222333", "052-7777777", "noa@gmail.com", 0.0));
		system.addCustomer(new Customer("C9", "איתי", "שלום", "טבריה", "הבנים 2", "1411122", "053-8888888",
				"itay@gmail.com", 0.0));
		system.addCustomer(new Customer("C10", "מאיה", "חן", "ראשון לציון", "רוטשילד 20", "7522233", "050-9999999",
				"maya@gmail.com", 0.0));

		// Creating 10 regular restaurants
		system.addRestaurant(new Restaurant("R1", "פיצה בלה", "איטלקי", 4.5, true, 20.0));
		system.addRestaurant(new Restaurant("R2", "סושי מאסטר", "אסייתי", 4.2, false, 25.0));
		system.addRestaurant(new Restaurant("R3", "נאפיס", "ישראלי", 4.0, true, 15.0));
		system.addRestaurant(new Restaurant("R4", "קפה גרג", "בית קפה", 4.3, true, 18.0));
		system.addRestaurant(new Restaurant("R5", "לנדוור", "בית קפה", 4.1, true, 20.0));
		system.addRestaurant(new Restaurant("R6", "שווארמה הנשיא", "בשרים", 4.6, true, 15.0));
		system.addRestaurant(new Restaurant("R7", "בית הפנקייק", "קינוחים", 4.4, false, 20.0));
		system.addRestaurant(new Restaurant("R8", "פלאפל הכיכר", "אוכל רחוב", 4.8, true, 10.0));
		system.addRestaurant(new Restaurant("R9", "בר סלטים", "בריאות", 4.2, true, 15.0));
		system.addRestaurant(new Restaurant("R10", "חומוס סעיד", "ישראלי", 4.9, true, 12.0));

		// Creating 10 fast food restaurant
		system.addRestaurant(new FastFoodRestaurant("F1", "מקדונלדס", "המבורגר", 3.8, false, 15.0, 10, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F2", "בורגר קינג", "המבורגר", 3.9, true, 15.0, 12, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F3", "דומינוס", "פיצה", 4.0, false, 12.0, 15, 6.0));
		system.addRestaurant(new FastFoodRestaurant("F4", "פיצה האט", "פיצה", 4.1, true, 15.0, 15, 7.0));
		system.addRestaurant(new FastFoodRestaurant("F5", "סאבווי", "כריכים", 3.7, true, 10.0, 8, 4.0));
		system.addRestaurant(new FastFoodRestaurant("F6", "KFC", "עוף", 3.5, false, 20.0, 15, 8.0));
		system.addRestaurant(new FastFoodRestaurant("F7", "ג'פניקה", "אסייתי", 4.2, true, 25.0, 20, 10.0));
		system.addRestaurant(new FastFoodRestaurant("F8", "טאקו בל", "מקסיקני", 3.6, false, 15.0, 10, 5.0));
		system.addRestaurant(new FastFoodRestaurant("F9", "מקס ברנר", "קינוחים", 4.5, true, 20.0, 15, 10.0));
		system.addRestaurant(new FastFoodRestaurant("F10", "גולדה", "גלידה", 4.8, true, 10.0, 5, 5.0));

		// Creating 10 Premium restaurant
		system.addRestaurant(new PremiumRestaurant("P1", "מיט בר", "בשרים", 4.8, true, 30.0, 150.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P2", "שגב ארט", "שף", 4.9, false, 40.0, 200.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P3", "מחניודה", "שף", 4.7, false, 35.0, 180.0, 12.0));
		system.addRestaurant(new PremiumRestaurant("P4", "הדסון", "בשרים", 4.9, false, 30.0, 250.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P5", "טאיזו", "אסייתי", 4.8, false, 35.0, 200.0, 12.0));
		system.addRestaurant(new PremiumRestaurant("P6", "פופינה", "שף", 4.6, false, 30.0, 150.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P7", "שילה", "פירות ים", 4.7, false, 40.0, 220.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P8", "פסטל", "צרפתי", 4.5, true, 35.0, 180.0, 10.0));
		system.addRestaurant(new PremiumRestaurant("P9", "בלו סקיי", "שף", 4.8, true, 40.0, 250.0, 15.0));
		system.addRestaurant(new PremiumRestaurant("P10", "אופא", "טבעוני", 4.6, true, 30.0, 150.0, 10.0));

		// Creating 3 rest admin
		system.addRestAdmin(new RestAdmin("יוסי כהן", "yossi_admin", "pass123", new Restaurant[50], 0));
		system.addRestAdmin(new RestAdmin("דנה לוי", "dana_admin", "pass456", new Restaurant[50], 0));
		system.addRestAdmin(new RestAdmin("אלי אוחנה", "eli_admin", "pass789", new Restaurant[50], 0));

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
	// Handles system admin login and sub-menu
	private static void adminLogin(Scanner scanner, DeliverySystem system, Admin mainAdmin) {
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
	private static void restAdminLogin(Scanner scanner, DeliverySystem system) {
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
	private static void riderLogin(Scanner scanner, DeliverySystem system) {
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
	private static void customerLogin(Scanner scanner, DeliverySystem system) {
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
	private static void addCustomer(Scanner scanner, DeliverySystem system) {
		System.out.println("Add Customer");

		System.out.print("Enter customer code (e.g. C11): ");
		String code = scanner.nextLine();
		if (!isNonEmpty(code)) {
			System.out.println("Error: Customer code cannot be empty.");
			return;
		}
		if (system.findCustomerById(code) != null) {
			System.out.println("Error: A customer with this code already exists.");
			return;
		}

		// First name - letters only, no digits
		System.out.print("Enter first name (letters only): ");
		String firstName = scanner.nextLine();
		if (!isLettersOnly(firstName)) {
			System.out.println("Error: First name must contain letters only, no digits or special characters.");
			return;
		}

		// Last name - letters and spaces allowed (compound names)
		System.out.print("Enter last name (letters only, spaces allowed): ");
		String lastName = scanner.nextLine();
		if (!isLettersAndSpaces(lastName)) {
			System.out.println("Error: Last name must contain letters only.");
			return;
		}

		// City - letters and spaces only
		System.out.print("Enter city (letters only): ");
		String city = scanner.nextLine();
		if (!isLettersAndSpaces(city)) {
			System.out.println("Error: City must contain letters only.");
			return;
		}

		// Street - letters, numbers and spaces allowed
		System.out.print("Enter street address (e.g. Herzl 10): ");
		String street = scanner.nextLine();
		if (!isNonEmpty(street)) {
			System.out.println("Error: Street address cannot be empty.");
			return;
		}

		// Zipcode - digits only, 5-7 digits
		System.out.print("Enter zipcode (5-7 digits): ");
		String zipcode = scanner.nextLine();
		if (!isValidZipcode(zipcode)) {
			System.out.println("Error: Zipcode must be 5-7 digits only.");
			return;
		}

		// Phone - 10 digits, dash after 3rd digit optional
		System.out.print("Enter phone (e.g. 0501234567 or 050-1234567): ");
		String phone = scanner.nextLine();
		if (!isValidPhone(phone)) {
			System.out.println("Error: Phone must be 10 digits (e.g. 0501234567 or 050-1234567).");
			return;
		}

		// Email validation
		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		if (!isValidEmail(email)) {
			System.out.println(
					"Error: Invalid email. Must contain exactly one '@', a dot after '@', not at start or end.");
			return;
		}

		// Credit balance - non-negative double
		System.out.print("Enter credit balance (e.g. 0.0): ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Credit balance must be a number.");
			scanner.nextLine();
			return;
		}
		double creditBalance = scanner.nextDouble();
		scanner.nextLine();
		if (creditBalance < 0) {
			System.out.println("Error: Credit balance cannot be negative.");
			return;
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
	private static void addRestAdmin(Scanner scanner, DeliverySystem system) {
		System.out.println(" Add Restaurant Manager");

		System.out.print("Enter manager full name: ");
		String name = scanner.nextLine();
		if (!isNonEmpty(name)) {
			System.out.println("Error: Name cannot be empty.");
			return;
		}

		System.out.print("Enter username: ");
		String username = scanner.nextLine();
		if (!isNonEmpty(username)) {
			System.out.println("Error: Username cannot be empty.");
			return;
		}
		if (system.findRestAdminByUsername(username) != null) {
			System.out.println("Error: A manager with this username already exists.");
			return;
		}

		System.out.print("Enter password: ");
		String password = scanner.nextLine();
		if (!isNonEmpty(password)) {
			System.out.println("Error: Password cannot be empty.");
			return;
		}

		RestAdmin newAdmin = new RestAdmin(name, username, password, new Restaurant[50], 0);
		boolean added = system.addRestAdmin(newAdmin);
		if (added) {
			System.out.println("Restaurant manager added successfully! Username: " + username);
		} else {
			System.out.println("Error: Could not add manager.");
		}
	}

	// Assigns an existing restaurant manager to an existing restaurant
	private static void assignManagerToRestaurant(Scanner scanner, DeliverySystem system) {
		System.out.println("Assign Manager to Restaurant");

		System.out.print("Enter manager username: ");
		String username = scanner.nextLine();
		if (!isNonEmpty(username)) {
			System.out.println("Error: Username cannot be empty.");
			return;
		}
		RestAdmin admin = system.findRestAdminByUsername(username);
		if (admin == null) {
			System.out.println("Error: Manager not found.");
			return;
		}

		System.out.print("Enter restaurant code: ");
		String restCode = scanner.nextLine();
		if (!isNonEmpty(restCode)) {
			System.out.println("Error: Restaurant code cannot be empty.");
			return;
		}
		Restaurant restaurant = system.findRestaurantById(restCode);
		if (restaurant == null) {
			System.out.println("Error: Restaurant not found.");
			return;
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
	private static void addRestaurant(Scanner scanner, DeliverySystem system) {
		System.out.println("Add Restaurant");
		System.out.println("Choose restaurant type:");
		System.out.println("1. Regular Restaurant");
		System.out.println("2. Fast Food Restaurant");
		System.out.println("3. Premium Restaurant");
		System.out.print("Select: ");
		String typeChoice = scanner.nextLine();

		if (!typeChoice.equals("1") && !typeChoice.equals("2") && !typeChoice.equals("3")) {
			System.out.println("Error: Invalid selection. Please choose 1, 2, or 3.");
			return;
		}

		System.out.print("Enter restaurant code (e.g. R11): ");
		String code = scanner.nextLine();
		if (!isNonEmpty(code)) {
			System.out.println("Error: Code cannot be empty.");
			return;
		}
		if (system.findRestaurantById(code) != null) {
			System.out.println("Error: A restaurant with this code already exists.");
			return;
		}

		System.out.print("Enter restaurant name: ");
		String name = scanner.nextLine();
		if (!isNonEmpty(name)) {
			System.out.println("Error: Name cannot be empty.");
			return;
		}

		System.out.print("Enter kitchen type (e.g. Italian, Asian): ");
		String kitchenType = scanner.nextLine();
		if (!isNonEmpty(kitchenType)) {
			System.out.println("Error: Kitchen type cannot be empty.");
			return;
		}

		System.out.print("Enter rating (0.0 - 5.0): ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Rating must be a number.");
			scanner.nextLine();
			return;
		}
		double rating = scanner.nextDouble();
		scanner.nextLine();
		if (rating < 0 || rating > 5) {
			System.out.println("Error: Rating must be between 0.0 and 5.0.");
			return;
		}

		System.out.print("Is the restaurant open? (true/false): ");
		String openStr = scanner.nextLine();
		if (!openStr.equals("true") && !openStr.equals("false")) {
			System.out.println("Error: Please enter 'true' or 'false'.");
			return;
		}
		boolean isOpen = openStr.equals("true");

		System.out.print("Enter basic delivery fee: ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Delivery fee must be a number.");
			scanner.nextLine();
			return;
		}
		double deliveryFee = scanner.nextDouble();
		scanner.nextLine();
		if (deliveryFee < 0) {
			System.out.println("Error: Delivery fee cannot be negative.");
			return;
		}

		if (typeChoice.equals("1")) {
			system.addRestaurant(new Restaurant(code, name, kitchenType, rating, isOpen, deliveryFee));
			System.out.println("Regular restaurant added successfully! Code: " + code);

		} else if (typeChoice.equals("2")) {
			System.out.print("Enter average prep time in minutes (whole number): ");
			int prepTime = readPositiveInt(scanner);
			if (prepTime == -1)
				return;

			System.out.print("Enter fast delivery extra cost: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Extra cost must be a number.");
				scanner.nextLine();
				return;
			}
			double fastExtra = scanner.nextDouble();
			scanner.nextLine();
			if (fastExtra < 0) {
				System.out.println("Error: Extra cost cannot be negative.");
				return;
			}
			system.addRestaurant(
					new FastFoodRestaurant(code, name, kitchenType, rating, isOpen, deliveryFee, prepTime, fastExtra));
			System.out.println("Fast food restaurant added successfully! Code: " + code);

		} else {
			System.out.print("Enter minimum order cost: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Minimum cost must be a number.");
				scanner.nextLine();
				return;
			}
			double minCost = scanner.nextDouble();
			scanner.nextLine();
			if (minCost < 0) {
				System.out.println("Error: Minimum cost cannot be negative.");
				return;
			}

			System.out.print("Enter extra commission percentage: ");
			if (!scanner.hasNextDouble()) {
				System.out.println("Error: Commission must be a number.");
				scanner.nextLine();
				return;
			}
			double commission = scanner.nextDouble();
			scanner.nextLine();
			if (commission < 0) {
				System.out.println("Error: Commission cannot be negative.");
				return;
			}
			system.addRestaurant(
					new PremiumRestaurant(code, name, kitchenType, rating, isOpen, deliveryFee, minCost, commission));
			System.out.println("Premium restaurant added successfully! Code: " + code);
		}
	}

	// Adds a new rider to the system.
	private static void addRider(Scanner scanner, DeliverySystem system) {
		System.out.println("Add Rider");

		System.out.print("Enter rider ID number (exactly 9 digits): ");
		String id = scanner.nextLine();
		if (!isValidId(id)) {
			System.out.println("Error: ID must be exactly 9 digits.");
			return;
		}
		if (system.findRiderById(id) != null) {
			System.out.println("Error: A rider with this ID already exists.");
			return;
		}

		System.out.print("Enter full name: ");
		String fullName = scanner.nextLine();
		if (!isNonEmpty(fullName)) {
			System.out.println("Error: Name cannot be empty.");
			return;
		}

		System.out.print("Enter phone (e.g. 0501234567 or 050-1234567): ");
		String phone = scanner.nextLine();
		if (!isValidPhone(phone)) {
			System.out.println("Error: Phone must be 10 digits (e.g. 0501234567 or 050-1234567).");
			return;
		}

		System.out.print("Enter vehicle type (e.g. Bicycle, Scooter, Car): ");
		String vehicle = scanner.nextLine();
		if (!isNonEmpty(vehicle)) {
			System.out.println("Error: Vehicle type cannot be empty.");
			return;
		}

		Rider newRider = new Rider(id, fullName, phone, vehicle, true, new Order[50], 0);
		boolean added = system.addRider(newRider);
		if (added) {
			System.out.println("Rider added successfully! ID: " + id);
		} else {
			System.out.println("Error: Could not add rider.");
		}
	}

	// Assigns an available rider to an existing order.
	private static void assignRiderToOrder(Scanner scanner, DeliverySystem system) {
		System.out.println("Assign Rider to Order");

		System.out.print("Enter rider ID: ");
		String riderId = scanner.nextLine();
		if (!isNonEmpty(riderId)) {
			System.out.println("Error: Rider ID cannot be empty.");
			return;
		}
		Rider rider = system.findRiderById(riderId);
		if (rider == null) {
			System.out.println("Error: Rider not found.");
			return;
		}
		if (!rider.isIsAvailable()) {
			System.out.println("Error: Rider is not available.");
			return;
		}

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

		order.setRiderId(riderId);
		rider.addOrderToRider(order);
		rider.setIsAvailable(false);
		System.out.println("Rider " + rider.getFullName() + " assigned to order " + orderId + " successfully.");
	}

	// Creates a new order for a RestAdmin.
	private static void addOrder(Scanner scanner, DeliverySystem system, RestAdmin restAdmin) {
		System.out.println("Add Order");

		System.out.print("Enter customer code: ");
		String customerId = scanner.nextLine();
		if (!isNonEmpty(customerId)) {
			System.out.println("Error: Customer code cannot be empty.");
			return;
		}
		if (system.findCustomerById(customerId) == null) {
			System.out.println("Error: Customer not found in the system.");
			return;
		}

		System.out.print("Enter restaurant code: ");
		String restCode = scanner.nextLine();
		if (!isNonEmpty(restCode)) {
			System.out.println("Error: Restaurant code cannot be empty.");
			return;
		}
		Restaurant restaurant = system.findRestaurantById(restCode);
		if (restaurant == null) {
			System.out.println("Error: Restaurant not found.");
			return;
		}
		if (!restAdmin.managesRestaurant(restCode)) {
			System.out.println("Error: You are not responsible for this restaurant.");
			return;
		}

		System.out.print("Enter base order amount: ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Amount must be a number.");
			scanner.nextLine();
			return;
		}
		double baseAmount = scanner.nextDouble();
		scanner.nextLine();
		if (baseAmount <= 0) {
			System.out.println("Error: Amount must be positive.");
			return;
		}

		// Check minimum for premium restaurants
		if (restaurant instanceof PremiumRestaurant) {
			PremiumRestaurant pr = (PremiumRestaurant) restaurant;
			if (baseAmount < pr.getMinOrderCost()) {
				System.out.println("Error: Amount " + baseAmount + " is below the minimum of " + pr.getMinOrderCost()
						+ " for this restaurant.");
				return;
			}
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

		// Calculate final price using polymorphism (calls the correct override per
		// type)
		double finalPrice = restaurant.calculateFinalPrice(baseAmount);

		Order newOrder = new Order(orderId, customerId, restaurant, restCode, null, day, month, year, 0, 0, 0,
				baseAmount, finalPrice, "Sent");

		boolean added = system.addOrder(newOrder);
		if (added) {
			System.out.println("Order added successfully! Code: " + orderId + " | Final price: " + finalPrice);
		} else {
			System.out.println("Error: Could not add order.");
		}
	}

	// Customer places a new order.
	private static void placeOrder(Scanner scanner, DeliverySystem system, Customer customer) {
		System.out.println("Place New Order");

		System.out.print("Enter restaurant code: ");
		String restCode = scanner.nextLine();
		if (!isNonEmpty(restCode)) {
			System.out.println("Error: Restaurant code cannot be empty.");
			return;
		}
		Restaurant restaurant = system.findRestaurantById(restCode);
		if (restaurant == null) {
			System.out.println("Error: Restaurant not found.");
			return;
		}

		System.out.print("Enter base order amount: ");
		if (!scanner.hasNextDouble()) {
			System.out.println("Error: Amount must be a number.");
			scanner.nextLine();
			return;
		}
		double baseAmount = scanner.nextDouble();
		scanner.nextLine();
		if (baseAmount <= 0) {
			System.out.println("Error: Amount must be positive.");
			return;
		}

		// Check minimum for premium restaurants
		if (restaurant instanceof PremiumRestaurant) {
			PremiumRestaurant pr = (PremiumRestaurant) restaurant;
			if (baseAmount < pr.getMinOrderCost()) {
				System.out.println("Error: Amount " + baseAmount + " is below the minimum of " + pr.getMinOrderCost()
						+ " for this restaurant.");
				return;
			}
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
	private static void updateOrderStatus(Scanner scanner, DeliverySystem system, Rider rider) {
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
			System.out.println("Status updated to: Delivered | Date: " + day + "/" + month + "/" + year);

		} else {
			System.out.println("Invalid selection.");
		}
	}

	// Prints all orders assigned to the given rider.
	private static void printRiderOrders(Rider rider) {
		System.out.println("Orders for Rider: " + rider.getFullName() + " ");
		Order[] orders = rider.getCompletedOrders();
		int count = rider.getOrdersCount();
		if (count == 0) {
			System.out.println("No orders found.");
			return;
		}
		for (int i = 0; i < count; i++) {
			System.out.println(orders[i].toString());
		}
	}

	// Prints all orders placed by the given customer
	private static void printCustomerOrders(DeliverySystem system, Customer customer) {
		System.out.println(" Orders for: " + customer.getFirstName() + " " + customer.getLastName() + " ");
		Order[] allOrders = system.getOrders();
		int count = system.getOrdersCount();
		boolean found = false;
		for (int i = 0; i < count; i++) {
			if (allOrders[i].getCustomerId().equals(customer.getCustomerCode())) {
				System.out.println(allOrders[i].toString());
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

		System.out.print("Enter new phone (press Enter to keep current: " + customer.getPhone() + "): ");
		String newPhone = scanner.nextLine();
		if (isNonEmpty(newPhone)) {
			if (!isValidPhone(newPhone)) {
				System.out.println("Error: Invalid phone format. Phone was not updated.");
			} else {
				customer.setPhone(newPhone);
				System.out.println("Phone updated successfully.");
			}
		}
	}

	// Displays full details of a restaurant found by code.
	private static void viewRestaurantByCode(Scanner scanner, DeliverySystem system) {
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