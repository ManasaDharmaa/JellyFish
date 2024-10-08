package com.xworkz.bankingSystem.boot;

public abstract class Account {

	public abstract void accountNumber();

	public abstract void balance();

	public abstract void password();

	public abstract void pin();

	public abstract void atm();

	public abstract void profile();

	public abstract void name();

	public abstract void liningAdhar();

	public abstract void pan();

	public abstract void credite();

	public void phoneNumber() {
		System.out.println("this is phoneNumber method");
	}

	public void passbook() {
		System.out.println("this is passbook method");
	}

	public void cheque() {
		System.out.println("this is cheque method");
	}

	public void bankName() {
		System.out.println("this is bankName method");
	}

	public void chequeBook() {
		System.out.println("this is chequeBook method");
	}
}
