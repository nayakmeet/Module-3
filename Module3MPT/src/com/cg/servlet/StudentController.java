package com.cg.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.bean.StudentBean;
import com.cg.service.IStudentService;
import com.cg.service.StudentServiceImpl;




@WebServlet("*.obj")
public class StudentController extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		String path= request.getServletPath();
		String target=null;
		StudentBean bean=new StudentBean();
		IStudentService service=new StudentServiceImpl();
		
		try 
		{
		switch(path)
		{
		case "/retrieve.obj":
			ArrayList<StudentBean> list=service.retrieveDetails();
			
			HttpSession session1=request.getSession();
			session1.setAttribute("list", list);
			target="StudentScores.jsp";
			break;
		
		
		case "/add.obj":
		
			target="NewStudent.jsp";
			break;
			
		case "/insert.obj":
			
			String studName=request.getParameter("studName");
			
			String age=request.getParameter("age");
			int Age=Integer.parseInt(age);
			
			String state=request.getParameter("state");
			
			String gender=request.getParameter("gender");
			
			String subScores=request.getParameter("scores");
			int Scores=Integer.parseInt(subScores);
			
			String numAttempts=request.getParameter("attempts");
			int Attempts=Integer.parseInt(numAttempts);
			
			String Total=request.getParameter("total");
			int total=Integer.parseInt(Total);
			
			
			
			bean.setStudName(studName);
			bean.setAge(Age);
			bean.setGender(gender);
			bean.setCentum(Scores);
			bean.setAttempts(Attempts);
			bean.setTotal(total);
			
			
		
				res = service.addDetails(bean);
				System.out.println(res);
				
				target="insertSuccess.jsp";
				break;
			}
		
			RequestDispatcher rd  = request.getRequestDispatcher(target);
			rd.forward(request, response);
		
		}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
	}
	
}
