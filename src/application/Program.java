package application;

import java.util.Locale;

import javax.swing.JOptionPane;

import model.services.InterestService;
import model.services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount: "));
		int months = Integer.parseInt(JOptionPane.showInputDialog("Months: "));

		//BrazilInterestService is = new BrazilInterestService(2.0);
		//double payment = is.payment(amount, months);
		InterestService isUsa = new UsaInterestService(1.0);
		double paymentUsa = isUsa.payment(amount, months);

		StringBuilder sb = new StringBuilder("Payment after " + months + " months: $ " + String.format("%.2f", paymentUsa));
		
		JOptionPane.showMessageDialog(null, sb);
	}
}
