package is.ru.stringCalculator;



public class Calculator{

	public static int add(String text) {
			if (text.equals("")){
				return 0;
			}
			else if (text.length() == 1) {
				return Integer.parseInt(text);
			}
			else {
				return 1;
			}
	}
}







