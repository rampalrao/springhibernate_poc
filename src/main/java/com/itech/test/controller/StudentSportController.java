package com.itech.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itech.test.entity.Sport;
import com.itech.test.service.StudentSportService;

@RestController
@RequestMapping(value = "/rest")
public class StudentSportController {

	@Autowired
	private StudentSportService sportService;

	@RequestMapping(value = "/getCategory/{studentId}")
	public @ResponseBody
	String getSportCategory(@PathVariable Long studentId) {
		return sportService.getSportCategory(studentId);
	}

	@RequestMapping(value = "/getSportList/{studentId}")
	public @ResponseBody
	List<String> getSportList(@PathVariable Long studentId) {
		List<String> sportNames = null;
		List<Sport> sports = sportService.getSportList(studentId);
		if (sports != null && sports.size() > 0) {
			sportNames = new ArrayList<String>();
			for (Sport sport : sports) {
				sportNames.add(sport.getSport_name());
			}
		}
		return sportNames;
	}
}
