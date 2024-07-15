<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>CSS Template</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value='/resources/bootstrap_5/css/bootstrap.min.css' />" rel="stylesheet">
<link href="<c:url value='/resources/fontawesome-free-6.5.2-web/css/all.min.css' />" rel="stylesheet">
<script type="text/javascript" src="<c:url value='/resources/jquey.js' />"></script>
<meta charset="utf-8">
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  padding: 30px;
  text-align: center;
  font-size: 25px;
  color: white;
}
li{
border: solid 1px wheat;
border-radius: 15px;
}


/* Create two columns/boxes that floats next to each other */
/* nav { */
/*   float: left; */
/*   width: 30%; */
/*   height: 300px; /* only for demonstration, should be removed */ */
/*   background: #ccc; */
/*   padding: 20px; */
/* } */

/* /* Style the list inside the menu */ */
/* nav ul { */
/*   list-style-type: none; */
/*   padding: 0; */
/* } */

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #f1f1f1;
  height: 300px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section::after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #777;
  padding: 10px;
  text-align: center;
  color: white;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
</style>
</head>
<body>

<%@include file="/WEB-INF/layouts/user/header.jsp" %>

<decorator:body/>

<%@include file="/WEB-INF/layouts/user/footer.jsp" %>
<script type="text/javascript" src="<c:url value='/resources/qlphongmay.js' />"></script>
</body>
</html>