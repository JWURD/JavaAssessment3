package user_management;

import com.google.gson.Gson;
import parsing_json.ElementCollection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class UserCollectionInitializer {
    public static UserCollection generate() {
        //Create a new Gson object

        //Read the employee.json file
        try (BufferedReader br = new BufferedReader(
                new FileReader("/Users/joshuawurdemann/Dev/JavaAssessment3/src/main/resources/users.json"))) {
            Gson gson = new Gson();
            UserCollection theCollection = gson.fromJson(br, UserCollection.class);
            return theCollection;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
