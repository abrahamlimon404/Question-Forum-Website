package cs3220.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cs3220.Model.Answer;
import cs3220.Model.Question;

@Controller
public class IndexController {
	
	@Autowired
	DataStore dataStore;
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("questions", dataStore.getQuestions());
		return "index";
	}
	
	@GetMapping("/viewQuestion/{id}")
	public String viewQuestions(Model model, @PathVariable int id) {
		model.addAttribute("question", dataStore.findQuestionById(id));
		model.addAttribute("answers", dataStore.findQuestionById(id).getAnswers());
		return "viewQuestion";
	}
	
	@GetMapping("/postAnswer/{id}")
	public String viewPostAnswer(Model model, @PathVariable int id) {
		model.addAttribute("question", dataStore.findQuestionById(id));
		return "postAnswer";
	}
	
	@PostMapping("/postAnswer/{id}")
	public String resultPostAnswer(@PathVariable int id, @ModelAttribute("answerStr") String answerStr, @ModelAttribute("personName") String personName) {
		Question q = dataStore.findQuestionById(id);
		Answer a = new Answer(answerStr, personName);
		q.getAnswers().add(a);
		return "redirect:/viewQuestion/" + id;
	}
	
	@GetMapping("/postQuestion")
	public String viewPostQuestion(Model model) {
		return "postQuestion";
	}
	
	@PostMapping("/postQuestion")
	public String resultPostQuestion(@ModelAttribute("question") String question, @ModelAttribute("publisher") String publisher) {
		dataStore.getQuestions().add(new Question(question, publisher));
		return "redirect:/";
	}
}
