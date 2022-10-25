<%@ page import="ml.lottery.LotteryNumbers" %>
<%@ page import="ml.lottery.LotteryDraw" %>
<%@ page import="ml.lottery.LotteryResult" %><%--
  Created by IntelliJ IDEA.
  User: Ja
  Date: 25.10.2022
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<%LotteryResult result = (LotteryResult) request.getAttribute("lotteryResult");%>
<h2>Lottery draw: <%= result.getLotteryDraw() %></h2>
<h2>Your numbers: <%= result.getUserNumbers() %></h2>
<h2>HIT: <%= result.getWinnerNumbers().size() %></h2>
<h2>Hit numbers: <%= result.getWinnerNumbers() %></h2>


</body>
</html>
