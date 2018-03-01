package Main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@WebServlet("/saveData")
public class saveData extends HttpServlet {
    private static final long serialVersionUID = 1L;
    JSONArray jarray = new JSONArray();
    
   public saveData() {
       super();
   }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        String title = request.getParameter("title");
        PrintWriter out = response.getWriter();
        out.print("Thank you for adding <b>"+title+"</b> to your favorite locations");
        String rating = request.getParameter("rating");
        String release_date = request.getParameter("release_date");
        String overview = request.getParameter("overview");
        
        JSONObject json = new JSONObject();
            json.put("title", title);
            json.put("rating", rating);
            json.put("release_date", release_date);
            json.put("overview", overview);
                    
        
        if(jarray.size() < 10) {
            jarray.add(json);
        }
        else {
            System.out.println("You have exceeded your limit");
        }
        
        FileWriter jsonFile = null;
        try {
            //true so that it appends and not overwrite
        jsonFile = new FileWriter("/home/sapient/Documents/favorites.json");
        jsonFile.write(jarray.toString());
        System.out.println(json.toString());
        }catch(Exception e){
            System.out.println("Please enter a valid path where you want to store your json");
        }finally {
            jsonFile.flush();
            jsonFile.close();
        }
        
        
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

}