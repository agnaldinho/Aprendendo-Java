import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Agenda {

	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/agenda";
		String user = "root";
		String password = "agnaldo1907";

		try {
			// Registrar o driver
			Class.forName(driver);
			String query = "SELECT * FROM contato WHERE nome like 'A%' ";
			try {
				// Estabelecer conex�o
				Connection con = DriverManager.getConnection(url, user, password);
				// Criando o objeto statement - usado para executar consultas
				Statement st = con.createStatement();
				// O m�todo executeQuery retorna um objeto ResultSet object o qual
				// representa o resultado da consulta.
				ResultSet rs = st.executeQuery(query);

				int colNum = rs.getMetaData().getColumnCount();
				while (rs.next()) {
					for (int i = 1; i <= colNum; i++) {
						System.out.print(rs.getString(i) + "  ");
					}
					System.out.println();
				}
				rs.close();
				st.close();
				con.close();

			} catch (SQLException e) {
				System.out.println(e);
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}
}
