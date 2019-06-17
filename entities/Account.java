package entities;


public abstract class Account  extends Person{
	
	private int AccountID;
	private String UserName;
	private String Password;
	private boolean Logged;
	private int LoginCount;
	
	public enum UserType {
		Customer, CompanyManager, DepartmentEmployee, DepartmentManager
	};
	public UserType userType;

	public Account() {
		//super();
	}	
	
	public Account(String id, String firstName, String lastName, String eMail, String mobileNum, int accountID,
			String userName, String password, UserType userType, boolean logged) {
		super(id, firstName, lastName, eMail, mobileNum);
		this.AccountID = accountID;
		this.UserName = userName;
		this.Password = password;
		this.userType = userType;
	}
	
	

	public boolean isLogged() {
		return Logged;
	}

	public void setLogged(boolean logged) {
		this.Logged = logged;
	}


	public int getAccountID() {
		return AccountID;
	}


	public void setAccountID(int accountID) {
		AccountID = accountID;
	}


	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}


	public int getLoginCount() {
		return LoginCount;
	}


	public void setLoginCount(int loginCount) {
		LoginCount = loginCount;
	}


	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	
	public void setUserTypeString(String userType)
	{
		switch(userType) {
		case "Customer":
			this.userType= UserType.Customer;
			break;
		case "CompanyManager":
			this.userType=UserType.CompanyManager;
			break;
		case "DepartmentEmployee":
			this.userType=UserType.DepartmentEmployee;
		case "DepartmentManager":
			this.userType=UserType.DepartmentManager;
		}
	}
}
