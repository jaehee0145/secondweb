
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>write</title>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
    <style>
        a:link, a:visited {text-decoration:none; color:azure; }
        * {margin: 0; padding: 0; }
        ul, li {list-style-type: none;}
        a {text-decoration: none;}
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
        <form>
            <div class="form-group">
                <label for="usr">Name:</label>
                <input type="text" class="form-control" id="usr">
            </div>
            <div class="form-group">
                <label for="pwd">Password:</label>
                <input type="password" class="form-control" id="pwd">
            </div>
        </form>
        <div class="form-group">
            <label for="title">Title:</label>
            <input type="text" class="form-control" id="title">
        </div>

        <div class="form-group">
            <label for="comment">Content:</label>
            <textarea class="form-control" rows="5" id="comment"></textarea>
        </div>
    </form>
    <div class="btn-group">
        <button type="button" class="btn btn-warning"><a href="/board/list">확인</a></button>
        <button type="button" class="btn btn-warning"><a href="/board/list">취소</a></button>
    </div>
</div>


<br>
<br>
<br>
</div>
</body>

</html>