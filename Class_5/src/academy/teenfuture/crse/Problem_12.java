package academy.teenfuture.crse;

import java.util.ArrayList;
import java.util.Arrays;

class Problem_12 {
	public static void main(String[] args) {

		String[] str1 = new String[] { "Python", "JAVA", "PHP", "C#", "C++", "SQL" };
		String[] str2 = new String[] { "MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA" };

		System.out.print("The first Array: ");
		System.out.println(Arrays.toString(str1));

		System.out.print("The second Array: ");
		System.out.println(Arrays.toString(str2));

		ArrayList<String> arr_common = new ArrayList<String>();

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i] == str2[j]) {
					arr_common.add(str1[i]);
					break;
				}
			}
		}

		System.out.println("Common element is:" + arr_common);

	}
}