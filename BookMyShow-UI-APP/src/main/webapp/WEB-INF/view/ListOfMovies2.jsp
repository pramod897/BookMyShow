<!DOCTYPE html>
<html lang="en">

<head>
    <title>CSS Template</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: Arial, Helvetica, sans-serif;
        }

        /* Style the header */
        header {
            background-color:darkcyan;
            padding: 30px;
            text-align: center;
            font-size: 35px;
            color: white;
        }

        /* Create two columns/boxes that floats next to each other */
        nav {
            float: left;
            width: 30%;
            height: 300px;
            /* only for demonstration, should be removed */
            background-color:cadetblue;
            padding: 20px;
        }

        /* Style the list inside the menu */
        nav ul {
            list-style-type: none;
            padding: 0;
        }

        article {
            float: left;
            padding: 20px;
            width: 70%;
            background-color:aquamarine;
            height: 300px;
            /* only for demonstration, should be removed */
        }

        /* Clear floats after the columns */
        section::after {
            content: "";
            display: table;
            clear: both;
        }

        /* Style the footer */
        footer {
            background-color: darkcyan;
            padding: 10px;
            text-align: center;
            color: white;
        }

        /* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
        @media (max-width: 600px) {

            nav,
            article {
                width: 100%;
                height: auto;
            }
        }
    </style>
</head>

<body>

    <header>
        <h1>Book My Show</h1>
    </header>

    <section>
        <nav>
            <ul>
                <li><form method="get" action="/bookMovieTicket"><input type="submit" value="BOOK MOVIE TICKET"></form></li>
                
            </ul>
        </nav>

        <article>
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
                
            </form>      
         </article>
    </section>

    <footer>
        <h3>My Theater address</h3>
        <h3>Aditya theater</h3>
        <h3>main street , parvathipuram city, vizianagaram dist, andra paradesh</h3>
        <h3>if any issues contact me:: 93817*****</h3>
    </footer>

</body>

</html>