package com.rws.bean.ieltstest;

import java.util.List;

public class Question {
private String paragraphId;
private String paragraphContent;
private String questionId;
private String question;
private String questionHelptext;
private String questionType;
private String displaySequence;
private List <Option> options;

public String getParagraphId() {
	return paragraphId;
}
public String getDisplaySequence() {
	return displaySequence;
}
public void setDisplaySequence(String displaySequence) {
	this.displaySequence = displaySequence;
}
public void setParagraphId(String paragraphId) {
	this.paragraphId = paragraphId;
}
public String getParagraphContent() {
	return paragraphContent;
}
public void setParagraphContent(String paragraphContent) {
	this.paragraphContent = paragraphContent;
}
public String getQuestionId() {
	return questionId;
}
public void setQuestionId(String questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public String getQuestionHelptext() {
	return questionHelptext;
}
public void setQuestionHelptext(String questionHelptext) {
	this.questionHelptext = questionHelptext;
}
public String getQuestionType() {
	return questionType;
}
public void setQuestionType(String questionType) {
	this.questionType = questionType;
}
public List<Option> getOptions() {
	return options;
}
public void setOptions(List<Option> options) {
	this.options = options;
}


}
