package model;


import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Train;


@WebServlet("/ListOfTrainServlet")
public class ListOfTrainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	Connection con=null;
	Statement stmt=null;
	ResultSet rs=null;

	  @Override
			public void init() throws ServletException {

		try {	
			   con=(Connection) getServletContext().getAttribute("connection");
			   stmt = con.createStatement();
			   }
		catch (Exception e) {
			e.printStackTrace();
		}
	  }
		public void destroy()
		{
			try {
				if(stmt!=null)
				{
					stmt.close();
				}
				if(con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	ResultSet rs=null;
		
		try {
			rs=stmt.executeQuery("select * from train_details ");				
 		Vector<Train> listoftrains = new Vector<Train>();
		   		
		   		while(rs.next())
				{
					String trainName =rs.getString(1);
					String arrTime=rs.getString(2);
					String waitStatus=rs.getString(3);
					
					Train objTrain = new Train();
					objTrain.setTrainName(trainName);
					objTrain.setArrTime(arrTime);
					objTrain.setWaitStatus(waitStatus);
			listoftrains.add(objTrain);
				}
	
		   		request.setAttribute("listofTrain", listoftrains);
		   		request.getRequestDispatcher("ListOfTrains.jsp").forward(request, response);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
