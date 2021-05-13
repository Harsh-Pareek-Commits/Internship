package com.capg.jpa.p1;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Students")
public class Student {

	@Id

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USN")
	private int usnId;

	@Column(name = "StudentName")
	private String name;

	private int marks;

	@Embedded
	private Certify technical;

	@Embedded

	@AttributeOverrides({

			@AttributeOverride(name = "title", column = @Column(name = "Non_Technical")),

			@AttributeOverride(name = "institution", column = @Column(name = "Center")), })
	private Certify non_technical;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int usn, String name, int marks) {
		super();
		this.usnId = usn;
		this.name = name;
		this.marks = marks;
	}

	public int getUsnId() {
		return usnId;
	}

	public void setUsnId(int usnId) {
		this.usnId = usnId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Certify getTechnical() {
		return technical;
	}

	public void setTechnical(Certify technical) {
		this.technical = technical;
	}

	public Certify getNon_technical() {
		return non_technical;
	}

	public void setNon_technical(Certify non_technical) {
		this.non_technical = non_technical;
	}

	@Override
	public String toString() {
		return "Student [usnId=" + usnId + ", name=" + name + ", marks=" + marks + ", technical=" + technical + "]";
	}

}
