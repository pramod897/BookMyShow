<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home Page</title>
    </head>

    <body>
       
        <center>
            <h1>Book My Show</h1>
        </center>
        <center>
            <div>
                <p>
                <h2>Welcome my app </h2>
                
                </p>
            </div>
        </center>




        <center>

            <h3>your movie ticket</h3>
          
            <form method="get" action="/">
                <table border="1px">
                    <tr>
                        <th>MOVIE TICKET</th>
                        <td>${moviename}</td>
                    </tr>
                    <tr>
                        <th>NO OF TICKETS</th>
                        <td>${nooftickets}</td>
                    </tr>
                    <tr>
                        <th>TOTAL PRICE</th>
                        <td>${msg}</td>
                    </tr>
                    
                </table>
                <h2>Enjoy your show</h2><br>

                <table border="1px">
                   
                    <tr>
                        <td><input type="submit" value="Book Ticket Again"></td>
                    </tr>
                </table>
            </form>

        
            
            </center>
    </body>

  

    </html>