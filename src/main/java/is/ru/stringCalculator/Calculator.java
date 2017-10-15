package is.ru.stringCalculator;
import java.util.ArrayList;


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
				
				return calcSum(num);
			}
			else {
				return 1;
			}
	}

	private static int calcSum(String[] arrNum) {
		int s = 0;
		int l = arrNum.length;
		ArrayList<Integer> nNum = new ArrayList<Integer>();

		for (int i = 0; i < l; i++) {
			if (Integer.parseInt(arrNum[i]) < 0){
				nNum.add(Integer.parseInt(arrNum[i]));
			}
			else if (Integer.parseInt(arrNum[i]) > 1000){
				s += 0;
			}
			else{
				s += Integer.parseInt(arrNum[i]);	
			}
		}
		if (nNum.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + nNum);
		}

		return s;
	}
}







