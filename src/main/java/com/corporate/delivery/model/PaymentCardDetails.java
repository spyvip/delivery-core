package com.corporate.delivery.model;

public class PaymentCardDetails {

		private String cardNumber;
		private String cardHolderName;
		private String expiryDate;
		private String cvc;
		private String billingAddress;
		private String city;
		private String state;
		private String zip;
		
		public String getCardNumber() {
			return cardNumber;
		}
		public void setCardNumber(String cardNumber) {
			this.cardNumber = cardNumber;
		}
		public String getCardHolderName() {
			return cardHolderName;
		}
		public void setCardHolderName(String cardHolderName) {
			this.cardHolderName = cardHolderName;
		}
		public String getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(String expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getCvc() {
			return cvc;
		}
		public void setCvc(String cvc) {
			this.cvc = cvc;
		}
		public String getBillingAddress() {
			return billingAddress;
		}
		public void setBillingAddress(String billingAddress) {
			this.billingAddress = billingAddress;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getZip() {
			return zip;
		}
		public void setZip(String zip) {
			this.zip = zip;
		}
	
	
}
