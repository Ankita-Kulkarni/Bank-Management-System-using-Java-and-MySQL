// to establish connection with the database 
import java.sql.Connection;
import java.sql.DriverManager;
	public class connection {
	static Connection con = null ; 
	Connection getConnection(){
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/BankSystem","root","123");
	}
	catch (Exception e) {
	System.out.println("Connection Failed!"); }
	return con;
	}
}
