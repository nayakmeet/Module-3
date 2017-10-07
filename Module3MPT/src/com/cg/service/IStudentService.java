package com.cg.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentService {

	public int addDetails(StudentBean bean) throws SQLException;



	public ArrayList<StudentBean> retrieveDetails();

}
