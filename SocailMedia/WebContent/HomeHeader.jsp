<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<script
  src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" media="all" href="./css/Post.css">
<link rel="stylesheet" media="all" href="./css/CreatePostStyle.css">
<link rel='stylesheet' media="all" href='./css/ProfilePage.css'>
<link rel='stylesheet' media="all" href='./css/accountstyle.css'>

</head>
<body>


<jsp:include page="FrontUI.jsp"></jsp:include>

<section class="sectiondemo">
<div class='posts'>
<jsp:include page="NewPost.jsp"></jsp:include>
<jsp:include page="/ShowPost"></jsp:include>

<jsp:include page="/ShowFriendRequest"></jsp:include>

<jsp:include page="/ShowFriendList"></jsp:include>

</section>
</body>
</html>