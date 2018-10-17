package Greeter;
import java.util.Scanner

public class BankAccount {
	private double Balance;
	private int Account;
	private double InterestRate;
	
	public BankAccount() {
		Balance= 1000.99;
		Account= 123456;
		InterestRate= 0.03;
	}
	public double getBalance() {
		return Balance;
	}
	public double getAccount() {
		return Account;
	}
	public double getInterestRate() {
		return (InterestRate*0.100);
	}
	public double getDeposit() {
		return (10);
	}
	public double getWithdraw() {
		return (10);
	}
	public double getInterest() {
		return (Balance*(1+10*InterestRate));
	}
	public double getFinance() {
		return (Balance-5);
	}
	public double setDeposit(double newDeposit) {
		return Balance+newDeposit;
	}
	public double setWithdraw(double newWithdraw) {
		return Balance-newWithdraw;
	}
	public double setInterest(double newInterest) {
		return Balance+newInterest;
	}
	public double setFinance(double newFinance) {
		return Balance-newFinance;
	}
}