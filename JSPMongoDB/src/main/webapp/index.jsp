<%@ page import="com.mongodb.client.MongoClient" %>
<%@ page import="com.mongodb.client.MongoClients" %>
<%@ page import="org.bson.Document"  %>
<html>
<body>
<h2>Hello World!</h2>
<%
    String username = request.getParameter("username");
    String blog = request.getParameter("blog");
    // to validate the form can not be empty
    if(username.isEmpty() || blog.isEmpty()){
%>

<script type="text/javascript">
    alert(' Name field cannot be empty!');
</script>
<%

    } else {
        out.print("Username is :- "+ username);
        out.print ( "Blog is :- " + blog );
        //to create client collection
        var client = MongoClients.create("mongodb://localhost:27017/");
        // to create or access the db
        var blogdb = client.getDatabase("blogdb");
        //create a collection in the database
        blogdb.createCollection("dailyBlogs");

        var collectionName = blogdb.getCollection("dailyBlogs");

        var doc = new Document();
        doc.append(username , blog);
        collectionName.insertOne(doc);
    }

%>

</body>
</html>
