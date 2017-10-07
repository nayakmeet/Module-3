package com.cg.dao;

import java.io.IOException;
import java.rmi.Naming;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.NamingException;
import com.cg.bean.StudentBean;
import com.cg.dbutil.DbUtil;

public class StudentDaoImpl implements IStudentDao {
	
	int value = 0;
	Connection conn=null;
	@Override
	public int addDetails(StudentBean bean) throws SQLException {
	
		int rows=0;
	
			try {
				conn=DbUtil.getConnection();
				System.out.println(conn);
				PreparedStatement ps=conn.prepareStatement("insert into Student_score values(sudent_id.nextval,?,?,?,?,?,?,?)");
				ps.setString(1,bean.getStudName());
				ps.setInt(2,bean.getAge());
				ps.setString(3, bean.getState());
				ps.setString(4,bean.getGender());
				ps.setInt(5, bean.getCentum());
				ps.setInt(6, bean.getAttempts());
				ps.setInt(7, bean.getTotal());
				
				rows=ps.executeUpdate();
			
				
				/*PreparedStatement ps1 =conn.prepareStatement("Select stud_id.currval from dual");
				ResultSet rs=ps1.executeQuery();
			
				while(rs.next())
					{
						value=rs.getInt(1);
						
					}*/
			
			} catch (NamingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	return rows;
	}
	@Override
	public ArrayList<StudentBean> retrieveDetails() {
	
		ArrayList<StudentBean> list=new ArrayList<StudentBean>();
		
		try
		{
	
		conn=DbUtil.getConnection();
		
		System.out.println(conn);
		
		String sql="Select * from Student_score";
	
		Statement st=conn.createStatement();
		ResultSet rs=st.executeQuery(sql);
		
		
		while(rs.next())
		{
				int studId=rs.getInt(1);
				String studName=rs.getString(2);
				int age=rs.getInt(3);
				String state =rs.getString(4);
				String gender =rs.getString(5);
				int centum=rs.getInt(6);
				int attempts=rs.getInt(7);
				int total=rs.getInt(8);

				list.add(new StudentBean(studId,studName,age,state,gender,centum,attempts,total));
			}
		}
		catch(SQLException|IOException | NamingException e)
		{
		 e.printStackTrace();
		}
			return list;
	}

}
