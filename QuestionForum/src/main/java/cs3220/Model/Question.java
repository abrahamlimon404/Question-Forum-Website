package cs3220.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Question {
	private int id;
	private static int idSeed = 1;
	private String question;
	private String publisher;
	private Date date;
	private List<Answer> answers;
	
	public Question(String question, String publisher) {
		answers = new ArrayList<>();
		this.id=idSeed++;
		this.question = question;
		this.publisher = publisher;
		this.date = new Date();
	}
	
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a MM/d/yyyy");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAnswersSize() {
		return answers.size();
	}
	
	
}
