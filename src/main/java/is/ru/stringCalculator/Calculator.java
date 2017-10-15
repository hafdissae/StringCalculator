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
			else {
				return calcSum(text);
			}
	}

	private static int calcSum(String str) {
		String d = "";
		if (str.startsWith("//")) {
				int dIndex = str.indexOf("//") + 2;
				d = String.valueOf(str.charAt(2));
				str = str.substring(dIndex + 2);
		}
		else {
			d = String.valueOf(str.charAt(1));
		}

		String[] arrNum = str.split(d);


		int s = 0;
		int l = arrNum.length;
		ArrayList<Integer> nNum = new ArrayList<Integer>();

		for (int i = 0; i < l; i++) {
			if (Integer.parseInt(arrNum[i]) < 0) {
				nNum.add(Integer.parseInt(arrNum[i]));
			}
			else if (Integer.parseInt(arrNum[i]) < 1001) {
				s += Integer.parseInt(arrNum[i]);
			}
		}
		if (nNum.size() > 0) {
			throw new RuntimeException("Negatives not allowed: " + nNum);
		}

		return s;
	}
}







