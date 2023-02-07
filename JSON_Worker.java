import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

// Class responsible for working with json file
public class JSON_Worker {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("./BE_data.json"));
            JSONObject jsonObject = (JSONObject)obj;
        JSONArray id = (JSONArray)jsonObject.get("Events");
            System.out.println("Competitors:");
            Iterator iterator = id.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
                System.out.println("\n");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

