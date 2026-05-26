package hw1;

public class Restaurant {

	// class attributes
	protected String RestaurantCode;
	protected String RestaurantName;
	protected String KitchenType;
	protected double Rating;
	protected boolean IsOpen;
	protected double BasicDeliveryFee;

	// getters and setters
	public String getRestaurantCode() {
		return RestaurantCode;
	}

	public void setRestaurantCode(String restaurantCode) {
		RestaurantCode = restaurantCode;
	}

	public String getRestaurantName() {
		return RestaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		RestaurantName = restaurantName;
	}

	public String getKitchenType() {
		return KitchenType;
	}

	public void setKitchenType(String kitchenType) {
		KitchenType = kitchenType;
	}

	public double getRating() {
		return Rating;
	}

	public void setRating(double rating) {
		Rating = rating;
	}

	public boolean isIsOpen() {
		return IsOpen;
	}

	public void setIsOpen(boolean isOpen) {
		IsOpen = isOpen;
	}

	public double getBasicDeliveryFee() {
		return BasicDeliveryFee;
	}

	public void setBasicDeliveryFee(double basicDeliveryFee) {
		BasicDeliveryFee = basicDeliveryFee;
	}

	// full constructor
	public Restaurant(String restaurantCode, String restaurantName, String kitchenType, double rating, boolean isOpen,
			double basicDeliveryFee) {
		super();
		RestaurantCode = restaurantCode;
		RestaurantName = restaurantName;
		KitchenType = kitchenType;
		Rating = rating;
		IsOpen = isOpen;
		BasicDeliveryFee = basicDeliveryFee;
	}

	// to string
	@Override
	public String toString() {
		return "Restaurant [RestaurantCode=" + RestaurantCode + ", RestaurantName=" + RestaurantName + ", KitchenType="
				+ KitchenType + ", Rating=" + Rating + ", IsOpen=" + IsOpen + ", BasicDeliveryFee=" + BasicDeliveryFee
				+ "]";
	}

	// Calculates the final order
	public double calculateFinalPrice(double baseAmount) {
		return baseAmount + this.BasicDeliveryFee;
	}

	// Comparison function
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Restaurant) {
			return this.RestaurantCode.equals(((Restaurant) o).getRestaurantCode());
		}
		return false;
	}

}
