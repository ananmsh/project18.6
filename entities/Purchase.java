package entities;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;

public class Purchase {
	
	public LocalDate DateStart;
	public LocalDate DateEnd;
	public LocalDate OneTimeDate;
	public String customerid;
	public String PurchaseType;
	public String getPurchaseType() {
		return PurchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		PurchaseType = purchaseType;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	private String cityname;

	public LocalDate getDateStart() {
		return DateStart;
	}

	public void setDateStart(LocalDate dateStart) {
		DateStart = dateStart;
	}

	public LocalDate getDateEnd() {
		return DateEnd;
	}

	public void setDateEnd(LocalDate dateEnd) {
		DateEnd = dateEnd;
	}

	public LocalDate getOneTimeDate() {
		return OneTimeDate;
	}

	public void setOneTimeDate(LocalDate oneTimeDate) {
		OneTimeDate = oneTimeDate;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}

	
}	
