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
        <h3>Book Movie Ticket</h3>
        <form method="get" action="/getTotalCost">
            <table>
                <tr>
                    <td>MovieName</td>
                    <td>
                        <input type='text' name='movieName' />
                    </td>
                </tr>

                <tr>
                    <td>Quantity</td>
                    <td>
                        <input type='text' name='noOfTickets' />
                    </td>
                </tr>

                <tr>
                    <td></td>
                    <td>
                        <input type='submit' value='Get Ticket' />
                    </td>
                </tr>
            </table>
        </form>
    </body>

    </center>

    </html>