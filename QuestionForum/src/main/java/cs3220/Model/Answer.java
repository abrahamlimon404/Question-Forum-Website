package cs3220.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Answer {
	private int id;
	private static int idSeed =1;
	private String answerStr;
	private String personName;
	private Date ansDate;
	
	public Answer(String answerStr, String personName) {
		this.id = idSeed++;
		this.answerStr = answerStr;
		this.personName = personName;
		this.ansDate = new Date();
	}
	
	public String getAnswerStr() {
		return answerStr;
	}
	public void setAnswerStr(String answer) {
		this.answerStr = answer;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personAnswer) {
		this.personName = personAnswer;
	}
	public String getAnsDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm a MM/d/yyyy");
		String formattedDate = sdf.format(ansDate);
		return formattedDate;
	}
	public void setAnsDate(Date ansDate) {
		this.ansDate = ansDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}