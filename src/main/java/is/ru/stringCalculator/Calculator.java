package is.ru.stringCalculator;



public class Calculator{

	public static int add(String text) {
			if (text.equals("")){
				return 0;
			}
			else if (text.length() == 1) {
				return Integer.parseInt(text);
			}
			else if (text.contains(",")) {
				String[] num = text.split(",");
				return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			}
			else {
				return 1;
			}
	}
}







