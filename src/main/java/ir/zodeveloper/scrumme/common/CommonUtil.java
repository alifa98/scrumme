package ir.zodeveloper.scrumme.common;

import java.util.Random;

public class CommonUtil {

	private static final char[] CHARS_ARRAY = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final Random RANDOM_GENERATOR = new Random();

	private CommonUtil() {
		// This is Utility Class.
	}

	public static String getRandomString(int length) {

		char[] buffer = new char[length];
		for (int i = 0; i < buffer.length; i++) {
			int index = RANDOM_GENERATOR.nextInt(CHARS_ARRAY.length);
			buffer[i] = CHARS_ARRAY[index];
		}

		return new String(buffer);
	}

}
