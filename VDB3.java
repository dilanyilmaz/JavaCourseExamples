import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner; 
//java -cp postgresql-42.5.0.jar VDB2.java
//grup bazında filtreleme having kullanılır
//
public class VDB3
{
	String url = "jdbc:postgresql:test";
	String user = "postgres";
	String password = "A123456a";
	//alfanumerik ifadeleri sql de belirtmek için tek tırnak kullanırız. Varchar gibi mesela
	public Connection connect()
	{
		Connection conn = null;
        try
		{
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("Connected to the PostgreSQL server successfully.");
		}
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return conn;
	}

	public static void main(String[] args)
	{		
			Scanner input = new Scanner(System.in);
			ArrayList<String> countryList=new ArrayList<String>();
			VDB3 app = new VDB3();
			//dizinin kaç elemanlı olduğunun bilinme sorununu ortadan kaldırmak için,
			//bellek yönetimi için diziler daha verimli 
			//(array list of strings) ArrayList<String>
			
		try
		{	
			Connection conn = app.connect();
			Statement st = conn.createStatement();
			
			String stmt ="SELECT \"Name\",\"Id\" FROM public.\"Country\"";
			
			//String stmt3 ="SELECT \"Name\" FROM public.\"City\" where \"CountryId\" = "+stmt+"";
			
		   ResultSet rs = st.executeQuery(stmt);
			//ResultSet rs2 = st.executeQuery(stmt3);
			
			while(rs.next()){
				
				String stmt3 ="SELECT \"Name\" FROM public.\"City\" where \"CountryId\" = "+rs.getString(2)+"";
				
				countryList.add(rs2.getString(1));
				ResultSet rs2 = st.executeQuery(stmt3);
			}
			for(String country : countryList){
					System.out.println(country);
			}
			
			rs.close();
			st.close();

		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	static class complexType{
		public int id;
		public String price;
	}
}