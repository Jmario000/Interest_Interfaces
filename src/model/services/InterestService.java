package model.services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Moths must be greater than zero");
		}
		double totalPayment = amount * Math.pow((1 + getInterestRate() / 100.0), months);
		return totalPayment;
	}
}
