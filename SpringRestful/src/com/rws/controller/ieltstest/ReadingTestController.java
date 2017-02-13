package com.rws.controller.ieltstest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.rws.bean.ieltstest.Option;
import com.rws.bean.ieltstest.Passage;
import com.rws.bean.ieltstest.Question;
import com.rws.bean.ieltstest.TestWriting;

@RestController
public class ReadingTestController {

	@RequestMapping(value = "/api/get-reading-test-questions", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getReadingTestQuestions() throws Exception {

		Gson gson = new Gson();
		
		String jsonResponse = null;
		Map <String,TestWriting> testDataMap = new HashMap <String,TestWriting>();
		testDataMap.put("ReadingTest", getTestWriting());
		
		jsonResponse = gson.toJson(testDataMap, HashMap.class);
		
		//jsonResponse = gson.toJson(getTestWriting(), TestWriting.class);
		
		return jsonResponse;
	}
	
	@RequestMapping(value = "/api/get-reading-test-questions-jackson", method = RequestMethod.GET )
	public TestWriting getReadingTestQuestionsJackson() throws Exception {

		//Gson gson = new Gson();
		
		//String jsonResponse = null;
		//Map <String,Object> testDataMap = new HashMap <String,Object>();
		//testDataMap.put("ReadingTest", getTestWriting());
		
		//jsonResponse = gson.toJson(testDataMap, HashMap.class);
		
		//jsonResponse = gson.toJson(getTestWriting(), TestWriting.class);
		return getTestWriting();
	}
	
	
	@RequestMapping(value = "/api/submit-reading-test-questions", method = RequestMethod.GET)
	public @ResponseBody String submitReadingTestQuestions() throws Exception {

		String jsonResponse = null;

		return jsonResponse;
	}  

	@RequestMapping(value = "/api/submit-reading-test-question-one-by-one", method = RequestMethod.GET)
	public @ResponseBody String submitReadingTestQuestionOneByOne()
			throws Exception {

		String jsonResponse = null;


		
		return jsonResponse;
	}

	private TestWriting getTestWriting() {

		TestWriting testWriting = new TestWriting();
		
		List<Passage> passageList = new ArrayList<Passage>();
		 int displaySequence = 0;
		 
		for (int i = 1; i < 4; i++) {

			Passage passage = new Passage();
			passage.setPassageId("passageId-" + i);
			//passage.setPassageContent("<p class=\"sub_hd\">Top study destinations preferred by Indian students</p>-"+ i);
			passage.setPassageContent("passageContent-"+i);
			List<Question> questionsList = new ArrayList<Question>();
			
			for (int j = 1; j < 10; j++) {
				Question question = new Question();

				question.setParagraphId("passageId-" + i);
				question.setQuestionId("questionId-" + j);
				question.setQuestion("question-"+j);
				displaySequence++;				
				question.setDisplaySequence(String.valueOf(displaySequence));
				//System.out.println("displaySequence ======= " +displaySequence);
				List <Option> optionsList = new ArrayList<Option>();
				
				for (int k = 1; k<5; k++ ){
					Option option = new Option();
					option.setQuestionId(String.valueOf(j+k));
					option.setOptionId("optionId-" + k);
					option.setOptionValue("optionValue-" + k);
					optionsList.add(option);
					
				}
				question.setOptions(optionsList);
				
				questionsList.add(question);
			}			passage.setQuestions(questionsList);
			
			passageList.add(passage);
		}
		
		
		testWriting.setTestDuration("40");
		testWriting.setTestId("100");
		testWriting.setPassages(passageList);
		return testWriting;

	}
}
