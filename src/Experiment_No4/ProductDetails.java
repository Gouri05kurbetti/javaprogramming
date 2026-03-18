package Experiment_No4;
import java.sql.*;
public class ProductDetails {
	
	    public static void main(String args[])
	    {
	        try
	        {
	            // Load MySQL Driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Create Connection
	            Connection con = DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/testdb","root","root123");

	            // Create Statement
	            Statement st = con.createStatement();

	            // Execute Query
	            ResultSet rs = st.executeQuery(
	            "SELECT ProductName, ProductPrice FROM product");

	            // Display Data
	            while(rs.next())
	            {
	                String name = rs.getString("ProductName");
	                double price = rs.getDouble("ProductPrice");

	                System.out.println("Product Name: " + name);
	                System.out.println("Product Price: " + price);
	                System.out.println("----------------------");
	            }

	            con.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }
	    }
	}

