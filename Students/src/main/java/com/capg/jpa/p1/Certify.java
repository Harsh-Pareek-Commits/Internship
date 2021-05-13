package com.capg.jpa.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Certify {
	@Column(name="Technical")
	private String title;
	private String institution;
	
	public Certify() {
		super();
	}
	public Certify(String title, String institution) {
		super();
		this.title = title;
		this.institution = institution;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	
}
