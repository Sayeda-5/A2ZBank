package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.dto.Customer;
import com.masai.dto.CustomerImpl;
//import com.masai.dto.CustomerImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;

public class CustomerDAOImpl implements CustomerDAO {

	@Override
	public void addCustomer(Customer customer) throws SomeThingWrongException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String INSERT_QUERY = "INSERT INTO Customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
			
			//stuff the data in the query
			ps.setInt(1, customer.getId());
			ps.setInt(2, customer.getBranchID());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getAddress());
			ps.setString(6, customer.getGender());
			ps.setString(7, customer.getPhone());
			ps.setString(8, customer.getemail());
			ps.setString(9, customer.getDate());
			
			
			
			//execute query
			ps.executeUpdate();
		}catch(SQLException e) {
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException e) {
				throw new SomeThingWrongException();
			}
		}
		
}
	@Override
	public List<Customer> getCustomerList() throws SomeThingWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		List<Customer> cList = null;
		try {
			connection = DBUtils.connectToDatabase();
			String SELECT_QUERY = "SELECT * FROM st";
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			ResultSet rs = ps.executeQuery();
			if(isResultSetEmpty(rs)) {
				throw new NoRecordFoundException("No Student Found");
			}else {
				cList = getCustomerListFromResultSet(rs);
			}
		}catch(SQLException ex) {
			System.out.println(ex);
		}
		return cList;
	}
	private List<Customer> getCustomerListFromResultSet(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		List<Customer> list = new ArrayList<>();
		while(rs.next()) {
			//Create an object of Employee
			Customer c = new CustomerImpl();
			c.setID(rs.getInt("id"));
			c.setBranchID(rs.getInt("branchID"));
			c.setPassword(rs.getString("password"));
			c.setFirstName(rs.getString("FirstName"));
			c.setLastName(rs.getString("LastName"));
			c.setGender(rs.getString("gender"));
			c.setAddress(rs.getString("Adress"));
			c.setPhone(rs.getString("Phone"));
			c.setEmail(rs.getString("email"));
			c.setPhone(rs.getString("date"));
			list.add(c);
		}
		return list;
	}
	private boolean isResultSetEmpty(ResultSet rs) throws SQLException {
		return (!rs.isBeforeFirst() && rs.getRow() == 0)?true:false;
	}
		
	@Override
	public void updateCustomer(Customer customer) throws SomeThingWrongException {
		
		Connection connection = null;
		try {
			
			connection = DBUtils.connectToDatabase();
			
			String UPDATE_QUERY = "UPDATE category SET branchID=?, FirstName = ?,LastName = ?,gender = ?, Address=?, Phone=?, email=?,date=?   WHERE cat_id = ?";
			
			
			PreparedStatement ps = connection.prepareStatement(UPDATE_QUERY);
			
			//stuff the data in the query
			ps.setInt(1, customer.getBranchID());
//			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getGender());
			ps.setString(6, customer.getAddress());
			ps.setString(7, customer.getPhone());
			ps.setString(8, customer.getemail());
			ps.setString(9, customer.getDate());
			
			ps.setDouble(2, customer.getId());
			
			//execute query
			ps.executeUpdate();
		}catch(SQLException e) {
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException e) {
				throw new SomeThingWrongException();
			}
		}
		
		
	}

	@Override
	public void deleteCustomer(Integer categoryId) throws SomeThingWrongException {
		// TODO Auto-generated method stub
		
		
	}

	
	@Override
	public void findByEmailIdAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findByEmailId(String emailId) {
		// TODO Auto-generated method stub
		
	}
	

	

	
	
}
