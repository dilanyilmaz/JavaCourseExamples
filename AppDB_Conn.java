import java.sql.*;
//.* demek bütünn herşeyi kullanmak istiyorum demektedir.

public class AppDB_Conn
{
	String url = "jdbc:postgresql:test";//(jdbc protokol ile erişicem- veri tabanı tipi-veri tabanı adı)-(adres)
	String user = "postgres";
	String password = "A123456a";

	public Connection connect()
	{//Connection bağlantı yapan sınıfın adı ve basit bir tür değil void int gibi;
		Connection conn = null;//connection nesnemiz olmak zorunda o bağlantı üzerinden bağlantı yapacağız - komplex yapı
		// int default değeri 0 sıfır dır. double ve floatta 0.0 connectionda da null yani hiç bir şeyle bağlantısı yok.
		// factoriy desayn pattern den kaynaklı; new le oluşturunca komplex tip oluyor örneğin diziler
		// try-catch veritabanı işlemlerinde kullanılır .
		//sıradışı durum yönetimi mecburi kullandırır javada.
		
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
		AppDB_Conn app = new AppDB_Conn();
		Connection conn = app.connect();
	}
}