<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>

.btsize{
 margin-left:150px;
 margin-top:10px;
}
.well{
 text-align:center;
 background-color:white;
 color:crimson;

}
.sform{
 border: 10px solid skyblue;
 width:500px;
 padding-left:50px;
 padding-top:50px;
 align:center;
}
#text{
 background-color:chocolate;
 color:white;
}
.jumbotron {
  background-image:url(http://az616578.vo.msecnd.net/files/2016/03/06/635928941102633431-1012970287_college.jpg);
  height:500px;
  background-repeat: no-repeat;
  background-size: cover;
  border-bottom:1px solid #ff6a00
}

</style>
</head>

<body>
    <div class ="container-fluid">
    <h1><div align="center">
<div class ="well blue">Admin Login</div></div></h1>
<div class="jumbotron">
<div class="sform">
<form method="post" action="LoginPage">
          USERNAME:<input type="text" name="user"/><br/> <br/>

          PASSWORD:<input type="text" name="password"/><br/><br/>

         <button type =submit class="btn btn-success btsize">Login</button>        
</form>
</div></div>
</body>
</html>