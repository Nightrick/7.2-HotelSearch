package co.grandcircus.HotelSearch;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//The name in the quotes must match the DB collection name (case sensitive)
@Document("hotels")
public class Hotel {
	
	@Id
	private String id;
	private String name;
	private String city;
	@Field("pricepernight") private int pricePerNight;
	//The @Field annotation allows us to indicate the name of the variable in the linked DB, if the variable name is different than the field name listed
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPricePerNight() {
		return pricePerNight;
	}
	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}

	public Hotel(){
		
	}
	
	public Hotel(String id, String name, String city, int pricePerNight) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}
	
	

}
