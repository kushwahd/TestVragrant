import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;

public class TestRCB {
    public String name,location;
    JSONReader jsonReader=new JSONReader();
    public JSONArray player= (JSONArray)jsonReader.getJson("player");
    public TestRCB() throws IOException, ParseException {
    }
    @Test
    void verifyForeignPlayer() {
        int count=0;
        for(int i=0; i<= player.size()-1;i++){
            JSONObject js= (JSONObject) player.get(i);
            if(!js.get("country").equals("India")){
                count++;
            }
        }
        Assert.assertEquals(4,count);
    }

    @Test
    void verifyWicketKepper() {
        int roleCount=0;
        for(int i=0; i<= player.size()-1;i++) {
            JSONObject js = (JSONObject) player.get(i);
            if(js.get("role").equals("Wicket-keeper")){
                    roleCount=1;

            }
        }
        Assert.assertEquals(roleCount,1);
    }
}
