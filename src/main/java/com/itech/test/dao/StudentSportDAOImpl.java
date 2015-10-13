package com.itech.test.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.itech.test.entity.Sport;
import com.itech.test.entity.SportCategory;
import com.itech.test.entity.Student;

@Repository
public class StudentSportDAOImpl implements StudentSportDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public String getSportCategory(Long studentId) {
		String sportCategory = null;
		Student student = (Student) sessionFactory.getCurrentSession().get(
				Student.class, studentId);
		if (null != student) {
			SportCategory category = student.getSportCategory();
			if (category != null) {
				sportCategory = category.getCategory_name();
			}
		}
		return sportCategory;
	}

	public List<Sport> getSportList(Long studentId) {
		Set<Sport> sports = null;
		Student student = (Student) sessionFactory.getCurrentSession().get(
				Student.class, studentId);
		if (null != student) {
			sports = student.getSports();
		}
		List<Sport> list = new ArrayList<Sport>(sports);
		return list;
	}

}
