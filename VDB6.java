import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner; 
//java -cp postgresql-42.5.0.jar VDB2.java
//grup bazında filtreleme having kullanılır
//
public class VDB6
{
	String url = "jdbc:postgresql:test";
	String user = "postgres";
	String password = "A123456a";
	
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
			ArrayList<Country> bookList=new ArrayList<Country>();
			VDB6 app = new VDB6();

		try
		{	
			Connection conn = app.connect();
			
			Statement st = conn.createStatement();
			String stmt = "SELECT \"Name\" FROM public.\"Country\"";
			
			ResultSet rs = st.executeQuery(stmt);
			
			while (rs.next())
			{
				Country ct = new Country();
				ct.Name=rs.getString(1);
				bookList.add(ct);
			} 
			
			for(Country books : bookList){
				System.out.println(books.Name);
			}
			//rs.close();
			//st.close();
				rs.close();
				st.close();

		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
}
class Country{
	public String Name;
	
}