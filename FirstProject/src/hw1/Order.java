package hw1;

public class Order {

	// class attributes
	private String OrderId;
	private String CustomerId;
	private Restaurant Restaurant;
	private String RestaurantId;
	private String RiderId;
	private int OrderDay;
	private int OrderMonth;
	private int OrderYear;
	private int deliveryDay;
	private int deliveryMonth;
	private int deliveryYear;
	private double baseAmount;
	private double finalPrice;
	private String status;

	// getters and setters
	public String getOrderId() {
		return OrderId;
	}

	public void setOrderId(String orderId) {
		OrderId = orderId;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

	public Restaurant getRestaurant() {
		return Restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		Restaurant = restaurant;
	}

	public String getRestaurantId() {
		return RestaurantId;
	}

	public void setRestaurantId(String restaurantId) {
		RestaurantId = restaurantId;
	}

	public String getRiderId() {
		return RiderId;
	}

	public void setRiderId(String riderId) {
		RiderId = riderId;
	}

	public int getOrderDay() {
		return OrderDay;
	}

	public void setOrderDay(int orderDay) {
		OrderDay = orderDay;
	}

	public int getOrderMonth() {
		return OrderMonth;
	}

	public void setOrderMonth(int orderMonth) {
		OrderMonth = orderMonth;
	}

	public int getOrderYear() {
		return OrderYear;
	}

	public void setOrderYear(int orderYear) {
		OrderYear = orderYear;
	}

	public int getDeliveryDay() {
		return deliveryDay;
	}

	public void setDeliveryDay(int deliveryDay) {
		this.deliveryDay = deliveryDay;
	}

	public int getDeliveryMonth() {
		return deliveryMonth;
	}

	public void setDeliveryMonth(int deliveryMonth) {
		this.deliveryMonth = deliveryMonth;
	}

	public int getDeliveryYear() {
		return deliveryYear;
	}

	public void setDeliveryYear(int deliveryYear) {
		this.deliveryYear = deliveryYear;
	}

	public double getBaseAmount() {
		return baseAmount;
	}

	public void setBaseAmount(double baseAmount) {
		this.baseAmount = baseAmount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	//
	public void setFinalPrice() {
		if (this.Restaurant != null) {
			this.finalPrice = this.Restaurant.calculateFinalPrice(this.baseAmount);
		}
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// full constructor
	public Order(String orderId, String customerId, hw1.Restaurant restaurant, String restaurantId, String riderId,
			int orderDay, int orderMonth, int orderYear, int deliveryDay, int deliveryMonth, int deliveryYear,
			double baseAmount, double finalPrice, String status) {
		super();
		OrderId = orderId;
		CustomerId = customerId;
		Restaurant = restaurant;
		RestaurantId = restaurantId;
		RiderId = riderId;
		OrderDay = orderDay;
		OrderMonth = orderMonth;
		OrderYear = orderYear;
		this.deliveryDay = 0;
		this.deliveryMonth = 0;
		this.deliveryYear = 0;
		this.baseAmount = baseAmount;
		this.finalPrice = finalPrice;
		this.status = status;
	}

	// to string
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", CustomerId=" + CustomerId + ", Restaurant=" + Restaurant
				+ ", RestaurantId=" + RestaurantId + ", RiderId=" + RiderId + ", OrderDay=" + OrderDay + ", OrderMonth="
				+ OrderMonth + ", OrderYear=" + OrderYear + ", deliveryDay=" + deliveryDay + ", deliveryMonth="
				+ deliveryMonth + ", deliveryYear=" + deliveryYear + ", baseAmount=" + baseAmount + ", finalPrice="
				+ finalPrice + ", status=" + status + "]";
	}
	// Comparison function
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(o instanceof Order) {
			return this.getOrderId().equals(((Order)o).getOrderId());
		}
		return false;
	}

}
