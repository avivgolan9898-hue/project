package hw1;

import java.util.ArrayList;

public class Rider {

	// class attributes
	private String Id;
	private String FullName;
	private String Phone;
	private String Vehicle;
	private boolean IsAvailable;
	private ArrayList<Order> CompletedOrders;

	// getters and setters
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getVehicle() {
		return Vehicle;
	}

	public void setVehicle(String vehicle) {
		Vehicle = vehicle;
	}

	public boolean isIsAvailable() {
		return IsAvailable;
	}

	public void setIsAvailable(boolean isAvailable) {
		IsAvailable = isAvailable;
	}

	public ArrayList<Order> getCompletedOrders() {
		return CompletedOrders;
	}

	public void setCompletedOrders(ArrayList<Order> completedOrders) {
		CompletedOrders = completedOrders;
	}

	public int getOrdersCount() {
		return CompletedOrders.size();
	}

	// full constructor
	public Rider(String id, String fullName, String phone, String vehicle, boolean isAvailable) {
		super();
		Id = id;
		FullName = fullName;
		Phone = phone;
		Vehicle = vehicle;
		IsAvailable = isAvailable;
		CompletedOrders = new ArrayList<>();
	}

	// Adds an order to the rider's order array
	public boolean addOrderToRider(Order order) {
		if (!CompletedOrders.contains(order)) {
			CompletedOrders.add(order);
			return true;
		}
		return false;
	}

	// to string
	@Override
	public String toString() {
		return "Rider [Id=" + Id + ", FullName=" + FullName + ", Phone=" + Phone + ", Vehicle=" + Vehicle
				+ ", IsAvailable=" + IsAvailable + ", CompletedOrders=" + CompletedOrders + ", OrdersCount="
				+ getOrdersCount() + "]";
	}

	// Comparison function
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Rider) {
			return this.getId().equals(((Rider) o).getId());
		}
		return false;
	}

}