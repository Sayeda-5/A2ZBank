package com.masai.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.UI.LoggedINUser;
import com.masai.dto.Customer;
import com.masai.dto.CustomerImpl;
//import com.masai.dto.CustomerImpl;
import com.masai.exception.NoRecordFoundException;
import com.masai.exception.SomeThingWrongException;

public class CustomerDAOImpl implements CustomerDAO {

	private int email;
	@Override
	public void addCustomer(Customer customer) throws SomeThingWrongException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String INSERT_QUERY = "INSERT INTO Customer(id,branchID,passwors,FirstName,LastName,gender,Adress,Phone,email,date) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
			
			//stuff the data in the query
			ps.setInt(1, customer.getId());
			ps.setInt(2, customer.getBranchID());
			ps.setString(3, customer.getPassword());
			ps.setString(4, customer.getFirstName());
			ps.setString(5, customer.getLastName());
			ps.setString(6, customer.getAddress());
			ps.setString(7, customer.getGender());
			ps.setString(8, customer.getPhone());
			ps.setString(9, customer.getemail());
			ps.setString(10, customer.getDate());
			
			
			
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
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getGender());
			ps.setString(6, customer.getAddress());
			ps.setString(7, customer.getPhone());
			ps.setString(8, customer.getemail());
			ps.setString(9, customer.getDate());
			
			ps.setDouble(10, customer.getId());
			
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
	public void deleteCustomer(Integer id) throws SomeThingWrongException  {
		
		deleteCustomer(id);
		
		Connection connection = null;
		try {
			
			connection = DBUtils.connectToDatabase();
			
			String DELETE_QUERY = "DELETE FROM customer WHERE id = ?";
			
			PreparedStatement ps = connection.prepareStatement(DELETE_QUERY);
			
			ps.setInt(1, id);
			
			ps.executeUpdate();
		}catch(SQLException sqlEx) {
		
			throw new SomeThingWrongException();
			
		}finally {
			
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException sqlEX) {
				throw new SomeThingWrongException();
			}
		}
		
	}

	
	@Override
	public void findByEmailIdAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Customer> findByEmailId(String emailId) throws SomeThingWrongException, NoRecordFoundException {
		Connection connection = null;
		List<Customer> ls = null;
		try {
			
			connection = DBUtils.connectToDatabase();
			
			String SELECT_QUERY = "SELECT * FROM customer WHERE email LIKE ?";
			
			PreparedStatement ps = connection.prepareStatement(SELECT_QUERY);
			ps.setString(1, "%" + email + "%");
			
			ResultSet resultSet = ps.executeQuery();
			
			if(DBUtils.isResultSetEmpty(resultSet)) {
				throw new NoRecordFoundException("No customer Found for given email");
			}
			
			ls = getCustomerListFromResultSet(resultSet);
		}catch(SQLException sqlEx) {
			throw new SomeThingWrongException();
		}finally {
			try {
				DBUtils.closeConnection(connection);				
			}catch(SQLException sqlEX) {
				throw new SomeThingWrongException();
			}
		}
			return ls;
		}
		
	@Override
	public void Login(String username, String password) throws SomeThingWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void logout() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void changePassword(String oldPassword, String newPassword)
			throws SomeThingWrongException, NoRecordFoundException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void updateNameOfUser(String name) throws SomeThingWrongException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			
			connection = DBUtils.connectToDatabase();
			String UPDATE_QUERY = "UPDATE user SET FirstName = ? WHERE id = ?";
			
			
			PreparedStatement ps = connection.prepareStatement(UPDATE_QUERY);
			
			
			ps.setString(1, name);
			ps.setInt(2, LoggedINUser.loggedInUserId);
			
			//execute query
			ps.executeUpdate();
		}catch(SQLException sqlEx) {
			sqlEx.printStackTrace();
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException EX) {
				throw new SomeThingWrongException();
			}
		}
		
	}
	@Override
	public void deleteUser() throws SomeThingWrongException {
		// TODO Auto-generated method stub
		Connection connection = null;
		try {
			
			connection = DBUtils.connectToDatabase();
			
	
			String DELETE_QUERY = "DELETE FROM user WHERE id = ?";
			
			
			PreparedStatement ps = connection.prepareStatement(DELETE_QUERY);
			
			
			ps.setInt(1, LoggedINUser.loggedInUserId);
			
			ps.executeUpdate();
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException sqlEX) {
				throw new SomeThingWrongException();
			}
		}
		
	}
	@Override
	public void createaccout(Customer customer) throws SomeThingWrongException {
		// TODO Auto-generated method stub
		
		Connection connection = null;
		try {
			//connect to database
			connection = DBUtils.connectToDatabase();
			//prepare the query
			String INSERT_QUERY = "INSERT INTO user (user_id, name, username, password, registration_date) VALUES (?, ?, ?, ?, ?)";
			
			//get the prepared statement object
			PreparedStatement ps = connection.prepareStatement(INSERT_QUERY);
			
			//stuff the data in the query
			ps.setInt(1, customer.getId());
			ps.setString(2, customer.getPassword());
			ps.setString(3, customer.getFirstName());
			ps.setString(4, customer.getLastName());
			ps.setString(5, customer.getGender());
			ps.setString(6, customer.getAddress());
			ps.setString(7, customer.getemail());
			ps.setString(8, customer.getPhone());
			ps.setDate(9, Date.valueOf(customer.getDate()));
			
			//execute query
			ps.executeUpdate();
		}catch(SQLException Ex) {
			Ex.printStackTrace();
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(connection);				
			}catch(SQLException EX) {
				throw new SomeThingWrongException();
			}
		}
	}
	public void logout1() {
		LoggedINUser.loggedInUserId = 0;
	}
	
}
