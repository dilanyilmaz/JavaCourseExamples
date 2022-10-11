package net.java.iskur;
import java.sql.*;
import java.util.ArrayList;

public class TestDBApp {

	public static void main(String[] args) {
		String url = "jdbc:postgresql:test";
		String user = "postgres";
		String password = "A123456a";

		Connection conn = null;
    	try {
    		conn = DriverManager.getConnection(url, user, password);
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	try {
    		ArrayList<Customer> listCustomers = new ArrayList<Customer>();
			Statement stCustomer = conn.createStatement();
			String stmtCustomer = "SELECT * FROM public.\"Customer\"";
			ResultSet rsCustomer = stCustomer.executeQuery(stmtCustomer);
			while(rsCustomer.next()) {
				Customer cst = new Customer();
				cst.Id = rsCustomer.getInt("Id");
				cst.Name = rsCustomer.getString("Name");
				cst.Surname = rsCustomer.getString("Surname");
				Statement stAddress = conn.createStatement();
				String stmtAddressOfACustomer = "SELECT * FROM public.\"Address\" WHERE \"CustomerId\" = " +  cst.Id;
				ResultSet rsAddress = stAddress.executeQuery(stmtAddressOfACustomer);
				while(rsAddress.next()) {
					Address adr = new Address();
					adr.Id = rsAddress.getInt("Id");
					adr.Address = rsAddress.getString("Address");
					adr.CityId = rsAddress.getInt("CityId");
					Statement stCity = conn.createStatement();
					String stmtCityOfAnAddress = "SELECT * FROM public.\"City\" WHERE \"Id\" = " + adr.CityId;
					ResultSet rsCity = stCity.executeQuery(stmtCityOfAnAddress);
					while(rsCity.next()) {
						City ct = new City();
						ct.Id = rsCity.getInt("Id");
						ct.Name = rsCity.getString("Name");
						adr.City = ct;
					}
					rsCity.close();
					stCity.close();
					cst.Addresses.add(adr);
				}
				rsAddress.close();
				stAddress.close();
				listCustomers.add(cst);
			}
			rsCustomer.close();
			stCustomer.close();
			
			for(Customer cust : listCustomers) {
				System.out.println(cust.Id + "\t" + cust.Name + " " + cust.Surname);
				for(Address addr : cust.Addresses) {
					System.out.println("\t" + addr.Address + "\n\t\t" + addr.City.Name);
				}
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
