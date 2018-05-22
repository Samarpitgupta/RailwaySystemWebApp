package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Bean.Platform;

public class GetFreePlatform {
	
	String driverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String userName = "sam";
	String password = "root" ;
 Connection con= null;
	public  Connection getConnection() throws ClassNotFoundException, SQLException {
		if(con==null){
			Class.forName(driverName);
		con = DriverManager.getConnection(url, userName, password);
		}
		return con;
	}
	public Platform getFreePlatform()throws ClassNotFoundException, SQLException{
        con=getConnection();
        Platform platform=new Platform();
		int flag=0;
		
        Statement st=con.createStatement();
        
	    ResultSet rs =st.executeQuery("select * from platform_details ");
	    try{
	    while(rs.next())
	    {
	    	
	    	platform.setPlatNo(rs.getInt("plat_no"));
	    	String all=rs.getString("Allotted_status");
	    	platform.setAllottedStatus(all);
	    	
	    	if ("false".equalsIgnoreCase(all))   
	    	{
	    		
	    	flag=1;
	    	break;
	    	}
	   
	    }
	    if(flag==0){
	    	return null;}
	    
	   
	    else{
	    		    
	    	return platform;
	    }}finally{
	    	rs.close();
	    	st.close();
	    }
	    }
}
