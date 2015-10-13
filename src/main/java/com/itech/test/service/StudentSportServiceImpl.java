package com.itech.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itech.test.dao.StudentSportDAO;
import com.itech.test.entity.Sport;

@Service
public class StudentSportServiceImpl implements StudentSportService{
	
	@Autowired
	private StudentSportDAO sportDAO;

	@Transactional
	public String getSportCategory(Long studentId) {
		return sportDAO.getSportCategory(studentId);
	}

	@Transactional
	public List<Sport> getSportList(Long studentId) {
		return sportDAO.getSportList(studentId);
	}

}
