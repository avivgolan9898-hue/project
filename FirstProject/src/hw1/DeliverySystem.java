package hw1;

import java.util.Arrays;

public class DeliverySystem {

	// class attributes
	private Customer[] customers;
//	private ArrayList<Customer> customers;
	private int customersCount;
	private RestAdmin[] restAdmins;
	private int restAdminsCount;
	private Restaurant[] restaurants;
	private int restaurantsCount;
	private Rider[] riders;
	private int ridersCount;
	private Order[] orders;
	private int ordersCount;

	// getters and setters
	public Customer[] getCustomers() {
		return customers;
	}

	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}

	public int getCustomersCount() {
		return customersCount;
	}

	public void setCustomersCount(int customersCount) {
		this.customersCount = customersCount;
	}

	public RestAdmin[] getRestAdmins() {
		return restAdmins;
	}

	public void setRestAdmins(RestAdmin[] restAdmins) {
		this.restAdmins = restAdmins;
	}

	public int getRestAdminsCount() {
		return restAdminsCount;
	}

	public void setRestAdminsCount(int restAdminsCount) {
		this.restAdminsCount = restAdminsCount;
	}

	public Restaurant[] getRestaurants() {
		return restaurants;
	}

	public void setRestaurants(Restaurant[] restaurants) {
		this.restaurants = restaurants;
	}

	public int getRestaurantsCount() {
		return restaurantsCount;
	}

	public void setRestaurantsCount(int restaurantsCount) {
		this.restaurantsCount = restaurantsCount;
	}

	public Rider[] getRiders() {
		return riders;
	}

	public void setRiders(Rider[] riders) {
		this.riders = riders;
	}

	public int getRidersCount() {
		return ridersCount;
	}

	public void setRidersCount(int ridersCount) {
		this.ridersCount = ridersCount;
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}

	public int getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(int ordersCount) {
		this.ordersCount = ordersCount;
	}

	// full constructor
	public DeliverySystem() {
		super();
		this.customers = new Customer[0];
		this.customersCount = 0;
		this.restAdmins = new RestAdmin[0];
		this.restAdminsCount = 0;
		this.restaurants = new Restaurant[0];
		this.restaurantsCount = 0;
		this.riders = new Rider[0];
		this.ridersCount = 0;
		this.orders = new Order[0];
		this.ordersCount = 0;
	}

	// to string
	@Override
	public String toString() {
		return "DeliverySystem [customers=" + Arrays.toString(customers) + ", customersCount=" + customersCount
				+ ", restAdmins=" + Arrays.toString(restAdmins) + ", restAdminsCount=" + restAdminsCount
				+ ", restaurants=" + Arrays.toString(restaurants) + ", restaurantsCount=" + restaurantsCount
				+ ", riders=" + Arrays.toString(riders) + ", ridersCount=" + ridersCount + ", orders="
				+ Arrays.toString(orders) + ", ordersCount=" + ordersCount + "]";
	}

	// Adding a customer
	public boolean addCustomer(Customer customer) {
		for (int i = 0; i < this.customersCount; i++) {
			if (this.customers[i].equals(customer))
				return false;
		}
		this.customers = java.util.Arrays.copyOf(this.customers, this.customersCount + 1);
		this.customers[this.customersCount] = customer;
		this.customersCount++;
		return true;
	}

	// Adding a restaurant manager
	public boolean addRestAdmin(RestAdmin admin) {
		for (int i = 0; i < this.restAdminsCount; i++) {
			if (this.restAdmins[i].equals(admin))
				return false;
		}
		this.restAdmins = java.util.Arrays.copyOf(this.restAdmins, this.restAdminsCount + 1);
		this.restAdmins[this.restAdminsCount] = admin;
		this.restAdminsCount++;
		return true;
	}

	// Adding a restaurant
	public boolean addRestaurant(Restaurant restaurant) {
		for (int i = 0; i < this.restaurantsCount; i++) {
			if (this.restaurants[i].equals(restaurant))
				return false;
		}
		this.restaurants = java.util.Arrays.copyOf(this.restaurants, this.restaurantsCount + 1);
		this.restaurants[this.restaurantsCount] = restaurant;
		this.restaurantsCount++;
		return true;
	}

	// Adding a rider
	public boolean addRider(Rider rider) {
		for (int i = 0; i < this.ridersCount; i++) {
			if (this.riders[i].equals(rider))
				return false;
		}
		this.riders = java.util.Arrays.copyOf(this.riders, this.ridersCount + 1);
		this.riders[this.ridersCount] = rider;
		this.ridersCount++;
		return true;
	}

	// Adding an order
	public boolean addOrder(Order order) {
		for (int i = 0; i < this.ordersCount; i++) {
			if (this.orders[i].equals(order))
				return false;
		}
		this.orders = java.util.Arrays.copyOf(this.orders, this.ordersCount + 1);
		this.orders[this.ordersCount] = order;
		this.ordersCount++;
		return true;
	}

	// Search for a customer by customer code
	public Customer findCustomerById(String customerId) {
		for (int i = 0; i < this.customersCount; i++) {
			if (this.customers[i].getCustomerCode().equals(customerId)) {
				return this.customers[i];
			}
		}
		return null;
	}

	// Search for a restaurant manager by username
	public RestAdmin findRestAdminByUsername(String username) {
		for (int i = 0; i < this.restAdminsCount; i++) {
			if (this.restAdmins[i].getUsername().equals(username)) {
				return this.restAdmins[i];
			}
		}
		return null;
	}

	// Search for a restaurant manager by username AND password
	public RestAdmin findRestAdminByCredentials(String username, String password) {
		for (int i = 0; i < this.restAdminsCount; i++) {
			if (this.restAdmins[i].getUsername().equals(username)
					&& this.restAdmins[i].getPassword().equals(password)) {
				return this.restAdmins[i];
			}
		}
		return null;
	}

	// Search for a restaurant by restaurant code
	public Restaurant findRestaurantById(String restaurantId) {
		for (int i = 0; i < this.restaurantsCount; i++) {
			if (this.restaurants[i].getRestaurantCode().equals(restaurantId)) {
				return this.restaurants[i];
			}
		}
		return null;
	}

	// Search for a rider by ID card
	public Rider findRiderById(String idNumber) {
		for (int i = 0; i < this.ridersCount; i++) {
			if (this.riders[i].getId().equals(idNumber)) {
				return this.riders[i];
			}
		}
		return null;
	}

	// Search for an order by order code
	public Order findOrderById(String orderId) {
		for (int i = 0; i < this.ordersCount; i++) {
			if (this.orders[i].getOrderId().equals(orderId)) {
				return this.orders[i];
			}
		}
		return null;
	}
}
