package ApiTesting;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.reflect.Field;


class VariableManager {

	@JsonProperty
	String system;
	@JsonProperty
	String project;
	@JsonProperty
	String local;

}

public class Jacksontest {

	static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * Convert a string of json strings to a map
	 * 
	 * @param json
	 * @return
	 */
	public static Map<String, Object> jsonToMap(String json) {
		try {
			return objectMapper.readValue(json, Map.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static <T> T mapToBean(Map<String, Object> map, Class clazz) throws Exception {

        Object object = clazz.newInstance();

                     // I do n’t know why this sentence is invalid ... On behalf of verification
//        Field.setAccessible(clazz.getDeclaredFields(), true);

        map.forEach((k, v) -> {
            try {
                Field field = clazz.getDeclaredField(k.toString());
                field.setAccessible(true);
                                 // Get the field type to judge
                if(field.getGenericType().toString().equals("int")) {
                    field.set(object, Integer.valueOf(v.toString()));
                } else {
                    field.set(object, v.toString());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        return (T) object;
    }

	public static void main(String[] args) throws Exception {
		// String json =
		// "{\"system\":[{\"name\":\"email\",\"value\":\"sourav@functionizeapp.com\",\"is_watch\":\"0\"}],\"project\":[{\"name\":\"lname\",\"value\":\"Malhotra\",\"is_watch\":\"0\"}],\"local\":[{\"name\":\"fname\",\"value\":\"Sourav\",\"is_watch\":\"0\"},{\"name\":\"phone\",\"value\":\"1234567890\",\"is_watch\":\"0\"}]}";

		String json = "{\"system\":{\"email\":{\"value\":\"sourav@functionizeapp.com\",\"is_watch\":\"0\"}},\"project\":{\"lname\":{\"value\":\"Malhotra\",\"is_watch\":\"0\"}},\"local\":{\"fname\":{\"value\":\"Sourav\",\"is_watch\":\"0\"},\"phone\":{\"value\":\"1234567890\",\"is_watch\":\"0\"}}}";
		ObjectMapper objectMapper = new ObjectMapper();

		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//		objectMapper.configure(MapperFeature.USE_GETTERS_AS_SETTERS, false);
//		objectMapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

		//VariableManager obj = objectMapper.readValue(json, VariableManager.class);
		
		Map<String, Object> obj=jsonToMap(json);
		
		System.out.println(obj.get("system"));
		System.out.println(obj.get("project"));
		System.out.println(obj.get("local"));
		
		Gson gson = new Gson(); 
		String json = gson.toJson(myObject); 	
		
	}
}
