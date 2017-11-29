package x20171129;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

public class JavaToJSON {
    public static void main(String[] args) {
        
    
ObjectMapper mapper = new ObjectMapper();
User user = new User("Jani",20);

//Object to JSON in file
mapper.writeValue(new File("c:\\user.json"), user);

//Object to JSON in String
String jsonInString = mapper.writeValueAsString(user);
    }
}
