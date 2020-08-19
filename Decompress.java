package priya.innerclass;

public class Decompress {

	public static void main(String[] args) {

		System.out.println(deCompress("A100B3Z5"));

	}

	private static String deCompress(String s) {

		char[] a = s.toCharArray();// [A][2][B][3][Z][5]
		char c;
		String repeatedStr = null;
		StringBuilder resultStr = new StringBuilder();

		for (int i = 0; i < a.length; i++) {//i =2

			// Get the char
			c = a[i];//B

			// Get the count
			StringBuilder sbForCount = new StringBuilder();
			i++;
			while (i < a.length && Character.isDigit(a[i])) {
				sbForCount.append(a[i]);//3
				i++;
			}
			
			repeatedStr = repeatChars(c, Integer.valueOf(sbForCount.toString())); //BBB

			resultStr.append(repeatedStr); //AABBB
			i--;

		} // for

		return resultStr.toString();

	}

	private static String repeatChars(char c, int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(c);
		}
		return sb.toString();
	}

}
