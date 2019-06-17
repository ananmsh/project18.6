package entities;

import java.sql.Time;

public class Location {

	private String LocName;
   //private String LocAtMap;
	private String LocType;
	private String LocDescription;
	private Boolean special;
	private Time SumRecommendedTime;
	

	
	
	
	public String getLocName() {
		return LocName;
	}
	public void setLocName(String locName) {
		LocName = locName;
	}
	public String getLocType() {
		return LocType;
	}
	public void setLocType(String locType) {
		LocType = locType;
	}
	public String getLocDescription() {
		return LocDescription;
	}
	public void setLocDescription(String locDescription) {
		LocDescription = locDescription;
	}
	public Time getSumRecommendedTime() {
		return SumRecommendedTime;
	}
	public void setSumRecommendedTime(Time sumRecommendedTime) {
		SumRecommendedTime = sumRecommendedTime;
	}
	public Boolean getSpecial() {
		return special;
	}
	public void setSpecial(Boolean special) {
		this.special = special;
	}
	
	
	
}
