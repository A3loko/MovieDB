import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Main {

	public static void main(String[] args) {
		JSONParser parser = new JSONParser();

		try {
			URL oracle = new URL(
					"https://api.themoviedb.org/3/discover/movie?primary_release_date.gte=2016-04-30&certification_country=IN&certification.lte=A&language=hi?&api_key=45380d526f98549e83babfdca328fd84&page=2&limit=%22%20+%20limit"); // URL
																																																										// to
																																																										// Parse
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			String inputLine;
			while ((inputLine = in.readLine()) != null) {
				JSONArray a = (JSONArray) parser.parse(inputLine);

				// Loop through each item
				for (Object o : a) {
					JSONObject tutorials = (JSONObject) o;

					Long id = (Long) tutorials.get("ID");
					System.out.println("Post ID : " + id);

					String title = (String) tutorials.get("post_title");
					System.out.println("Post Title : " + title);

					System.out.println("\n");
				}
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
