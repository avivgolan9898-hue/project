package hw1;

import java.util.ArrayList;

public class RestAdmin extends Admin {
	// class attributes in addition to the attributes from Admin
	private ArrayList<Restaurant> ManagedRestaurants;

	// getters and setters
	public ArrayList<Restaurant> getManagedRestaurants() {
		return ManagedRestaurants;
	}

	public void setManagedRestaurants(ArrayList<Restaurant> managedRestaurants) {
		ManagedRestaurants = managedRestaurants;
	}

	// Returns the number of managed restaurants
	public int getCount() {
		return ManagedRestaurants.size();
	}

	// Constructor - initializes an empty restaurants list
	public RestAdmin(String adminName, String username, String password) {
		super(adminName, username, password);
		ManagedRestaurants = new ArrayList<>();
	}

	// to string
	@Override
	public String toString() {
		return "RestAdmin [ManagedRestaurants=" + ManagedRestaurants + ", count=" + getCount() + ", toString()="
				+ super.toString() + "]";
	}

	// Adds a new restaurant to the list (no duplicates)
	public boolean addRestaurant(Restaurant rest) {
		if (!ManagedRestaurants.contains(rest)) {
			ManagedRestaurants.add(rest);
			return true;
		}
		return false;
	}

	// Checks if this manager is responsible for the restaurant with the given code
	public boolean managesRestaurant(String restaurantCode) {
		for (Restaurant r : ManagedRestaurants) {
			if (r.getRestaurantCode().equals(restaurantCode)) {
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