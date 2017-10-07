package com.cg.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.cg.bean.StudentBean;

public interface IStudentDao {

	public int addDetails(StudentBean bean) throws SQLException;

	public ArrayList<StudentBean> retrieveDetails();

}
