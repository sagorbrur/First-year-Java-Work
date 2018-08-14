import java.sql.*;

public class SimpleJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		//Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");
		
		//connect to a database
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost//mydatabase","scott","tiger");
		
		System.out.println("Database connected");
		
		//create a statement
		Statement statement=connection.createStatement();
		
		//execute a statement
		ResultSet resultSet=statement.executeQuery("");
		
	}

}
