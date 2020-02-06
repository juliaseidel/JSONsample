import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("JSON sample");

        //serializeWord();
        //deserializeWord();

        //String dictionary = new Scanner(new File("/Users/juliaseidel/Desktop/Java/jsonSample/src/main/java/dictionary.json")).next();

        JsonObject wordDetails = new JsonObject();
        wordDetails.addProperty("english", "abbey");
        wordDetails.addProperty("welsh", "abaty");
        wordDetails.addProperty("wordtype", String.valueOf(WordType.nm));

        JsonArray wordList = new JsonArray();
        wordList.add(wordDetails);

        try (FileWriter file = new FileWriter("dictionary.json")){
            file.write(wordList.);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void serializeWord(){
        Word word = new Word("abbey", "abaty", WordType.nm);

        Gson gson = new Gson();
        String json = gson.toJson(word);
    }

    public static void deserializeWord(){
        String wordJson = "{'english':'accept', 'welsh':'debryn', 'wordType':'nm'}";

        Gson gson = new Gson();
        Word word = gson.fromJson(wordJson, Word.class);

        Map map = new HashMap();
        map = gson.fromJson(wordJson, Map.class);
    }
}
