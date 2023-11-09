<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Answer</title>
</head>
<body>
	<p><strong>${question.question}</strong></p>
	<form method="post">
		<label>Your Name</label>
		<input autofocus="autofocus" id="personName" name="personName" style="border: solid 2px" type="text"><br>		
		<label>Your Answer</label>
		<input id="answerStr" name="answerStr" type="text" style="border: solid 2px"><br>
		<button type="submit">Add</button>
	</form>
</body>
</html>