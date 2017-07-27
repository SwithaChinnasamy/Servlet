<html>
    <head>
    <title>StudentDetails</title>
<!--<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<link rel="shortcut icon" href="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSOnO8OvBKUH9OxS5m63Qv2v-1Ch-tLoY9yXSnh94RKkTUEp6hScQ" type="image"/>
<style>

.btsize{
 margin-left:150px;
 margin-top:10px;
}

.jumbotron {
  background-image:url(https://funnyhamlet.files.wordpress.com/2016/04/iu1.jpeg);
  height:700px;
  background-repeat: no-repeat;
  background-size: cover;
  border-bottom:1px solid #ff6a00
}

.sform{
 border: 10px solid crimson;
 width:500px;
 padding-left:50px;
 padding-top:50px;
 align:center;
}
 body{
background-color:purple;
 }
   </style>
 
<body>
    <div class ="container-fluid">
    <h1><div align="center"></h1>
<h1><div class ="well blue"> Request your need.. </div></div></h1>
<div class ="jumbotron">
<form action="InsertStudent" method="post">
       
    <h1 align="center">Student details</h1> 
     <table cellspacing=5 cellpadding=5 id="form" align="center">
    <tr><td>Name:</td>  <td><input type="text" name="name"/></td></tr>
    <tr><td>Reg_No:</td><td><input type="text" name="regno"/></td></tr> 
    <tr><td>Department:</td><td><input type="text" name="department"/></td></tr>
    <tr><td>Cgpa:</td><td> <input type="text" name="cgpa"/></td></tr>
    <tr><td>Sgpa:</td><td> <input type="text" name="sgpa"/></td></tr> 
    <tr><td>No_Of_Arears:</td><td> <input type="text" name="noofarears"/></td></tr>
    <tr><td>Attendance:</td><td><input type="text" name="attendance"/></td></tr>
    <tr><td>Result:</td><td><input type="text"name="result"/></td></tr>
    <tr><td>E-mail:</td><td><input type="text"name="email"/></td></tr>   
    <tr><td><center><button type=submit class="btn btn-primary btsize">SUBMIT</button></center></td></tr>        
    </form>
        <form action="ViewAllDetails" method="get">
            <tr><td><center><button type=submit class="btn btn-primary btsize">DISPLAY</button></center></td></tr>
        </form>
      <form action="delete.html" method="GET">
        <tr><td><center><button type=submit class="btn btn-primary btsize">DELETE</button></center></td></tr>
    </form>
    <form action="update.html" method="GET">
      <tr><td><center><button type=submit class="btn btn-primary btsize">UPDATE</button></center></td></tr>
    </form>

     </table>
</div>
    </body>
</html>