package hw1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

public class DeliveryDataBase {

	// class attributes
	private Admin systemAdministrator;
	private ArrayList<RestAdmin> restAdmins;
	private ArrayList<Restaurant> restaurants;
	private ArrayList<Customer> customers;
	private ArrayList<Rider> riders;
	private ArrayList<Order> orders;
	private HashMap<Integer, ArrayList<Order>> ordersByCustomer;
	private Hashtable<Integer, ArrayList<Restaurant>> restaurantsByCustomer;
	private HashMap<Integer, Double> totalPaymentsByCustomer;

	// getters and setters
	public Admin getSystemAdministrator() {
		return systemAdministrator;
	}

	public void setSystemAdministrator(Admin systemAdministrator) {
		this.systemAdministrator = systemAdministrator;
	}

	public ArrayList<RestAdmin> getRestAdmins() {
		return restAdmins;
	}

	public void setRestAdmins(ArrayList<RestAdmin> restAdmins) {
		this.restAdmins = restAdmins;
	}

	public ArrayList<Restaurant> getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(ArrayList<Restaurant> restaurants) {
		this.restaurants = restaurants;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Rider> getRiders() {
		return riders;
	}

	public void setRiders(ArrayList<Rider> riders) {
		this.riders = riders;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}

	public HashMap<Integer, ArrayList<Order>> getOrdersByCustomer() {
		return ordersByCustomer;
	}

	public void setOrdersByCustomer(HashMap<Integer, ArrayList<Order>> ordersByCustomer) {
		this.ordersByCustomer = ordersByCustomer;
	}

	public Hashtable<Integer, ArrayList<Restaurant>> getRestaurantsByCustomer() {
		return restaurantsByCustomer;
	}

	public void setRestaurantsByCustomer(Hashtable<Integer, ArrayList<Restaurant>> restaurantsByCustomer) {
		this.restaurantsByCustomer = restaurantsByCustomer;
	}

	public HashMap<Integer, Double> getTotalPaymentsByCustomer() {
		return totalPaymentsByCustomer;
	}

	public void setTotalPaymentsByCustomer(HashMap<Integer, Double> totalPaymentsByCustomer) {
		this.totalPaymentsByCustomer = totalPaymentsByCustomer;
	}

	public int getCustomersCount() {
		return customers.size();
	}

	public int getRestAdminsCount() {
		return restAdmins.size();
	}

	public int getRestaurantsCount() {
		return restaurants.size();
	}

	public int getRidersCount() {
		return riders.size();
	}

	public int getOrdersCount() {
		return orders.size();
	}

	// constructor
	public DeliveryDataBase() {
		super();
		this.systemAdministrator = new Admin("System Admin", "admin", "12345");
		this.restAdmins = new ArrayList<>();
		this.restaurants = new ArrayList<>();
		this.customers = new ArrayList<>();
		this.riders = new ArrayList<>();
		this.orders = new ArrayList<>();
		this.ordersByCustomer = new HashMap<>();
		this.restaurantsByCustomer = new Hashtable<>();
		this.totalPaymentsByCustomer = new HashMap<>();
	}

	// to string
	@Override
	public String toString() {
		return "DeliveryDataBase [systemAdministrator=" + systemAdministrator + ", restAdmins=" + restAdmins
				+ ", restaurants=" + restaurants + ", customers=" + customers + ", riders=" + riders + ", orders="
				+ orders + "]";
	}

	// Adding a customer
	public boolean addCustomer(Customer customer) {
		if (customers.contains(customer))
			return false;
		customers.add(customer);
		return true;
	}

	// Adding a restaurant manager
	public boolean addRestAdmin(RestAdmin admin) {
		if (restAdmins.contains(admin))
			return false;
		restAdmins.add(admin);
		return true;
	}

	// Adding a restaurant
	public boolean addRestaurant(Restaurant restaurant) {
		if (restaurants.contains(restaurant))
			return false;
		restaurants.add(restaurant);
		return true;
	}

	// Adding a rider
	public boolean addRider(Rider rider) {
		if (riders.contains(rider))
			return false;
		riders.add(rider);
		return true;
	}

	// Adding an order
	public boolean addOrder(Order order) {
		if (orders.contains(order))
			return false;
		orders.add(order);
		return true;
	}

	// Search for a customer by customer code
	public Customer findCustomerById(String customerId) {
		for (Customer c : customers) {
			if (c.getCustomerCode().equals(customerId))
				return c;
		}
		return null;
	}

	// Search for a restaurant manager by username
	public RestAdmin findRestAdminByUsername(String username) {
		for (RestAdmin a : restAdmins) {
			if (a.getUsername().equals(username))
				return a;
		}
		return null;
	}

	// Search for a restaurant manager by username AND password
	public RestAdmin findRestAdminByCredentials(String username, String password) {
		for (RestAdmin a : restAdmins) {
			if (a.getUsername().equals(username) && a.getPassword().equals(password))
				return a;
		}
		return null;
	}

	// Search for a restaurant by restaurant code
	public Restaurant findRestaurantById(String restaurantId) {
		for (Restaurant r : restaurants) {
			if (r.getRestaurantCode().equals(restaurantId))
				return r;
		}
		return null;
	}

	// Search for a rider by ID card
	public Rider findRiderById(String idNumber) {
		for (Rider r : riders) {
			if (r.getId().equals(idNumber))
				return r;
		}
		return null;
	}

	// Search for an order by order code
	public Order findOrderById(String orderId) {
		for (Order o : orders) {
			if (o.getOrderId().equals(orderId))
				return o;
		}
		return null;
	}

	// a- Add order to HashMap by customer code
	public void addOrderToCustomerMap(int customerCode, Order order) {
		if (!ordersByCustomer.containsKey(customerCode)) {
			ordersByCustomer.put(customerCode, new ArrayList<>());
		}
		ArrayList<Order> customerOrders = ordersByCustomer.get(customerCode);
		if (!customerOrders.contains(order)) {
			customerOrders.add(order);
		}
	}

	// b- Returns active orders for a specific rider
	public ArrayList<Order> getActiveOrdersByRider(String riderId) {
		ArrayList<Order> activeOrders = new ArrayList<>();
		for (Order o : orders) {
			if (riderId.equals(o.getRiderId())
					&& (o.getStatus().equals("On the way") || o.getStatus().equals("Sent"))) {
				activeOrders.add(o);
			}
		}
		return activeOrders;
	}

	// c- Returns premium restaurants ordered by a specific customer
	public ArrayList<Restaurant> getPremiumRestaurantsByCustomer(Customer customer) {
		ArrayList<Restaurant> premiumRests = new ArrayList<>();
		int code = Integer.parseInt(customer.getCustomerCode());
		ArrayList<Restaurant> customerRests = restaurantsByCustomer.get(code);
		if (customerRests != null) {
			for (Restaurant r : customerRests) {
				if (r instanceof PremiumRestaurant) {
					premiumRests.add(r);
				}
			}
		}
		return premiumRests;
	}

	// d- returns the customer with the most orders
	public Customer getMostActiveCustomer() {
		Customer topCustomer = null;
		int maxOrders = 0;
		for (Customer c : customers) {
			int code = Integer.parseInt(c.getCustomerCode());
			ArrayList<Order> customerOrders = ordersByCustomer.get(code);
			int count = (customerOrders != null) ? customerOrders.size() : 0;
			if (count > maxOrders) {
				maxOrders = count;
				topCustomer = c;
			}
		}
		return topCustomer;
	}

	// e- returns the rider with the most completed deliveries
	public Rider getMostActiveRider() {
		Rider topRider = null;
		int maxOrders = 0;
		for (Rider r : riders) {
			int count = r.getOrdersCount();
			if (count > maxOrders) {
				maxOrders = count;
				topRider = r;
			}
		}
		return topRider;
	}

	// f- returns all open restaurants of a specific kitchen type
	public ArrayList<Restaurant> getOpenRestaurantsByKitchenType(String kitchenType) {
		ArrayList<Restaurant> result = new ArrayList<>();
		for (Restaurant r : restaurants) {
			if (r.isIsOpen() && r.getKitchenType().equals(kitchenType)) {
				result.add(r);
			}
		}
		return result;
	}
}