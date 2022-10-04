import java.sql.*;

public class AppDB
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
		AppDB app = new AppDB();
		try
		{
			Connection conn = app.connect();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM test");
			int satir=0;
			int satir1=0;
			int[]a=new int[4];
			String[]test=new String[4];
			while (rs.next())
			{
				a[satir++]=Integer.decode(rs.getString(1));
				test[satir1++]=rs.getString(2);
				System.out.println(rs.getString(1)+" "+rs.getString(2));
			}
			rs.close();
			st.close();
			for(int i=0;i<satir;i++){
				System.out.println(a[i]);
			}
			for(int i=0;i<satir1;i++){

				System.out.println(test[i]);
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}