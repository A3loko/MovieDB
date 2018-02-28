<!DOCTYPE html>
<html lang="en">
<head>
<title>Movie List</title>
<meta charset="utf-8">
<!-- <meta name="viewport" content="width=device-width, initial-scale=1"> -->
<!-- <link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="https://fonts.googleapis.com/css?family=Krona+One"
	rel="stylesheet"> -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!-- <link rel="stylesheet" href="/WEB-INF/lib/index.css"> -->
</head>
<body>

<!-- 	<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header" id="head">
      <a class="navbar-brand" href="#">Movie List</a>
     </div>
    <form class="navbar-form navbar-left">
      <div class="input-group">
        <input type="text" class="form-control" placeholder="Search" name="search" id="usertext">
        <div class="input-group-btn">
          <button class="btn btn-default" type="submit" onClick="getData()">
            <i class="glyphicon glyphicon-search"></i>
          </button>
        </div>
      </div>
    </form>
  </div>
</nav> -->
<div class="container"><div class="row justify-content-center"><div class="col-8" id="data">
	<input type="text" id="usertext">
	<button type="button" class="btn btn-primary" onClick="getData()">CLICK ME</button>
	
	<button type="button" class="btn btn-primary" onClick="ReadFavs()">Fetch Favourites</button>
	<p id="jsondata"></p>
	</div></div></div>
	<div id="myDiv"></div>
	<!-- <p id="jsondata1"></p>
	<p id="jsondata2"></p>
	<p id="jsondata3"></p> -->
	<script type="text/javascript" src="index.js"></script>
</body>
</html>

 
 
 