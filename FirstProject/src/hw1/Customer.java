package hw1;

public class Customer {

	// class attributes
	private String customerCode;
	private String firstName;
	private String lastName;
	private String CityAddress;
	private String StreetAddress;
	private String ZipcodeAddress;
	private String phone;
	private String email;
	private double creditBalance;

	// getters and setters
	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCityAddress() {
		return CityAddress;
	}

	public void setCityAddress(String cityAddress) {
		CityAddress = cityAddress;
	}

	public String getStreetAddress() {
		return StreetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		StreetAddress = streetAddress;
	}

	public String getZipcodeAddress() {
		return ZipcodeAddress;
	}

	public void setZipcodeAddress(String zipcodeAddress) {
		ZipcodeAddress = zipcodeAddress;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	// full constructor
	public Customer(String customerCode, String firstName, String lastName, String cityAddress, String streetAddress,
			String zipcodeAddress, String phone, String email, double creditBalance) {
		super();
		this.customerCode = customerCode;
		this.firstName = firstName;
		this.lastName = lastName;
		CityAddress = cityAddress;
		StreetAddress = streetAddress;
		ZipcodeAddress = zipcodeAddress;
		this.phone = phone;
		this.email = email;
		this.creditBalance = creditBalance;
	}

	// to string
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", CityAddress=" + CityAddress + ", StreetAddress=" + StreetAddress + ", ZipcodeAddress="
				+ ZipcodeAddress + ", phone=" + phone + ", email=" + email + ", creditBalance=" + creditBalance + "]";
	}

	// Comparison function
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o instanceof Customer) {
			return this.customerCode.equals(((Customer) o).getCustomerCode());
		}
		return false;
	}
}
