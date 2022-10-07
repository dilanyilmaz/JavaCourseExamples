package net.javaiskur;

public class Address {
	public int Id;
	public String Address;
	public int CityId;
	public City City = new City();
	public Customer Customer = new Customer();

}
