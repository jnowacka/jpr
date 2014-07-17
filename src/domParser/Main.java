package domParser;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		WisielecParser parser = new WisielecParser();
		List<String> list = parser.parse("C:/Users/instruktor/Michal-hasla.xml","w");
		
		for(String s: list) {
			System.out.println(s);
		}
	}

}
