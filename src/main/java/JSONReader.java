import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class JSONReader {
    JSONObject readJson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader(".\\src\\JsonFiles\\jsonfile.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        return jsonObject;
    }

    JSONArray getJson(String node) throws IOException, ParseException {
      JSONArray jsonArray=  (JSONArray)readJson().get(node);
        return jsonArray;
    }
}
