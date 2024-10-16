package com.example;

public class Problem_03 {

	public boolean isPrime(int num) {
		if (num == -1 || num == 0 || num == 1) {
			return false;
		}

		if (num == 2) {
			return true;
		}

		for (int i = 2; i < Math.sqrt(Math.abs(num)); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}