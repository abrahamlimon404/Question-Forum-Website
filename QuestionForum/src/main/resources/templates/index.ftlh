<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Questions</title>
</head>
<body>
	<p style = "margin-left: 1em"><a href="/postQuestion">Post a Question</a></p>
	<ul>
		<#list questions as question>
  		<li><a href ="/viewQuestion/${question.id}">${question.question}"</a>  Posted by ${question.publisher} at ${question.date} 
  		<#if question.answers?has_content>
  			(${question.answers?size} Answers)
  		<#else>
  			(No Answers)
  		</#if>
  		</li>
  		</#list>
	</ul>
</body>
</html>