var title,vote_average,url,release_date,overview;
var index;
var dataObj;
function getData() {
	var xmlHttp = new XMLHttpRequest();
	var word = document.getElementById("usertext").value;

	var url = "https://api.themoviedb.org/3/search/movie?api_key=45380d526f98549e83babfdca328fd84&query="
			+ word;
	xmlHttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var myArr = JSON.parse(this.responseText);
			 dataObj = myArr;
			var i = 0;
			for (i = 0; i < dataObj.results.length; i++) {
				var html_code = "<img src=\"https://image.tmdb.org/t/p/w300_and_h450_bestv2/"+dataObj.results[i].poster_path+"\"<br><br>Title = "
						+ dataObj.results[i].title + "<br> Ratings ="
						+ dataObj.results[i].vote_average
						+ "<br> Release Date ="
						+ dataObj.results[i].release_date + "<br> Overviews ="
						+ dataObj.results[i].overview
						+ "<br><button onClick=\"callServletWithAjax("+i+")\">Add to favourite</button><br><br><br>";
				document.getElementById('jsondata').insertAdjacentHTML('beforeend', html_code);
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
}


/*function callServletWithAjax(i){
	//alert(i);
	index=i;
	alert(dataObj.results[index].title);
	var xmlhttp = new XMLHttpRequest();
	
	xmlhttp.onreadystatechange = function(){
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
			document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
		}
	};
	
	var params = "title="+dataObj.results[index].title+"&ratings="+dataObj.results[index].vote_average+"&release_date="+dataObj.results[index].release_date+"&overview="+ dataObj.results[index].overview;
	console.log(params);
	xmlhttp.open('GET',"http://localhost:8081/MovieDB/saveData?"+params, true);
	xmlhttp.send();
}*/

function ReadFavs(){
	var xmlhttp = new XMLHttpRequest();
	
	xmlhttp.onreadystatechange = function(){
		if(xmlhttp.readyState == 4 && xmlhttp.status == 200){
			document.getElementById("myDiv").innerHTML = xmlhttp.responseText;
		}
	};
	
	xmlhttp.open('GET',"http://localhost:8081/MovieDB/readFavs", true);
	xmlhttp.send();
}