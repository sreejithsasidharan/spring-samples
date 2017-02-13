package com.rws.bean.ieltstest;

import java.util.List;

public class TestWriting {

private String testId;
private String testDuration; 
private List<Passage> passages;

public List<Passage> getPassages() {
	return passages;
}

public void setPassages(List<Passage> passages) {
	this.passages = passages;
}

public String getTestId() {
	return testId;
}

public void setTestId(String testId) {
	this.testId = testId;
}

public String getTestDuration() {
	return testDuration;
}

public void setTestDuration(String testDuration) {
	this.testDuration = testDuration;
}


}
