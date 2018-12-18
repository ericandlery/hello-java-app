package json.jackson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJackson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		ObjectMapper om=new ObjectMapper();
		String s="{'name':'Kimi','car':'mp4-17','team':{'McLaren':'Ron'}}";
		s=s.replaceAll("'","\"");
		Map<String,Object> map=om.readValue(s,Map.class);
		System.out.println("map="+map);
		System.out.println(map.get("team"));
		
		List<String> list=new ArrayList<>();
		list.add("kimi");
		list.add("ralf");
		list.add("mika");
		String json=om.writeValueAsString(list);
		System.out.println(json);

	}

}
