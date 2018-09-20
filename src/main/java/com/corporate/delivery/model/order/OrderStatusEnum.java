package com.corporate.delivery.model.order;

public enum OrderStatusEnum {
		NEW("New"),
		OPEN("Open"),
		READY("Ready"),
		DELIVERED("Delevered");
	
		private String value;
	
	
		OrderStatusEnum(String value) {
			this.value = value;
		}


		public String getValue() {
			return value;
		}
}
