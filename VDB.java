import java.sql.*;
import java.util.Scanner; 
//java -cp postgresql-42.5.0.jar VDB.java
public class VDB
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
	{Scanner input = new Scanner(System.in); 
		VDB app = new VDB();
		try
		
		{	
			Connection conn = app.connect();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM public.\"Country\"");	
			
			
			System.out.println("COUNTRY");
			System.out.print("id degeri (int)");
			int id=input.nextInt();
			System.out.print("Name degeri (string)");
			String CountryName=input.next();
			System.out.print("Area degeri (int)");
			int Area=input.nextInt();
			
			while (rs.next())
			{
				//a[satir] = Integer.decode(rs.getString(1));
				//test[satir] = rs.getString(2);
				//testArr[satir][0] = rs.getString(1);
				//testArr[satir++][1] = rs.getString(2);
				System.out.println(rs.getString(1) + " " + rs.getString(2)+" "+rs.getString(3));
				complexType ct = new complexType();
	
			}
			String stmt="insert into public.\"Country\"(\"Id\",\"Name\",\"Area\") VALUES("+id+",\'"+CountryName+"\',"+Area+")";
			
			System.out.println("CITY");
			System.out.print("id degeri (int)");
			int id2=input.nextInt();
			System.out.print("CountryId degeri (string)");
			int CountryId=input.nextInt();
			System.out.print("cityname degeri (string)");
			String cityName=input.next();
			System.out.print("population degeri (int)");
			int Population=input.nextInt();
			st.executeUpdate(stmt);
			
			String stmt2="insert into public.\"City\"(\"Id\",\"CountryId\",\"Name\",\"Population\") VALUES("+id2+","+CountryId+",\'"+cityName+"\',"+Population+")";
			ResultSet rs2 = st.executeQuery("SELECT * FROM public.\"City\"");	
			
			while (rs2.next())
			{
				//a[satir] = Integer.decode(rs.getString(1));
				//test[satir] = rs.getString(2);
				//testArr[satir][0] = rs.getString(1);
				//testArr[satir++][1] = rs.getString(2);
				System.out.println(rs2.getString(1) + " " + rs2.getString(2)+" "+rs2.getString(3));
				complexType ct = new complexType();
	
			}
			st.executeUpdate(stmt2);
			System.out.println("District");
			System.out.print("id degeri (int)");
			int id3=input.nextInt();
			System.out.print("CityId degeri (int)");
			int CityId=input.nextInt();
			System.out.print("DistrictName degeri (string)");
			String DistrictName=input.next();
			
			String stmt3="insert into public.\"District\"(\"Id\",\"CityId\",\"Name\") VALUES("+id3+","+CityId+","+"\'DistrictName\'"+")";
			
			
			st.executeUpdate(stmt3);
			
			
		//	int satir = 0;
		//	int[] a = new int[5];
		//	String[] test = new String[4];
		//	String[][] testArr = new String[4][2];
		//	complexType[] ctArray = new complexType[5];

			
			
			rs.close();
			st.close();
			System.out.println();

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