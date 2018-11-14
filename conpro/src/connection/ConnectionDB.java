package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionDB {

private static String DRIVER = "com.mysql.cj.jdbc.Driver";
private static String URL = "jdbc:mysql://localhost:3306/conpro?useTimezone=true&serverTimezone=UTC";
private static String USER = "root";
<<<<<<< HEAD
private static String PASS = "dba4599C";
=======
private static String PASS = "trabalhopoo2018";
>>>>>>> 65f6f344dfb416415b0b651d3b353f27bea0d9b8
	
public static Connection getConnection() {
    try {
	Class.forName(DRIVER);
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	return DriverManager.getConnection(URL, USER, PASS);
    } catch (ClassNotFoundException | SQLException e) {
        System.out.printf("Erro de Conexao");
	throw new RuntimeException("Erro de Conexao", e);
    } 
		
}
    
}
