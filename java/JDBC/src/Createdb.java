import java.sql.*;
public class Createdb {

	public static void main(String[] args) {
		 String DB_URL = "jdbc:mysql://localhost:3306/klassy";
		 String USER = "root";
		 String PASS = "Freshworks@2022";
		 
		 try {
			 	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         String sql = "select* from menu_price;";
		         String sql2 = "select id,name,mailId from users;";
		         Statement stmt = conn.createStatement();
		         ResultSet rs = stmt.executeQuery(sql);
		         ResultSet result = stmt.executeQuery(sql2);
		         
		         while(rs.next()) {
		        	 int id = rs.getInt(1);
//		        	 int menu_id = rs.getInt(2);
		        	 int price = rs.getInt(3);
//		        	 Date created_date = rs.getDate(4);
		        	 
		        	 System.out.println("  ID : "+id+" PRICE : "+price);
		         }
		         while(result.next()) {
		        	 int id = result.getInt(1);
		        	 String name = result.getString(2);
		        	 String email = result.getString(3);

		        	 
		        	 System.out.println("  ID : "+id+" NAME : "+name+" EMAIL : "+email);
		         }
		         
		         conn.close();
		         
		 }
		 
		 catch(SQLException e){
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}

}

class Createdb2 {

	public static void main(String[] args) {
		 String DB_URL = "jdbc:mysql://localhost:3306/klassy";
		 String USER = "root";
		 String PASS = "Freshworks@2022";
		 
		 try {
			 	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         String sql2 = "select id,name,mailId from users;";
		         Statement stmt = conn.createStatement();
		         ResultSet result = stmt.executeQuery(sql2);
		         
		        
		         while(result.next()) {
		        	 int id = result.getInt(1);
		        	 String name = result.getString(2);
		        	 String email = result.getString(3);

		        	 
		        	 System.out.println("  ID : "+id+" NAME : "+name+" EMAIL : "+email);
		         }
		         
		         conn.close();
		         
		 }
		 
		 catch(SQLException e){
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}

}

