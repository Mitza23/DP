package ubb.mihai.repository;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ubb.mihai.entities.Cake;

public class JSONCakeRepository extends CakeRepository {
    @Override
    public void save() {
    // create ObjectMapper instance
    ObjectMapper objectMapper = new ObjectMapper();
    for(Cake cake : list) {
        // convert Cake object to JSON string
        try {
            String jsonString = objectMapper.writeValueAsString(cake);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
    }
}
