import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insertdb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String DB_URL = "jdbc:mysql://localhost:3306/students";
		 String USER = "root";
		 String PASS = "Freshworks@2022";
		 
		 try {
		 	 Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         String sql = "INSERT INTO book VALUES(6,'kanmani',205);";
	         Statement stmt =  conn.createStatement();
	         String sql2 = "INSERT INTO book VALUES (7, 'Mahnaz', 250);";
	         stmt.executeUpdate(sql2);
	         stmt.executeUpdate(sql);
	         System.out.println("Inserted records into the table..."); 
	        
	         
		 }
		 catch(SQLException e){
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}

}
class InsertTable{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String DB_URL = "jdbc:mysql://localhost:3306/students";
		 String USER = "root";
		 String PASS = "Freshworks@2022";
		 
		 try {
			 Connection con = DriverManager.getConnection(DB_URL,USER,PASS);
			 String sql = "select*from book; ";
			 Statement stmt = con.createStatement();
			 ResultSet result = stmt.executeQuery(sql);
			 
			 while(result.next()) {
				 int id = result.getInt(1);
				 String name = result.getString(2);
				 int price = result.getInt(3);
				 
				 System.out.println("id :"+id+"name : "+name+"price: "+price );
			 }
			 
		 }
		 catch(SQLException e) {
			 System.out.println(e);
			 e.printStackTrace();
		 }
	}
	
}
