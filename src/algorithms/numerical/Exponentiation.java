package algorithms.numerical;

import java.math.BigInteger;
import java.util.ArrayList;

public class Exponentiation {
	public static void main(String[] args) {
		Exponentiation number = new Exponentiation();

		System.out.println(number.exp(BigInteger.valueOf(17), 11));
	}

	public BigInteger exp(BigInteger x, int power) {
		// A^(2*M) = (A^M)^2
		// A^(M*N) = A^M * A^N
		ArrayList<BigInteger> powerX = new ArrayList<BigInteger>();
		powerX.add(x);

		BigInteger xPowerN = x.multiply(x);
		powerX.add(xPowerN);

		int curPower = 2;

		while (curPower < power - 2) {
			xPowerN = xPowerN.multiply(xPowerN);
			powerX.add(xPowerN);
			curPower *= 2;
		}

		BigInteger answer = BigInteger.valueOf(1);
		for (int i = 0; i < powerX.size(); i++) {
			if ((power & (1 << i)) != 0) {
				answer = answer.multiply(powerX.get(i));
			}
		}

		return answer;
	}
}