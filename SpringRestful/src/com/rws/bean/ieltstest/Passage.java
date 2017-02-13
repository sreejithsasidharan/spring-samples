package com.rws.bean.ieltstest;

import java.util.List;

public class Passage {

	private String passageId;	

	private String passageContent;
	
	private List <Question> Questions;

	public String getPassageId() {
		return passageId;
	}

	public void setPassageId(String passageId) {
		this.passageId = passageId;
	}

	public String getPassageContent() {
		return passageContent;
	}

	public void setPassageContent(String passageContent) {
		this.passageContent = passageContent;
	}
	public List<Question> getQuestions() {
		return Questions;
	}

	public void setQuestions(List<Question> questions) {
		Questions = questions;
	}

}
