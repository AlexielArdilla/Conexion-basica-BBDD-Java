package ar.com.unpaz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MiConexion {
	
	private static String DB_URL ="";
	private static String DB_USER ="";
	private static String DB_PASSWORD="";
	private static String DB_DRIVER_CLASS="";
	
	
	static{
		
		DB_URL="jdbc:sqlserver://localhost:1433;databaseName=CARRERA";
		DB_USER ="sr";
		DB_PASSWORD="1qaz!QAZ";
		DB_DRIVER_CLASS = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		
	}
	
	public static Connection getConnection(){
		
		Connection con = null;
		
		try{
			Class.forName(DB_DRIVER_CLASS);
			con = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
			return (con);
			
			
		}catch(SQLException e){
			
			e.printStackTrace();
			return null;
			
		}catch(ClassNotFoundException e){
			
			e.printStackTrace();
			return null;
		}
		
	} 
	
}
