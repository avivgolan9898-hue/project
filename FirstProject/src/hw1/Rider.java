package hw1;

import java.util.Arrays;

public class Rider {

	// class attributes
	private String Id;
	private String FullName;
	private String Phone;
	private String Vehicle;
	private boolean IsAvailable;
	private Order[] CompletedOrders;
	private int OrdersCount;

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

	public Order[] getCompletedOrders() {
		return CompletedOrders;
	}

	public void setCompletedOrders(Order[] completedOrders) {
		CompletedOrders = completedOrders;
	}

	public int getOrdersCount() {
		return OrdersCount;
	}

	public void setOrdersCount(int ordersCount) {
		OrdersCount = ordersCount;
	}

	// full constructor
	public Rider(String id, String fullName, String phone, String vehicle, boolean isAvailable, Order[] completedOrders,
			int ordersCount) {
		super();
		Id = id;
		FullName = fullName;
		Phone = phone;
		Vehicle = vehicle;
		IsAvailable = isAvailable;
		CompletedOrders = completedOrders;
		OrdersCount = ordersCount;
	}

	// Adds an order to the rider's order array
	public boolean addOrderToRider(Order order) {
		if (this.OrdersCount < this.CompletedOrders.length) {
			this.CompletedOrders[this.OrdersCount] = order;
			this.OrdersCount++;
			return true;
		}
		return false;
	}

	// to string
	@Override
	public String toString() {
		return "Rider [Id=" + Id + ", FullName=" + FullName + ", Phone=" + Phone + ", Vehicle=" + Vehicle
				+ ", IsAvailable=" + IsAvailable + ", CompletedOrders=" + Arrays.toString(CompletedOrders)
				+ ", OrdersCount=" + OrdersCount + "]";
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
