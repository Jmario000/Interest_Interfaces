package model.services;

public class UsaInterestService implements InterestService{
	
	private Double interestRate;
	
	public UsaInterestService(double interestRate) {
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return this.interestRate;
	}
}
