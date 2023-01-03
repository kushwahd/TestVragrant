import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestRCB {
    void readjson() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        FileReader fileReader = new FileReader(".\\src\\JsonFiles\\jsonfile.json");
        Object obj = parser.parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        String name = (String) jsonObject.get("name");
        String location=(String) jsonObject.get("location");
        JSONArray player = (JSONArray)jsonObject.get("player");
        System.out.println(name);
        System.out.println(location);
        System.out.println(player);
    }
    @Test
    void foreignPlayer() throws IOException, ParseException {

       readjson();
    }
}
