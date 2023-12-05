<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home Page</title>
    </head>

    <body>

        <header>
         <center>
            <h1>Book My Show</h1>
         </center>
         <center>
         <div>
            <p><h2>Welcome my app </h2>
              
            </p>
         </div>
        </center>
        </header>


        <center>
            <h2>Today shows</h2>
            <form method="get" action="/bookMovieTicket">
                <table border="1px">
                    <tr>
                        <th>Movie Name</th>
                        <th>Movie Price</th>
                        <th>Show Timings</th>
                    </tr>

                    <tr>
                        <td>salar</td>
                        <td>
                            400
                        </td>
                        <td>9:00 AM-12:00 PM</td>
                    </tr>

                    <tr>
                        <td>animal</td>
                        <td>
                            300
                        </td>
                        <td>2:00 PM-5:00 PM</td>
                    </tr>
                    <tr>
                        <td>dunki</td>
                        <td>
                            450
                        </td>
                        <td>6:00 PM-9:00 PM</td>
                    </tr>
                    <tr>
                        <td>kgf</td>
                        <td>
                            400
                        </td>
                        <td>9:30 PM-12:00 AM</td>
                    </tr>

                   
                </table>
                <table border="1px">
                <tr>
                    <td></td>
                    <td>
                        <input type='submit' value='Book Movie Ticket' />
                    </td>
                </tr>
                </table>
            </form>
    </body>

    </center>

    </html>