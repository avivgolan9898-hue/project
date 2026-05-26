package hw1;

import java.util.Arrays;

public class RestAdmin extends Admin {
	// class attributes in addition to the attributes frome Admin
	private Restaurant[] ManagedRestaurants;
	private int count;

	// getters and setters
	public Restaurant[] getManagedRestaurants() {
		return ManagedRestaurants;
	}

	public void setManagedRestaurants(Restaurant[] managedRestaurants) {
		ManagedRestaurants = managedRestaurants;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	// full constructor
	public RestAdmin(String adminName, String username, String password, Restaurant[] managedRestaurants, int count) {
		super(adminName, username, password);
		ManagedRestaurants = managedRestaurants;
		this.count = count;
	}

	// to string
	@Override
	public String toString() {
		return "RestAdmin [ManagedRestaurants=" + Arrays.toString(ManagedRestaurants) + ", count=" + count
				+ ", toString()=" + super.toString() + "]";
	}

	// Adds a new restaurant to the array
	public boolean addRestaurant(Restaurant rest) {
		if (this.count < this.ManagedRestaurants.length) {
			this.ManagedRestaurants[this.count] = rest;
			this.count++;
			return true;
		}
		return false;
	}

	// Checks if this manager is responsible for the restaurant with the given code
	public boolean managesRestaurant(String restaurantCode) {
		for (int i = 0; i < this.count; i++) {
			if (this.ManagedRestaurants[i].getRestaurantCode().equals(restaurantCode)) {
				return true;
			}
		}
		return false;
	}

	// Comparison function
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof RestAdmin) {
			return this.getUsername().equals(((RestAdmin) o).getUsername());
		}
		return false;
	}

}
