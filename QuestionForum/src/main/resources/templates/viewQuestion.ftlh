<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View Question</title>
</head>
<body>
	<p>${question.question}" Posted by ${question.publisher} at ${question.date}.</p>
	<#if answers?has_content>
	<#list answers as answer>
	<p>"${answer.answerStr}" <i>Published by ${answer.personName}</i> at ${answer.ansDate}</p>
	</#list>
	<#else>
	<p><strong>There are no Answers</strong></p>
	</#if>
	<p><a href ="/">Back to Question</a> |<a href="/postAnswer/${question.id}"> Post An Answer</a></p>
</body>
</html>