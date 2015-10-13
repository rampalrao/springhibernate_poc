package com.itech.test.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sport")
public class Sport {

	@Id
	@GeneratedValue
	@Column(name = "Sport_id")
	private Long sport_id;
	private String sport_name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category_id")
	private SportCategory sportCategory;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id")
	private Student student;

	public Long getSport_id() {
		return sport_id;
	}

	public void setSport_id(Long sport_id) {
		this.sport_id = sport_id;
	}

	public String getSport_name() {
		return sport_name;
	}

	public void setSport_name(String sport_name) {
		this.sport_name = sport_name;
	}

	public SportCategory getSportCategory() {
		return sportCategory;
	}

	public void setSportCategory(SportCategory sportCategory) {
		this.sportCategory = sportCategory;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
