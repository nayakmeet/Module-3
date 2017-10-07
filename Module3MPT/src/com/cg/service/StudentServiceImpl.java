package com.cg.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.bean.StudentBean;
import com.cg.dao.IStudentDao;
import com.cg.dao.StudentDaoImpl;

public class StudentServiceImpl implements IStudentService {

	IStudentDao dao=new StudentDaoImpl();
	
	@Override
	public int addDetails(StudentBean bean) throws SQLException {
		
		return dao.addDetails(bean);
	}

	@Override
	public ArrayList<StudentBean> retrieveDetails() {
		

		return dao.retrieveDetails();
	}

}
