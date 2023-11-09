package cs3220.Controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import cs3220.Model.Answer;
import cs3220.Model.Question;

@Component
public class DataStore {
	List<Question> questions = new ArrayList<>(); 
	
	public DataStore() {
		Question q1 = new Question("How to debug?", "bob");
		Question q2 = new Question("What is  0?", "Jeff");
		
		Answer a1 = new Answer("You have to restart computer", "Jeff");
		q1.getAnswers().add(a1);
		Answer a2 = new Answer("Try entering dubug mode", "Alice");
		q1.getAnswers().add(a2);
		
		questions.add(q1);
		questions.add(q2);
		
	}
	
	public List<Question> getQuestions(){
		return questions;
	}
	
	public Question findQuestionById(int id){
		for(Question q : questions) {
			if (q.getId() == id)
				return q;
		}
		return null;
	}
}
