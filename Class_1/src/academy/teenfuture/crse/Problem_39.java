package academy.teenfuture.crse;

class Problem_39 {
	public static void main(String[] args) {

		for (int i = 0; i < 15; i++) {
			if (i < 8) {
				if (i % 2 == 0) {
					for (int j = 0; j < 46; j++) {
						if (j < 12) {
							if (j % 2 == 0) {
								System.out.print("*");
							} else {
								System.out.print(" ");
							}
						} else {
							System.out.print("=");
						}
					}
				} else {
					for (int j = 0; j < 46; j++) {
						if (j < 12) {
							if (j % 2 == 0) {
								System.out.print(" ");
							} else if (j == 11) {
								System.out.print(" ");
							} else {
								System.out.print("*");
							}
						} else {
							System.out.print("=");
						}
					}
				}
				System.out.println("");
			} else {
				for (int j = 0; j < 46; j++) {
					System.out.print("=");
				}
				System.out.println("");
			}
		}

	}
}