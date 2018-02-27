function getData() {
	var xmlHttp = new XMLHttpRequest();
	var word = document.getElementById("usertext").value;

	var url = "https://api.themoviedb.org/3/search/movie?api_key=45380d526f98549e83babfdca328fd84&query="
			+ word;
	xmlHttp.onreadystatechange = function() {
		if (this.readyState == 4 && this.status == 200) {
			var myArr = JSON.parse(this.responseText);
			var dataObj = myArr;
			var i = 0;
			for (i = 0; i < dataObj.results.length; i++) {
				var html_code = "<img src=\"https://image.tmdb.org/t/p/w300_and_h450_bestv2/"+dataObj.results[i].poster_path+"\"<br><br>Title = "
						+ dataObj.results[i].title + "<br> Ratings ="
						+ dataObj.results[i].vote_average
						+ "<br> Release Date ="
						+ dataObj.results[i].release_date + "<br> Overviews ="
						+ dataObj.results[i].overview
						+ "<br><button id =\"button"+i+"\" onClick=\"Favourite("
						+ dataObj.results[i].id
						+ ")\">Add to favourite</button><br><br><br></div></div></div>";
				document.getElementById('jsondata').insertAdjacentHTML('afterend', html_code);
			}
		}
	}
	xmlHttp.open("GET", url, true);
	xmlHttp.send();
}

var i = 0;
function Favourite(id) {
	var favs = new Arary();
	alert(favs[i]);
	if (i < 3) {
		favs[i] = id;
	} else {

	}
	i++;
}
