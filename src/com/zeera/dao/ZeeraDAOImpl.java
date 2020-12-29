package com.zeera.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zeera.model.*;

public class ZeeraDAOImpl implements ZeeraDAO{

    	static {
	       try {
	    	Class.forName("com.mysql.jdbc.Driver");
		   }
		   catch (ClassNotFoundException ex) {
		   }
	    }
       
    	private Connection getConnection() throws SQLException {
    		   return DriverManager.getConnection("jdbc:mysql://localhost:3306/zeera","root", "root@65109105");
    		}
    	private void closeConnection(Connection connection) {
    		if (connection == null)
    		   return;
    		try {
    	      connection.close();
    		}
    		catch (SQLException ex) {
    		}
    	}
   
    	public List<MenuItem> listAllItems(){
    		List<MenuItem> result = new ArrayList<>();
    		    
    		String sql = "SELECT * FROM menu_item";
    		
    		Connection connection = null;
    		
    		try {
    			connection = getConnection();
    			PreparedStatement statement = connection.prepareStatement(sql);
    			ResultSet resultSet = statement.executeQuery();
    			
    			while (resultSet.next()) {
    				MenuItem item = new MenuItem();
    				item.setMenu_item_id(resultSet.getLong("menu_item_id"));
    				item.setMenu_item_title(resultSet.getString("menu_item_title"));
    				item.setMenu_item_price(resultSet.getInt("menu_item_price"));
    				item.setMenu_item_description(resultSet.getString("menu_item_description"));
    			    result.add(item);
    			}
    			
    		}
    		catch(SQLException e) {
    		  e.printStackTrace();
    	    } 
       
    		finally {
    			closeConnection(connection);
    		}
    		
    		return result;
        
    	}
		
    	
    	public void insert(MenuItem item) {
		}
		
		public void update(MenuItem item) {
		}
		
		public void delete(MenuItem item) {
		}
}
    	