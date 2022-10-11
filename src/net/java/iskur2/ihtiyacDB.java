package net.java.iskur2;
import java.sql.*;
import java.util.Scanner; 

public class ihtiyacDB {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		ihtiyacDB idb =new ihtiyacDB();
		Model m = new Model();
		
		String url = "jdbc:postgresql:ihtiyactan";
		String user = "postgres";
		String password = "A123456a";
		
		Connection conn = null;
    	try {
    		conn = DriverManager.getConnection(url, user, password);
    	} catch (SQLException e) {
    		System.out.println(e.getMessage());
    	}
    	
		try {
			Statement st = conn.createStatement();
			System.out.println("Musteri Bilgilerini giriniz");
			System.out.println("Adiniz : ");
			m.Adi=input.next();
			System.out.println("Soyadiniz : ");
			m.Soyadi=input.next();
			System.out.println("Eposta : ");
			m.email=input.next();
			System.out.println("Sifre : ");
			m.sifre=input.next();
			
			String stmt="insert into public.\"Musteri\"(\"Name\",\"Surname\") VALUES('"+m.Adi+"','"+m.Soyadi+"')RETURNING \"Id\";";
			ResultSet rs = st.executeQuery(stmt);
			while(rs.next()) {
			String stmt2="insert into public.\"Kullanici\"(\"MusteriId\",\"Eposta\",\"Sifre\") VALUES("+rs.getInt(1)+",'"+m.email+"','"+m.sifre+"')";
			st.executeUpdate(stmt2);
			}
			st.executeUpdate(stmt);
			rs.close();
			st.close();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
	}
	

}
