package utilities;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadTestData {
  @Test(dataProvider="")
  public void readJson() throws IOException, ParseException {
	  JSONParser jsonP=new JSONParser();
	  
		FileReader file=new FileReader(":\\Users\\esraa\\eclipse-workspace\\fbRegistration\\Sources\\TestData.json");
	
	  Object obj=jsonP.parse(file);
	  
  }
}
