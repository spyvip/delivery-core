package com.corporate.delivery.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="RESTAURANT_TIME")
public class RestaurantTime {
	 	
	    private Integer id;
	 	private Integer restId;
	 	private String day;
	 	private String startTime;
	 	private String endTime;
	   private Restaurant restaurant;
	 	
	 	
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	@Column(name = "id") 
		public Integer getId() {
			return id;
		}
	 	
	 	
		public void setId(Integer id) {
			this.id = id;
		}
		
		// @Column(name = "restId") 
	/*	public Integer getRestId() {
			return restId;
		}
		
		public void setRestId(Integer restId) {
			this.restId = restId;
		}*/
		
		@Column(name = "day") 
		public String getDay() {
			return day;
		}
		
		public void setDay(String day) {
			this.day = day;
		}
		
		
		@Column(name = "start_time")
		public String getStartTime() {
			return startTime;
		}
		
		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}
		
		@Column(name = "end_time")
		public String getEndTime() {
			return endTime;
		}
		
		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

	 	@ManyToOne(fetch=FetchType.EAGER)
	    @JoinColumn(name="restId", nullable=false)
		public Restaurant getRestaurant() {
			return restaurant;
		}


		public void setRestaurant(Restaurant restaurant) {
			this.restaurant = restaurant;
		}
	 			
}
