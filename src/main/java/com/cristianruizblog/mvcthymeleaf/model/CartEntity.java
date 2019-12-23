package com.cristianruizblog.mvcthymeleaf.model;

import java.util.List;

public class CartEntity {

	private String acquirerId;
	private String commerceId;
	private String purchaseOperationNumber;
	private String purchaseAmount;
	private String purchaseCurrencyCode;
	private String purchaseTerminalCode;
	private String purchasePlanId;
	private String purchaseQuotaId;
	private String purchaseShippingCharges;
	private String purchaseShipperCode;
	private String purchaseIva;
	private String purchaseIvaReturn;
	private String purchaseLanguage;
	private String purchaseIpAddress;
	private String billingFirstName;
	private String billingLastName;
	private String billingCountry;
	private String billingCity;
	private String billingState;
	private String billingPostalCode;
	private String billingPhoneNumber;
	private String billingCelPhoneNumber;
	private String billingGender;
	private String billingEmail;
	private String billingAddress;
	private String billingBirthday;
	private String billingOutIdentifierCity;
	private String billingDateIdentifierDate;
	private String billingNationality;
	private String shippingReceptionMethod;
	private String shippingReceiverName;
	private String shippingReceiverLastName;
	private String shippingReceiverIdentifier;
	private String shippingCountry;
	private String shippingCity;
	private String shippingState;
	private String shippingPostalCode;
	private String shippingAddress;
	private List  taxes;
	private List products;
	private List flight; 
	private List passenger;
	private List good;
	private List airport;
	private List administrativeRate;
	private String transactionTrace;
	private String fingerPrint;
	private String additionalObservations;
	public String getAcquirerId() {
		return acquirerId;
	}
	public void setAcquirerId(String acquirerId) {
		this.acquirerId = acquirerId;
	}
	public String getCommerceId() {
		return commerceId;
	}
	public void setCommerceId(String commerceId) {
		this.commerceId = commerceId;
	}
	public String getPurchaseOperationNumber() {
		return purchaseOperationNumber;
	}
	public void setPurchaseOperationNumber(String purchaseOperationNumber) {
		this.purchaseOperationNumber = purchaseOperationNumber;
	}
	public String getPurchaseAmount() {
		return purchaseAmount;
	}
	public void setPurchaseAmount(String purchaseAmount) {
		this.purchaseAmount = purchaseAmount;
	}
	public String getPurchaseCurrencyCode() {
		return purchaseCurrencyCode;
	}
	public void setPurchaseCurrencyCode(String purchaseCurrencyCode) {
		this.purchaseCurrencyCode = purchaseCurrencyCode;
	}
	public String getPurchaseTerminalCode() {
		return purchaseTerminalCode;
	}
	public void setPurchaseTerminalCode(String purchaseTerminalCode) {
		this.purchaseTerminalCode = purchaseTerminalCode;
	}
	public String getPurchasePlanId() {
		return purchasePlanId;
	}
	public void setPurchasePlanId(String purchasePlanId) {
		this.purchasePlanId = purchasePlanId;
	}
	public String getPurchaseQuotaId() {
		return purchaseQuotaId;
	}
	public void setPurchaseQuotaId(String purchaseQuotaId) {
		this.purchaseQuotaId = purchaseQuotaId;
	}
	public String getPurchaseShippingCharges() {
		return purchaseShippingCharges;
	}
	public void setPurchaseShippingCharges(String purchaseShippingCharges) {
		this.purchaseShippingCharges = purchaseShippingCharges;
	}
	public String getPurchaseShipperCode() {
		return purchaseShipperCode;
	}
	public void setPurchaseShipperCode(String purchaseShipperCode) {
		this.purchaseShipperCode = purchaseShipperCode;
	}
	public String getPurchaseIva() {
		return purchaseIva;
	}
	public void setPurchaseIva(String purchaseIva) {
		this.purchaseIva = purchaseIva;
	}
	public String getPurchaseIvaReturn() {
		return purchaseIvaReturn;
	}
	public void setPurchaseIvaReturn(String purchaseIvaReturn) {
		this.purchaseIvaReturn = purchaseIvaReturn;
	}
	public String getPurchaseLanguage() {
		return purchaseLanguage;
	}
	public void setPurchaseLanguage(String purchaseLanguage) {
		this.purchaseLanguage = purchaseLanguage;
	}
	public String getPurchaseIpAddress() {
		return purchaseIpAddress;
	}
	public void setPurchaseIpAddress(String purchaseIpAddress) {
		this.purchaseIpAddress = purchaseIpAddress;
	}
	public String getBillingFirstName() {
		return billingFirstName;
	}
	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}
	public String getBillingLastName() {
		return billingLastName;
	}
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}
	public String getBillingCountry() {
		return billingCountry;
	}
	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingState() {
		return billingState;
	}
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}
	public String getBillingPostalCode() {
		return billingPostalCode;
	}
	public void setBillingPostalCode(String billingPostalCode) {
		this.billingPostalCode = billingPostalCode;
	}
	public String getBillingPhoneNumber() {
		return billingPhoneNumber;
	}
	public void setBillingPhoneNumber(String billingPhoneNumber) {
		this.billingPhoneNumber = billingPhoneNumber;
	}
	public String getBillingCelPhoneNumber() {
		return billingCelPhoneNumber;
	}
	public void setBillingCelPhoneNumber(String billingCelPhoneNumber) {
		this.billingCelPhoneNumber = billingCelPhoneNumber;
	}
	public String getBillingGender() {
		return billingGender;
	}
	public void setBillingGender(String billingGender) {
		this.billingGender = billingGender;
	}
	public String getBillingEmail() {
		return billingEmail;
	}
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	public String getBillingBirthday() {
		return billingBirthday;
	}
	public void setBillingBirthday(String billingBirthday) {
		this.billingBirthday = billingBirthday;
	}
	public String getBillingOutIdentifierCity() {
		return billingOutIdentifierCity;
	}
	public void setBillingOutIdentifierCity(String billingOutIdentifierCity) {
		this.billingOutIdentifierCity = billingOutIdentifierCity;
	}
	public String getBillingDateIdentifierDate() {
		return billingDateIdentifierDate;
	}
	public void setBillingDateIdentifierDate(String billingDateIdentifierDate) {
		this.billingDateIdentifierDate = billingDateIdentifierDate;
	}
	public String getBillingNationality() {
		return billingNationality;
	}
	public void setBillingNationality(String billingNationality) {
		this.billingNationality = billingNationality;
	}
	public String getShippingReceptionMethod() {
		return shippingReceptionMethod;
	}
	public void setShippingReceptionMethod(String shippingReceptionMethod) {
		this.shippingReceptionMethod = shippingReceptionMethod;
	}
	public String getShippingReceiverName() {
		return shippingReceiverName;
	}
	public void setShippingReceiverName(String shippingReceiverName) {
		this.shippingReceiverName = shippingReceiverName;
	}
	public String getShippingReceiverLastName() {
		return shippingReceiverLastName;
	}
	public void setShippingReceiverLastName(String shippingReceiverLastName) {
		this.shippingReceiverLastName = shippingReceiverLastName;
	}
	public String getShippingReceiverIdentifier() {
		return shippingReceiverIdentifier;
	}
	public void setShippingReceiverIdentifier(String shippingReceiverIdentifier) {
		this.shippingReceiverIdentifier = shippingReceiverIdentifier;
	}
	public String getShippingCountry() {
		return shippingCountry;
	}
	public void setShippingCountry(String shippingCountry) {
		this.shippingCountry = shippingCountry;
	}
	public String getShippingCity() {
		return shippingCity;
	}
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	public String getShippingState() {
		return shippingState;
	}
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	public String getShippingPostalCode() {
		return shippingPostalCode;
	}
	public void setShippingPostalCode(String shippingPostalCode) {
		this.shippingPostalCode = shippingPostalCode;
	}
	public String getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public List getTaxes() {
		return taxes;
	}
	public void setTaxes(List taxes) {
		this.taxes = taxes;
	}
	public List getProducts() {
		return products;
	}
	public void setProducts(List products) {
		this.products = products;
	}
	public List getFlight() {
		return flight;
	}
	public void setFlight(List flight) {
		this.flight = flight;
	}
	public List getPassenger() {
		return passenger;
	}
	public void setPassenger(List passenger) {
		this.passenger = passenger;
	}
	public List getGood() {
		return good;
	}
	public void setGood(List good) {
		this.good = good;
	}
	public List getAirport() {
		return airport;
	}
	public void setAirport(List airport) {
		this.airport = airport;
	}
	public List getAdministrativeRate() {
		return administrativeRate;
	}
	public void setAdministrativeRate(List administrativeRate) {
		this.administrativeRate = administrativeRate;
	}
	public String getTransactionTrace() {
		return transactionTrace;
	}
	public void setTransactionTrace(String transactionTrace) {
		this.transactionTrace = transactionTrace;
	}
	public String getFingerPrint() {
		return fingerPrint;
	}
	public void setFingerPrint(String fingerPrint) {
		this.fingerPrint = fingerPrint;
	}
	public String getAdditionalObservations() {
		return additionalObservations;
	}
	public void setAdditionalObservations(String additionalObservations) {
		this.additionalObservations = additionalObservations;
	}
	@Override
	public String toString() {
		return "CartEntity [acquirerId=" + acquirerId + ", commerceId=" + commerceId + ", purchaseOperationNumber="
				+ purchaseOperationNumber + ", purchaseAmount=" + purchaseAmount + ", purchaseCurrencyCode="
				+ purchaseCurrencyCode + ", purchaseTerminalCode=" + purchaseTerminalCode + ", purchasePlanId="
				+ purchasePlanId + ", purchaseQuotaId=" + purchaseQuotaId + ", purchaseShippingCharges="
				+ purchaseShippingCharges + ", purchaseShipperCode=" + purchaseShipperCode + ", purchaseIva="
				+ purchaseIva + ", purchaseIvaReturn=" + purchaseIvaReturn + ", purchaseLanguage=" + purchaseLanguage
				+ ", purchaseIpAddress=" + purchaseIpAddress + ", billingFirstName=" + billingFirstName
				+ ", billingLastName=" + billingLastName + ", billingCountry=" + billingCountry + ", billingCity="
				+ billingCity + ", billingState=" + billingState + ", billingPostalCode=" + billingPostalCode
				+ ", billingPhoneNumber=" + billingPhoneNumber + ", billingCelPhoneNumber=" + billingCelPhoneNumber
				+ ", billingGender=" + billingGender + ", billingEmail=" + billingEmail + ", billingAddress="
				+ billingAddress + ", billingBirthday=" + billingBirthday + ", billingOutIdentifierCity="
				+ billingOutIdentifierCity + ", billingDateIdentifierDate=" + billingDateIdentifierDate
				+ ", billingNationality=" + billingNationality + ", shippingReceptionMethod=" + shippingReceptionMethod
				+ ", shippingReceiverName=" + shippingReceiverName + ", shippingReceiverLastName="
				+ shippingReceiverLastName + ", shippingReceiverIdentifier=" + shippingReceiverIdentifier
				+ ", shippingCountry=" + shippingCountry + ", shippingCity=" + shippingCity + ", shippingState="
				+ shippingState + ", shippingPostalCode=" + shippingPostalCode + ", shippingAddress=" + shippingAddress
				+ ", taxes=" + taxes + ", products=" + products + ", flight=" + flight + ", passenger=" + passenger
				+ ", good=" + good + ", airport=" + airport + ", administrativeRate=" + administrativeRate
				+ ", transactionTrace=" + transactionTrace + ", fingerPrint=" + fingerPrint
				+ ", additionalObservations=" + additionalObservations + "]";
	}
  
	
	
	
}