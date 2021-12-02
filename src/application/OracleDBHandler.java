package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;
public class OracleDBHandler extends PersistenceHandler{
	private Connection con;
	private void connectionopen()
	{
		try
		{
			con = DriverManager.getConnection("jdbc:oracle:thin:@Arshad:1521:orcl","scott","1234");
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Drivers Loaded Successfully");
			System.out.println("Connection Established Successfully");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Driver Not Loaded");
		}
		catch(SQLException e)
		{
			//System.out.println("Connection Not Established");
			//cnf.printStackTrace();
			System.out.println(e);
		}
		finally
		{
		}		
	}
	private void connectionclose()
	{
		try
		{
			con.close();
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
		}
		catch(SQLException e)
		{
			//System.out.println("Connection Not Established");
			//cnf.printStackTrace();
			System.out.println(e);
		}
		finally
		{
		}	
	}
	void saveParty(Party p)
	{
		try
		{
			this.connectionopen();
			String sql ="INSERT INTO party VALUES(?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1, p.getPserial_no());
			statement.setString(2, p.getParty_name());
			statement.setString(3, p.getPleader_name());
			statement.setString(4, p.getPleader_desig());
			statement.setInt(5,p.getP_mobile());
			statement.setInt(6, p.getP_zip());
			statement.setString(7, p.getP_houseno());
			statement.setString(8, p.getP_town());
			statement.setString(9, p.getP_city());
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				System.out.println("A new record inserted successfully");
			}
		}
		catch(SQLException e)
		{
			//System.out.println("Connection Not Established");
			//cnf.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			this.connectionclose();
		}
	}
	void saveCandidate(Candidate c)
	{
		try
		{
			this.connectionopen();
			String sql ="INSERT INTO candidate VALUES(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement=con.prepareStatement(sql);
			statement.setInt(1,c.getCand_cnic());
			statement.setString(2, c.getC_f_name());
			statement.setString(3, c.getC_l_name());
			statement.setInt(4,c.getC_p_no());
			statement.setInt(5,c.getC_mobile());
			statement.setInt(6, c.getC_dob());
			statement.setString(7, c.getC_h_no());
			statement.setString(8, c.getC_town());
			statement.setString(9, c.getC_city());
			statement.setInt(10, c.getC_zip());
			int rowsInserted=statement.executeUpdate();
			if(rowsInserted>0)
			{
				System.out.println("A new record inserted successfully");
			}
		}
		catch(SQLException e)
		{
			//System.out.println("Connection Not Established");
			//cnf.printStackTrace();
			System.out.println(e);
		}
		finally
		{
			this.connectionclose();
		}
	}

}
