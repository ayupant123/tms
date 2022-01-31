package com.tms.beans;

/**
 * 
 * @author Ayushi Pant
 * @see Bean Class for Training module
 * @since Jan 2020
 * @version 1.0
 */



public class Trainer {
    
	private int tId;
	private String tFirstName;
	private String tLastName;
	private int tYearsOfExp;
	private String tAreaOfExpertise;
	private String tEmail;
	private String tPassword;
	private int tMobileNo;
	private String tDob;
    private String trMailingAddress;
    private String companiesTrained;
    private double trExpectedFees;
    
    /**
     * 
     * @author Ayushi Pant
     * @see getters and setters for Training module
     * @since Jan 2020
     * @version 1.0
     */
    
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettFirstName() {
		return tFirstName;
	}
	public void settFirstName(String tFirstName) {
		this.tFirstName = tFirstName;
	}
	public String gettLastName() {
		return tLastName;
	}
	public void settLastName(String tLastName) {
		this.tLastName = tLastName;
	}
	public int gettYearsOfExp() {
		return tYearsOfExp;
	}
	public void settYearsOfExp(int tYearsOfExp) {
		this.tYearsOfExp = tYearsOfExp;
	}
	public String gettAreaOfExpertise() {
		return tAreaOfExpertise;
	}
	public void settAreaOfExpertise(String tAreaOfExpertise) {
		this.tAreaOfExpertise = tAreaOfExpertise;
	}
	public String gettEmail() {
		return tEmail;
	}
	public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}
	public String gettPassword() {
		return tPassword;
	}
	public void settPassword(String tPassword) {
		this.tPassword = tPassword;
	}
	public int gettMobileNo() {
		return tMobileNo;
	}
	public void settMobileNo(int tMobileNo) {
		this.tMobileNo = tMobileNo;
	}
	public String gettDob() {
		return tDob;
	}
	public void settDob(String tDob) {
		this.tDob = tDob;
	}
	public String getTrMailingAddress() {
		return trMailingAddress;
	}
	public void setTrMailingAddress(String trMailingAddress) {
		this.trMailingAddress = trMailingAddress;
	}
	public String getCompaniesTrained() {
		return companiesTrained;
	}
	public void setCompaniesTrained(String companiesTrained) {
		this.companiesTrained = companiesTrained;
	}
	public double getTrExpectedFees() {
		return trExpectedFees;
	}
	public void setTrExpectedFees(int trExpectedFees) {
		this.trExpectedFees = trExpectedFees;
	}
   
	
}
