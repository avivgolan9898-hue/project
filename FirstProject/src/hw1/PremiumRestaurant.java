package hw1;

public class PremiumRestaurant extends Restaurant {

	// class attributes in addition to the attributes frome Restaurant
	private double MinOrderCost;
	private double ExtraCommission;

	// getters and setters
	public double getMinOrderCost() {
		return MinOrderCost;
	}

	public void setMinOrderCost(double minOrderCost) {
		MinOrderCost = minOrderCost;
	}

	public double getExtraCommission() {
		return ExtraCommission;
	}

	public void setExtraCommission(double extraCommission) {
		ExtraCommission = extraCommission;
	}
	

	// full constructor
	public PremiumRestaurant(String restaurantCode, String restaurantName, String kitchenType, double rating,
			boolean isOpen, double basicDeliveryFee, double minOrderCost, double extraCommission) {
		super(restaurantCode, restaurantName, kitchenType, rating, isOpen, basicDeliveryFee);
		MinOrderCost = minOrderCost;
		ExtraCommission = extraCommission;
	}

	// to string
	@Override
	public String toString() {
		return "PremiumRestaurant [MinOrderCost=" + MinOrderCost + ", ExtraCommission=" + ExtraCommission
				+ ", toString()=" + super.toString() + "]";
	}

	// Calculates the final price
	@Override
	public double calculateFinalPrice(double baseAmount) {
		if (baseAmount < this.MinOrderCost) {
			System.out.println("The order is below the minimum!");
		}
		return (baseAmount + this.BasicDeliveryFee) * (1 + this.ExtraCommission / 100);
	}

}
