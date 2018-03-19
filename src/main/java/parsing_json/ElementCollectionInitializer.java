package parsing_json;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ElementCollectionInitializer extends ElementCollection{


    public static ElementCollection generate() {
        //Create a new Gson object

        //Read the employee.json file
        try (BufferedReader br = new BufferedReader(
                new FileReader("src/main/resources/periodic_table.json"))) {
            Gson gson = new Gson();
            ElementCollection theCollection = gson.fromJson(br, ElementCollection.class);
            return theCollection;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}