package Main;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



@WebServlet("/readFavs")
public class readFavs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	public readFavs() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		JSONObject obj = new JSONObject();
		JSONParser parser = new JSONParser();
		JSONArray arr = new JSONArray();
		FileReader reader = new FileReader("/home/sapient/Documents/favorites.json");
		try {
			arr = (JSONArray) parser.parse(reader);
			for(int i = 0; i < arr.size(); i++) {
				obj = (JSONObject)arr.get(i);
				String title = (String)obj.get("title");
				String relDate = (String)obj.get("release_date");
				String overview = (String)obj.get("overview");
				out.print("<table style=\"width:100%\"><tr><th>Title</th><th>Release Date</th><th>Overview</th></tr><tr><td>"+title+"</td><td>"+relDate+"</td><td>"+overview+"</td></tr>");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		} 
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
