import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestRCB {
    public String name,location;
    public JSONArray player;
    JSONReader jsonReader=new JSONReader();
    @Test
    void verifyForeignPlayer() throws IOException, ParseException {
        player = (JSONArray)jsonReader.getJson("player");
        int count=0;
        for(int i=0; i<= player.size()-1;i++){
            JSONObject js= (JSONObject) player.get(i);
            if(!js.get("country").equals("India")){
                count++;
            }
        }
        Assert.assertEquals(4,count);
        System.out.println("Team has only 4 foreign players");
    }
}
