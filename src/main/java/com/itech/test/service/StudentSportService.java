package com.itech.test.service;

import java.util.List;

import com.itech.test.entity.Sport;

public interface StudentSportService {

	public String getSportCategory(Long studentId);

	public List<Sport> getSportList(Long studentId);
}
