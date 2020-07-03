import javax.swing.JOptionPane;

public class PrimeNumber {

	public static void main(String[] args) {

		int number;

		number = Integer.parseInt(JOptionPane.showInputDialog("Isert the number"));

		if (verifyPrime(number)) {
			JOptionPane.showMessageDialog(null, number + " is a prime number.");
		} else {
			JOptionPane.showMessageDialog(null, number + " isn't a prime number.");
		}

	}

	static Boolean verifyPrime(int number) {

		int root, count;

		if (number % 2 == 0 && number > 2) {
			return false;
		}

		root = (int) Math.pow(number, 0.5);

		for (count = root; count > 1; count--) {
			if (number % count == 0) {
				return false;
			}
		}

		return true;
	}

}
