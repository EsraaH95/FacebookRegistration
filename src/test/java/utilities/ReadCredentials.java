package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.FileReader;

public class ReadCredentials {
	
	public  Properties readPropertiesFile()   {
		
		 FileReader reader = null;
		try {
			reader = new FileReader("C:\\Users\\esraa\\eclipse-workspace\\fbRegistration\\Sources\\credentials.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        Properties props=new Properties();
	        try {
				props.load(reader);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return props;

}
}