package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Bean.Train;

public class FindTrains {
	
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
	public Train findTrain(String tname)throws ClassNotFoundException, SQLException{
        con=getConnection();
         
         Train train=new Train();
			PreparedStatement pst =  con.prepareStatement("select * from train_details where t_name=?");
			pst.setString(1, tname);
			ResultSet rs= pst.executeQuery();
			
			try{
			while(rs.next()){
				
				
				if(tname != null)
					{
				train.setArrTime(rs.getString("arr_time"));
					train.setTrainName(rs.getString("t_name"));
						if("false".equals(rs.getString("Wait_Status"))){
							train.setWaitStatus("false");
							train.getTrainName();
							
					}
						else{
							train.setWaitStatus("true");
						}
				return train;
				}
				
			}
			return null;
			

	}finally{
		rs.close();
		pst.close();
	}}
	


}