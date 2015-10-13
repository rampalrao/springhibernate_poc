package com.itech.test.dao;

import java.util.List;

import com.itech.test.entity.Sport;

public interface StudentSportDAO {

	public String getSportCategory(Long studentId);

	public List<Sport> getSportList(Long studentId);
}
