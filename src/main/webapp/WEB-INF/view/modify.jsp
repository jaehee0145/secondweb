
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <meta charset="UTF-8">
    <title>modify</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <style>
        a:link, a:visited {text-decoration:none; color:azure; }
    </style>
</head>

<body>
<div class="container">
    <div class="jumbotron">
        <h1>게시판 만들기</h1>
        <p>2019.01.07~2019.01.11</p>
        <p>박재희</p>
    </div>
</div>
<div class="container">
    <h2>글쓰기</h2>
    <form>
        <c:forEach items="${requestScope.list}" var="board">

        <div class="form-group">
            <label for="usr">Name:</label>
            <input type="text" class="form-control" id="usr" value = "${board.name}">
        </div>

        <div class="form-group">
            <label for="title">title:</label>
            <input type="text" class="form-control" id="title" value = "${board.title}">
        </div>

        <div class="form-group">
            <label for="comment">Comment:</label>
            <textarea class="form-control" rows="5" id="comment" placeholder="${board.content}"></textarea>
        </div>
        <div class="form-group">
            <label for="pwd">Password:</label>
            <input type="password" class="form-control" id="pwd">
        </div>
        </c:forEach>

    </form>
    <div class="btn-group">
        <button type="button" class="btn btn-warning"><a href="/board/list">확인</a></button>
        <button type="button" class="btn btn-warning"><a href="/board/list">취소</a></button>
    </div>
    <br>
    <br>
    <br>
</div>
</body>

</html>