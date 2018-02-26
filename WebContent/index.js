/*var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;	
	  var xhr = new XMLHttpRequest();
	  var xmlHttp = new XMLHttpRequest();
	  var url = "https://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2016-04-30&certification_country=IN&certification.lte=A&language=hi?&api_key=45380d526f98549e83babfdca328fd84&page=2&limit=%22%20+%20limit";
	  xmlHttp.open("GET", url, true);
	  xmlHttp.send();
	  
	  var name = document.getElementByID("name");
	  console.log(name);
	  
	  xmlHttp.onreadystatechange = function() { 
	      if(this.readyState == 4 && this.status == 200){
	        var obj = JSON.parse(this.responseText);
	       console.log(obj); 
	    }
	 }
	  */
function getData(){
	
	  var name = document.getElementById("mySearch").value;
	  
	  /*var XMLHttpRequest = require("xmlhttprequest").XMLHttpRequest;
	  var xhr = new XMLHttpRequest();*/
	  var xmlHttp = new XMLHttpRequest();
	  var url = "https://api.themoviedb.org/3/search/movie?api_key=45380d526f98549e83babfdca328fd84&query="+name;
	  xmlHttp.open("GET", url, true);
	  xmlHttp.send();
	  alert(url)
	  xmlHttp.onreadystatechange = function() { 	
	      if(this.readyState == 4 && this.status == 200){
	        var obj = JSON.parse(this.responseText);
	    }
	  }
	  document.write(obj);
}
