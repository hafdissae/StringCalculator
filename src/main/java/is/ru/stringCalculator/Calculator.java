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
				int l = num.length;

				if (l == 2){
					return Integer.parseInt(num[0]) + Integer.parseInt(num[1]);	
				}
				else {
					int s = 0;
					for (int i = 0; i < l; i++) {
						s += Integer.parseInt(num[i]); 
					}	

					return s;
				}
			}
			else {
				return 1;
			}
	}
}







