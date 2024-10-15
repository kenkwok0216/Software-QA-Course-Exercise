package academy.teenfuture.crse;

import java.util.Scanner;

import academy.teenfuture.crse.problem_19.InvalidIPAddressException;

class Problem_19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Enter an IP address: ");
			String ipAddress = scan.nextLine();

			// Validate the IP address
			validateIPAddress(ipAddress);
			System.out.println("The IP address is valid.");

		} catch (InvalidIPAddressException e) {
			System.out.println(e.getMessage());
		} finally {
			scan.close(); // Close the scanner
		}
	}

	private static void validateIPAddress(String ipAddress) throws InvalidIPAddressException {

		/*
		 * One line regex may check this but too complicated to see
		 * ^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.
		 * (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.
		 * (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.
		 * (25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$
		 */

		// To check the form must be in xxx.xxx.xxx.xxx format first, regardless the
		// number
		if (!ipAddress.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$")) {
			throw new InvalidIPAddressException("Error: The ip address is in wrong format");
		}

		// Split the xxx.xxx.xxx.xxx to [xxx, xxx, xxx, xxx]
		String[] number_to_test = ipAddress.split("\\.");

		for (int i = 0; i < 4; i++) {
			// This is to check is there are leading 0
			if (number_to_test[i].length() > 1 && number_to_test[i].startsWith("0")) {
				throw new InvalidIPAddressException("Error: Leading \"0\" is not allowed");
			}

			int num = Integer.parseInt(number_to_test[i]);
			// This is to check xxx is between 0 and 255
			if (num < 0 || num > 255) {
				throw new InvalidIPAddressException("Error: Octet must between 0 to 255");
			}

		}

	}

}