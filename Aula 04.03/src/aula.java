import java.sql.Connection;
import java.sql.DriverManager;

public class aula {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306";
		String user = "root";
		String password = "agnaldo1907";

		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Conex�o Realizada!");
		} catch (Exception e) {
			System.out.println("Problemas na conex�o!");
			e.printStackTrace();
		}
	}
}
