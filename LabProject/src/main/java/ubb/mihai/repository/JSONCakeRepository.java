package ubb.mihai.repository;



import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONCakeRepository extends CakeRepository {

//	public JSONCakeRepository() {
//		super();
//	}

	@Override
	public void save() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			String json = objectMapper.writeValueAsString(list);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}

