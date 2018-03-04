package Main;



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
			if(arr.size() == 0)
				out.print("Favourite list is empty!");
			else {
				String s;
				for(int i=0;i<arr.size();i++) {
					obj=(JSONObject) arr.get(i);
					s = (String)obj.get("city");
					// sending the index of the object to be deleted	
					out.println((i+1)+"."+s+"<button type = \"button\" onclick = \"removeFav("+i+")\" id = \"remove_button\" class = \"btn btn-outline-danger\">Remove</button><br>");
	    	}
			}
		} catch (ParseException e) {
				System.out.println("Please enter a valid path");
}
	} 

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
