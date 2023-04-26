package ubb.mihai.repository;


import ubb.mihai.entities.Cake;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONCakeRepository extends CakeRepository {
	@Override
	public void save() {
		ObjectMapper objectMapper = new ObjectMapper();
		for (Cake cake : list) {
			try {
				String jsonString = objectMapper.writeValueAsString(cake);
				System.out.println(jsonString);
			} catch (JsonProcessingException e) {
				throw new RuntimeException(e);
			}
		}
	}
}

