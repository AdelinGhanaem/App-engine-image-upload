<%@ page import="com.google.appengine.api.blobstore.BlobstoreService" %>
<%@ page import="com.google.appengine.api.blobstore.BlobstoreServiceFactory" %>
<%--
  Created by IntelliJ IDEA.
  User: clouway
  Date: 7/4/12
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%!
    BlobstoreService service = BlobstoreServiceFactory.getBlobstoreService();

%>
<form action="<%=service.createUploadUrl("/upload") %>" method="POST" enctype="multipart/form-data">

    <input type="file" name="myFile"/>

    <input type="submit" value="Submit"/>


</form>


</body>
</html>