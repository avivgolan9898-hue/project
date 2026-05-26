package hw1;

public class FastFoodRestaurant extends Restaurant {

	// class attributes in addition to the attributes frome Restaurant
	private int AveragePrepTime;
	private double FastDeliveryExtra;

	// getters and setters
	public int getAveragePrepTime() {
		return AveragePrepTime;
	}

	public void setAveragePrepTime(int averagePrepTime) {
		AveragePrepTime = averagePrepTime;
	}

	public double getFastDeliveryExtra() {
		return FastDeliveryExtra;
	}

	public void setFastDeliveryExtra(double fastDeliveryExtra) {
		FastDeliveryExtra = fastDeliveryExtra;
	}

	// full constructor
	public FastFoodRestaurant(String restaurantCode, String restaurantName, String kitchenType, double rating,
			boolean isOpen, double basicDeliveryFee, int averagePrepTime, double fastDeliveryExtra) {
		super(restaurantCode, restaurantName, kitchenType, rating, isOpen, basicDeliveryFee);
		AveragePrepTime = averagePrepTime;
		FastDeliveryExtra = fastDeliveryExtra;
	}

	// to string
	@Override
	public String toString() {
		return "FastFoodRestaurant [AveragePrepTime=" + AveragePrepTime + ", FastDeliveryExtra=" + FastDeliveryExtra
				+ ", toString()=" + super.toString() + "]";
	}

	// Calculates the final price
	@Override
	public double calculateFinalPrice(double baseAmount) {
		return baseAmount + this.BasicDeliveryFee + this.FastDeliveryExtra;
	}

}
