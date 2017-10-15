package is.ru.stringCalculator;



public class Calculator{

	public static int add(String text) {
			if (text.equals("")){
				return 0;
			}
			else if (text.length() == 1) {
				return Integer.parseInt(text);
			}
			else if (text.contains("\n") || text.contains(",")) {
				String[] num = text.split("\n|,");
				int l = num.length;
				int s = 0;

				for (int i = 0; i < l; i++) {
					s += Integer.parseInt(num[i]); 
				}	

				return s;
			}
			else {
				return 1;
			}
	}
}







