package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GenerateStringFromResource {
	static String data;
	public static String generateStringFromResource(String path) {
		try {
			data = new String(Files.readAllBytes(Paths.get(path)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}

}
