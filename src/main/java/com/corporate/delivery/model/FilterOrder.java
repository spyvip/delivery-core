package com.corporate.delivery.model;

public class FilterOrder {
	
		
		private String userType;
		private String orderType;
		
		private String fromdate;
		private String todate;
		public String getUserType() {
			return userType;
		}
		public void setUserType(String userType) {
			this.userType = userType;
		}
		public String getOrderType() {
			return orderType;
		}
		public void setOrderType(String orderType) {
			this.orderType = orderType;
		}
		public String getFromdate() {
			return fromdate;
		}
		public void setFromdate(String fromdate) {
			this.fromdate = fromdate;
		}
		public String getTodate() {
			return todate;
		}
		public void setTodate(String todate) {
			this.todate = todate;
		}
		
}