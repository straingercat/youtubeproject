package Generic_utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

import org.codehaus.jackson.JsonParser;
import org.json.simple.parser.JSONParser;

public class JsonFile_Utility {

	public String readdatafromjson(String key) throws Throwable 
	{
		FileReader file=new FileReader("./commondata.json");
		
		JSONParser jsonobj=new JSONParser ();
		Object javaobj = jsonobj.parse(file);
		
		HashMap map=(HashMap)javaobj;
		String value = map.get(key).toString();
		
		
		return value;
	}
}
