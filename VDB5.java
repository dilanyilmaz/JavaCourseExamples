import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner; 
//java -cp postgresql-42.5.0.jar VDB2.java
//grup bazında filtreleme having kullanılır
//
public class VDB5
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
			ArrayList<String> bookList=new ArrayList<String>();
			VDB5 app = new VDB5();

		try
		{	
			Connection conn = app.connect();
			
			Statement st = conn.createStatement();
			String stmt = "SELECT \"Author_Id\",\"Category_Id\",\"name\" FROM public.\"book\"";
			
			ResultSet rs = st.executeQuery(stmt);
			
			while (rs.next())
			{
				bookList.add(rs.getString(3));
				
				Statement stAuthor=conn.createStatement();
				ResultSet rsAuthor = stAuthor.executeQuery("SELECT \"name\" FROM public.\"author\" WHERE \"id\" = " + rs.getString(1));

					while(rsAuthor.next()){
						bookList.add(rsAuthor.getString(1));
					}

				rsAuthor.close();
				stAuthor.close();
			} 
			
			for(String books : bookList){
				System.out.println(books);
			}
			for(String booklar : bookList){
				System.out.println(booklar);
			}

			//rs.close();
			//st.close();

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