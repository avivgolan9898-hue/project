package hw1;

public class Admin {

	// class attributes
	protected String adminName;
	protected String username;
	protected String password;

	public String getAdminName() {
		return adminName;
	}

	// getters and setters
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// full constructor
	public Admin(String adminName, String username, String password) {
		super();
		this.adminName = adminName;
		this.username = username;
		this.password = password;
	}

	// to string
	@Override
	public String toString() {
		return "Admin [adminName=" + adminName + ", username=" + username + ", password=" + password + "]";
	}

}
