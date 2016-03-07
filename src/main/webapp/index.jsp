<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Echo Example in JSP and Servlet - Java web application</title>
    </head>
 
    <body> 
        <div>
            <h3> Choose File to Echo in Server </h3>
            <form action="echo" method="put" enctype="text/plain">
                <div><textarea name="filename" rows="1" cols="60"></textarea></div>                <input type="string" name="string" />
                <input type="submit" value="echo" />
            </form>          
        </div>
      
    </body>
</html>